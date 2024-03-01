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
    public String getmsv(){
        return this.msv;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.sdt + " " + this.nhom;
    }
}
public class J06004_QUAN_LY_BAI_TAP_NHOM_2 {
    public static void main(String[] args){
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
        Arrays.sort(a, new Comparator<ThanhVien>(){
            public int compare(ThanhVien a, ThanhVien b){
                return a.getmsv().compareTo(b.getmsv());
            }
        });
        for(ThanhVien x: a) System.out.println(x + " " + mp.get(x.getnhom()));
    }
} 
