import java.util.*;
import java.io.*;
class TSinh{
    public static double change(double a){
        if(a<=10) return a;
        return a/10.0;
    }
    private String name, id, loai;
    private double lt, th, tbc;
    public TSinh(int x, String name, double lt, double th){
        this.id = "TS" + String.format("%02d", x);
        this.name = name;
        this.lt = change(lt);
        this.th = change(th);
        this.tbc = (this.lt + this.th)/2.0;
        if(this.tbc >= 9.5){
            this.loai = "XUAT SAC";        
        } else if (this.tbc >= 8.0){
            this.loai = "DAT";
        } else if (this.tbc >= 5.0){
            this.loai = "CAN NHAC";
        } else {
            this.loai = "TRUOT";
        }
    }
    public double gettbc(){
        return this.tbc;
    }
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.2f", this.tbc) + " " + this.loai;
    }
}
public class J05013_TUYEN_DUNG {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        TSinh []a = new TSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new TSinh(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<TSinh>(){
            public int compare (TSinh a, TSinh b){
                if(a.gettbc() > b.gettbc()) return -1;
                else return 1;
            }
        });
        for(TSinh x: a) System.out.println(x);
    }
}
