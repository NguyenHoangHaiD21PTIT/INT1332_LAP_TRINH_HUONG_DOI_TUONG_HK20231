import java.util.*;
import java.io.*;
class DiemThi implements Comparable<DiemThi>{
    private String msv, maMon, ten, lop, diem;
    public DiemThi(String msv, String maMon, String diem) {
        this.msv = msv;
        this.maMon = maMon;
        this.diem = diem;
    }
    @Override
    public int compareTo(DiemThi t) {
        if(this.maMon!=t.maMon) return this.maMon.compareTo(t.maMon);
        return this.msv.compareTo(t.msv);
    }
    public void solve(String ten, String lop){
        this.ten = ten;
        this.lop = lop;
    }
    public String getMaMon() {
        return maMon;
    }
    public String getDiem() {
        return diem;
    }
    public String getMsv() {
        return msv;
    }
    public String getLop() {
        return lop;
    }   
    public String toString(){
        return this.msv + " " + this.ten + " " + this.maMon;
    }
}
class Sinhvien{
    private String msv, ten, lop, mail;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public Sinhvien(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = chuanhoa2(ten).trim();
        this.lop = lop;
        this.mail = mail;
    }
    public String getTen() {
        return ten;
    }
    public String getLop() {
        return lop;
    }
    public String getMsv() {
        return msv;
    }    
}
public class J07036_BANG_DIEM_THEO_LOP {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        Sinhvien []a = new Sinhvien[n];
        sc.nextLine();
        for(int i = 0;i<n;i++){
            a[i] = new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp = new HashMap<>();
        for(int i = 0;i<m;i++){
            String id = sc.nextLine(), name = sc.nextLine(), tc = sc.nextLine();
            mp.put(id, name);
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int p = sc.nextInt();
        DiemThi []b = new DiemThi[p];
        for(int i = 0;i<p;i++){
            sc.nextLine();
            b[i] = new DiemThi(sc.next(), sc.next(), sc.next());
        }
        Arrays.sort(b);
        for(DiemThi x: b){
            for(Sinhvien y: a){
                if(x.getMsv().equals(y.getMsv())){
                    x.solve(y.getTen(), y.getLop());
                    break;
                }
            }
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            System.out.println("BANG DIEM lop " + s + ":");
            for(DiemThi x: b){
                if(x.getLop().equals(s)){
                    System.out.println(x + " " + mp.get(x.getMaMon()) + " " + x.getDiem());
                }
            }
        }
    }
} 
