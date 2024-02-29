import java.util.*;
import java.io.*;
class HocPhan{
    private String id, ten, nhom, gv;
    public HocPhan(String id, String ten, String nhom, String gv){
        this.id = id;
        this.ten = ten;
        this.nhom = nhom;
        this.gv = gv;
    }
    public String getnhom(){
        return this.nhom;
    }
    public String getgv(){
        return this.gv;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.ten + " " + this.nhom;
    }
}
public class J05080_LOP_HOC_PHAN_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HocPhan []a = new HocPhan[n];
        for(int i = 0;i<n;i++){
            a[i] = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<HocPhan>(){
            public int compare(HocPhan a, HocPhan b){
                if(!a.getid().equals(b.getid())) return a.getid().compareTo(b.getid());
                return a.getnhom().compareTo(b.getnhom());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + s+":");
            for(HocPhan x: a){
                if(x.getgv().equals(s)) System.out.println(x);
            }
        }
    }
} 
