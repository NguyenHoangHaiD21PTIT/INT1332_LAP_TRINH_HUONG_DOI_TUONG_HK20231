import java.util.*;
import java.io.*;
class ThayCo{
    private String id, name, mxt, status, mon;
    private double tin, chuyen, uutien, tong;
    public ThayCo(int x, String name, String mxt, double tin, double chuyen){
        this.id = "GV" + String.format("%02d", x);
        this.name = name;
        this.mxt = mxt;
        this.tin = tin;
        this.chuyen = chuyen;
        char p = this.mxt.charAt(1);
        char p1 = this.mxt.charAt(0);
        if (p == '1'){
            this.uutien = 2.0;
        } else if (p=='2'){
            this.uutien = 1.5;
        } else if (p =='3'){
            this.uutien = 1.0;
        } else {
            this.uutien = 0.0;
        }
        if(p1 == 'A'){
            this.mon = "TOAN";
        } else if (p1 == 'B'){
            this.mon = "LY";
        } else {
            this.mon = "HOA";
        }
        this.tong = this.tin * 2.0 + this.chuyen + this.uutien;
        if(this.tong >=18.0){
            this.status = "TRUNG TUYEN";
        } else {
            this.status = "LOAI";
        }
    }
    public double gettong(){
        return this.tong;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.mon + " " + String.format("%.1f", this.tong) + " " + this.status;
    }
}
public class J05014_TUYEN_GIAO_VIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThayCo []a = new ThayCo[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new ThayCo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<ThayCo>(){
            public int compare(ThayCo a, ThayCo b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }    
        });
        for(ThayCo x: a) System.out.println(x);
    }
}
