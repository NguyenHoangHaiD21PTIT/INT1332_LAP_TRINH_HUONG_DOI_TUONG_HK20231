/*import java.util.*;
import java.io.*;
class NhomHP implements Comparable<NhomHP>{
    private String maNhom, maMon, tenGV, phong;
    private int ngayGiang, kip;
    public NhomHP(int x, String maMon, int ngayGiang, int kip, String tenGV, String phong) {
        this.maNhom = String.format("HP%03d", x);
        this.maMon = maMon;
        this.tenGV = tenGV;
        this.phong = phong;
        this.ngayGiang = ngayGiang;
        this.kip = kip;
    }
    @Override
    public int compareTo(NhomHP t) {
        if(this.ngayGiang!=t.ngayGiang) return this.ngayGiang - t.ngayGiang;
        if(this.kip!=t.kip) return this.kip - t.kip;
        return this.tenGV.compareTo(t.tenGV);
    }
    public String toString(){
        return this.maNhom + " " + this.ngayGiang + " " + this.kip + " " + this.tenGV + " " + this.phong;
    }
    public String getMaMon(){
        return this.maMon;
    }
}
public class J07074_LICH_GIANG_DAY_THEO_MON_HOC {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp = new HashMap<>();
        while(n-- >0){
            String id = sc.nextLine(), name = sc.nextLine(), tc = sc.nextLine();
            mp.put(id, name);
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = sc.nextInt();
        sc.nextLine();
        NhomHP []a = new NhomHP[m];
        for(int i = 0;i<m;i++){
            a[i] = new NhomHP(i + 1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        String s = sc.next();
        System.out.println("LICH GIANG DAY MON " + mp.get(s) + ":");
        for(NhomHP x: a){
            if(x.getMaMon().equals(s)) System.out.println(x);
        }
    }
}*/
