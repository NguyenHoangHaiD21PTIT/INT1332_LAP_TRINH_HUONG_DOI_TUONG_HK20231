import java.util.*;
class PhuHo{
    private String name, birth, id, xeploai;
    private double lt, th;
    private double thuong, tong;
    private long tongfinal;
    private int tuoi;
    public PhuHo(int p, String name, String birth, double lt, double th){
        this.id = "PH" + String.format("%02d", p);
        this.name = name;
        this.birth = birth;
        this.lt = lt;
        this.th = th;
        if(this.lt >=8 && this.th >=8){
            this.thuong = 1.0;
        } else if (this.lt >=7.5 && this.th >=7.5){
            this.thuong = 0.5;
        } else {
            this.thuong = 0;
        }
        this.tong = (this.lt + this.th)/2.0 + this.thuong;
        long x = Math.round(this.tong);
        if (x>10) x=10;
        this.tongfinal = x;
        if(x<5){
            this.xeploai = "Truot";
        } else if (x==5||x==6){
            this.xeploai = "Trung binh";
        } else if (x==7){
            this.xeploai = "Kha";
        } else if (x==8){
            this.xeploai = "Gioi";
        } else {
            this.xeploai = "Xuat sac";
        }
        String []a = this.birth.split("/");
        this.tuoi = 2021 - Integer.parseInt(a[2]);
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.tuoi + " " + this.tongfinal + " " + this.xeploai;
    }
}
public class J05060_KET_QUA_XET_TUYEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhuHo []a = new PhuHo[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new PhuHo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        for(PhuHo x: a) System.out.println(x);
    }
}
