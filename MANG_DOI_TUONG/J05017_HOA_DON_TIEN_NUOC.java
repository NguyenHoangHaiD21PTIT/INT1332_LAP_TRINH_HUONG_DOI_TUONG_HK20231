import java.util.*;
import java.io.*;
class TienNuoc{
    private String id, name;
    private long dau, cuoi, tong;
    public TienNuoc(int x, String name, long dau, long cuoi){
        this.id = "KH" + String.format("%02d", x);
        this.name = name;
        this.dau = dau;
        this.cuoi = cuoi;
        long p = this.cuoi - this.dau;
        if(p <= 50){
            this.tong = Math.round(p * 100 * 102.0 / 100);
        } else if (p>=51 && p<=100){
            long tmp1 = 50 * 100 + (p - 50) * 150;
            this.tong = Math.round(tmp1 * 103.0/100);
        } else {
            long tmp2 = 50 * 250 + (p - 100) * 200;
            this.tong = Math.round(tmp2 * 105.0/100);
        }
    }
    public long gettong(){
        return this.tong;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.tong;
    }
}
public class J05017_HOA_DON_TIEN_NUOC {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        TienNuoc []a = new TienNuoc[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new TienNuoc(i + 1, sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<TienNuoc>(){
            public int compare(TienNuoc a, TienNuoc b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(TienNuoc x: a) System.out.println(x);
    }
}
