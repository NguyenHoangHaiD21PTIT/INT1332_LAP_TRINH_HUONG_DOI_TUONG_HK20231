import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class PhuHo{
    private String name, birth, id, xeploai;
    private double lt, th;
    private double thuong, tong;
    private long tongfinal;
    private int tuoi;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public PhuHo(int p, String name, String birth, double lt, double th){
        this.id = "PH" + String.format("%02d", p);
        this.name = chuanhoa2(name);
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
        return this.id + " " + this.name + this.tuoi + " " + this.tongfinal + " " + this.xeploai;
    }
}
public class J07053_XET_TUYEN {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner (new File("XETTUYEN.in"));
            int n = sc.nextInt();
            PhuHo []a = new PhuHo[n];
            for(int i = 0;i<n;i++){
                sc.nextLine();
                a[i] = new PhuHo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            }
            for(PhuHo x: a) System.out.println(x);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
} 