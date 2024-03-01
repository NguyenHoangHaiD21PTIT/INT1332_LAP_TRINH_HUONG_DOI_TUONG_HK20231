import java.util.*;
import java.io.*;
import sun.misc.ObjectStreamClassValidator;
class ThanhVien{
    private String msv, ten, sdt;
    private int nhom;
    public ThanhVien(String msv, String ten, String sdt, int nhom){
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    public int getnhom(){
        return this.nhom;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.sdt;
    }
}
public class J06003_QUAN_LY_BAI_TAP_NHOM_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt();//n: số sinh viên, m: số nhóm
        ThanhVien []a = new ThanhVien[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new ThanhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        HashMap<Integer, String>mp = new HashMap<>();
        for(int i = 0;i<m;i++){
            String s = sc.nextLine();
            mp.put(i + 1, s);
        }
        int q = sc.nextInt();
        while(q-- >0){
            int x = sc.nextInt();
            System.out.println("DANH SACH NHOM " + x + ":");
            for(ThanhVien p: a){
                if(p.getnhom()==x) System.out.println(p);
            }
            System.out.println("Bai tap dang ky: " + mp.get(x));
        }
    }
} 
