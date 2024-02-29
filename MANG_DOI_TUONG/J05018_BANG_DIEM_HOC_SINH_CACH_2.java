import java.util.*;
import java.io.*;
class HSinh{
    private String name, id, xeploai;
    private double []a = new double[10];
    private double tbc;
    public HSinh(int x, String name, double []a){
        this.id = "HS" + String.format("%02d", x);
        this.name = name;
        this.tbc = (a[0] + a[1]) * 2.0;
        for(int i = 2;i<10;i++) this.tbc+=a[i];
        this.tbc = Math.round(this.tbc /12.0 * 10.0) / 10.0;
        if (this.tbc >= 9.0) {
            this.xeploai = "XUAT SAC";
        } else if (this.tbc >= 8.0) {
            this.xeploai = "GIOI";
        } else if (this.tbc >= 7.0) {
            this.xeploai = "KHA";
        } else if (this.tbc >= 5.0) {
            this.xeploai = "TB";
        } else {
            this.xeploai = "YEU";
        }
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.tbc + " " + this.xeploai;
    }

    public double gettb() {
        return this.tbc;
    }

    public String getid() {
        return this.id;
    }
}
public class J05018_BANG_DIEM_HOC_SINH_CACH_2{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        HSinh []a = new HSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            String s = sc.nextLine();
            double []b = new double[10];
            for(int j = 0;j<10;j++) b[j] = sc.nextDouble();
            a[i] = new HSinh(i + 1, s, b);
        }
        Arrays.sort(a, new Comparator<HSinh>(){
            public int compare(HSinh a, HSinh b){
                if(a.gettb()!=b.gettb()){
                    if(a.gettb()>b.gettb()) return -1;
                    else return 1;
                }
                return a.getid().compareTo(b.getid());
            }
        });
        for(HSinh x: a) System.out.println(x);
    }
}
