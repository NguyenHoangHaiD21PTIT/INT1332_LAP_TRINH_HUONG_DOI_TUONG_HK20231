/*package VAO_RA_FILE;
import java.util.*;
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
        return this.maNhom + " " + this.maMon + " " + this.ngayGiang + " " + this.kip + " " + this.phong;
    }
    //Lấy tên GV để đối chiếu với truy vấn
    public String getTenGV(){
        return this.tenGV;
    }
    //Thay mã môn thành tên môn (Khi in)
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    //Lấy mã môn từ ds lớp để từ đó truy ra tên môn
    public String getMaMon() {
        return maMon;
    }
    
}
public class J07075_LICH_GIANG_DAY_THEO_GIANG_VIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            String id = sc.nextLine().trim(), name = sc.nextLine(), tc = sc.nextLine();
            //Key là mã môn, value là tên môn
            mp.put(id.trim(), name.trim());
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = sc.nextInt();
        sc.nextLine();
        NhomHP []a = new NhomHP[m];
        for(int i = 0;i<m;i++){
            a[i] = new NhomHP(i + 1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            //Thay mã môn thành tên môn để tí nữa in
            a[i].setMaMon(mp.get(a[i].getMaMon()));
        }
        Arrays.sort(a);
        String s = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for(NhomHP x: a){
            if(x.getTenGV().equals(s)) System.out.println(x);
        }
    }
}*/
