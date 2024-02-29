import java.util.*;
import java.io.*;
class DiemThi implements Comparable<DiemThi>{
    private String msv, maMon;
    private double diem;
    public DiemThi(String msv, String maMon, double diem) {
        this.msv = msv;
        this.maMon = maMon;
        this.diem = diem;
    }
    @Override
    public int compareTo(DiemThi t) {
        if(this.diem != t.diem){
            if(this.diem > t.diem) return -1;
            else return 1;
        }
        return this.msv.compareTo(t.msv);
    }
    public String getMsv() {
        return msv;
    }
    public String getMaMon() {
        return maMon;
    }
    public double getDiem() {
        return diem;
    }
}
public class J07035_BANG_DIEM_THEO_MON_HOC {
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp1 = new HashMap<>();
        while(n-- >0){
            String msv = sc.nextLine(), ten = sc.nextLine(), lop = sc.nextLine(), mail = sc.nextLine();
            mp1.put(msv, chuanhoa2(ten).trim() + " " + lop);
        }
        sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, String>mp2 = new HashMap<>();
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- >0){
            String id = sc.nextLine(), name = sc.nextLine(), tc = sc.nextLine();
            mp2.put(id, name);
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int p = sc.nextInt();
        DiemThi []a = new DiemThi[p];
        for(int i = 0;i<p;i++){
            sc.nextLine();
            a[i] = new DiemThi(sc.next(), sc.next(), sc.nextDouble());
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            System.out.println("BANG DIEM MON " + mp2.get(s) + ":");
            for(DiemThi x: a){
                if(x.getMaMon().equals(s)){
                    System.out.print(x.getMsv() + " " + mp1.get(x.getMsv()) + " ");
                    if(x.getDiem()==(int)x.getDiem()) System.out.println((int)x.getDiem());
                    else System.out.println(x.getDiem() +"");
                }
            }
        } 
    }
} 
