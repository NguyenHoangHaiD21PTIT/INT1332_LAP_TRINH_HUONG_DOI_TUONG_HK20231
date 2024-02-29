import java.util.*;
import java.io.*;
class DienLanh{
    private String id, name;
    private long sl, dongia, chietkhau, tong;
    public DienLanh(String id, String name, long sl, long dongia, long chietkhau){
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tong = this.dongia * this.sl - this.chietkhau;
    }
    public long gettong(){
        return this.tong;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.sl + " " + this.dongia + " " + this.chietkhau + " " + this.tong;
    }
}
public class J05012_TINH_TIEN {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        DienLanh []a = new DienLanh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new DienLanh(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<DienLanh>(){
            public int compare(DienLanh a, DienLanh b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(DienLanh x: a) System.out.println(x);
    }
}
