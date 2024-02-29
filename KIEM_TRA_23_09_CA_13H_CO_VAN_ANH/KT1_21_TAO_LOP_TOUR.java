import java.util.*;
import java.io.*;
class Tour{
    private String id, tu, den;
    private int nguoi;
    private double gia, thanhtien;
    public Tour(int x, String tu, String den, int nguoi, double gia){
        this.id = String.format("%03d", x);
        this.tu = tu;
        this.den = den;
        this.nguoi = nguoi;
        this.gia = gia;
        if(this.nguoi < 5){
            this.thanhtien = this.nguoi * this.gia;
        } else if (this.nguoi >= 5 && this.nguoi <=10){
            this.thanhtien = this.nguoi * this.gia * 90.0/100.0;
        } else {
            this.thanhtien = this.nguoi * this.gia * 80.0/100.0;
        }
    }
    public String toString(){
        return this.tu + "-" + this.den + "*" + this.id + " " + this.nguoi + " " + String.format("%.1f %.1f", this.gia, this.thanhtien);
    }
}
public class KT1_21_TAO_LOP_TOUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Tour []a = new Tour[n];
        for(int i = 0;i<n;i++){
            a[i] = new Tour(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        for(Tour x: a) System.out.println(x);
    }
}
