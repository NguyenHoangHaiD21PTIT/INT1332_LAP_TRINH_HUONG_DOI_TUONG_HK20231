/*import java.util.*;
import java.io.*;
class CanBo{
    private String id, name, chucvu;
    private double luongcb, ngay, luongchinh, phucap, tamung, conlai;
    public CanBo(int x, String name, String chucvu, double luongcb, double ngay){
        this.id = "NV" + String.format("%02d", x);
        this.name = name;
        this.chucvu = chucvu;
        this.luongcb = luongcb;
        this.ngay = ngay;
        this.luongchinh = this.luongcb * this.ngay;
        if(this.chucvu.equals("GD")){
            this.phucap = 500; 
        } else if(this.chucvu.equals("PGD")){
            this.phucap = 400; 
        } else if(this.chucvu.equals("TP")){
            this.phucap = 300; 
        } else if(this.chucvu.equals("KT")){
            this.phucap = 250; 
        } else {
            this.phucap = 100;
        }
        if(((this.luongchinh + this.phucap) * 2.0/3.0) < 25000){
            this.tamung = Math.round(((this.luongchinh + this.phucap) * 2.0/3.0)/1000) * 1000;
        } else {
            this.tamung = 25000;
        }
        this.conlai = this.luongchinh + this.phucap - this.tamung;
    }
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.0f %.0f %.0f %.0f", this.phucap, this.luongchinh, this.tamung, this.conlai);
    }
}
public class J05043_TINH_THU_NHAP_CHO_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CanBo []a = new CanBo[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new CanBo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        for(CanBo x: a) System.out.println(x);
    }
}*/
