import java.util.*;
import java.io.*;
class CanBo{
    private String id, name, chucvu;
    private double luongcb, ngay, luongchinh, phucap, tamung, conlai, nhan; //Nhân; số tiền nhận đc khi chưa trừ ứng
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
        this.nhan = this.luongchinh + this.phucap;
        this.conlai = this.luongchinh + this.phucap - this.tamung;
    }
    public double getnhan(){
        return this.nhan;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.0f %.0f %.0f %.0f", this.phucap, this.luongchinh, this.tamung, this.conlai);
    }
}
public class J05045_SAP_XEP_NHAN_VIEN_THEO_THU_NHAP {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CanBo []a = new CanBo[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new CanBo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<CanBo>(){
            public int compare(CanBo a, CanBo b){
                if(a.getnhan()!=b.getnhan()){
                    if(a.getnhan() > b.getnhan()) return -1;
                    else return 1;
                }
                return a.getid().compareTo(b.getid());
            }
        });
        for(CanBo x: a) System.out.println(x);
    }
}
