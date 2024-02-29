import java.util.*;
class ThoiGian{
    private int gio, phut, giay, tong;
    public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
        this.tong = this.gio * 3600 + this.phut* 60 + this.giay;
    }
    public int gettong(){
        return this.tong;
    }
    public String toString(){
        return this.gio + " " + this.phut + " " + this.giay;
    }
}
public class J05033_SAP_XEP_THOI_GIAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ThoiGian []a = new ThoiGian[n];
        for(int i = 0;i<n;i++){
            a[i] = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian a, ThoiGian b){
                return a.gettong() - b.gettong();
            }
        });
        for(ThoiGian x: a) System.out.println(x);
    }
}
