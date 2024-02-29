import java.util.*;
import java.io.*;
class Hoc_Sinh{
    private String ma, ten, status;
    private double toan, ly, hoa, uutien;
    private double tong, tongfinal;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public Hoc_Sinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = chuanhoa2(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(this.ma.charAt(2)=='1') this.uutien = 0.5;
        if(this.ma.charAt(2)=='2') this.uutien = 1.0;
        if(this.ma.charAt(2)=='3') this.uutien = 2.5;
        this.tong = this.toan * 2 + this.ly + this.hoa;
        this.tongfinal = this.tong + this.uutien;
    }
    public String toString(){
        String res = "";
        res+= this.ma + " " + this.ten;
        if (this.uutien == 1.0){
            res+="1 ";
        } else {
            res+=String.format("%.1f", this.uutien) + " ";
        }
        if (this.tongfinal == (int)this.tongfinal){
            res+=(int)this.tongfinal + " ";
        } else {
            res+=String.format("%.1f", this.tongfinal) + " ";
        }
        res+=this.status;
        return res;
    }
    public double getfinal(){
        return this.tongfinal;
    }
    public void setstatus(String s){
        this.status = s;
    }
    public String getMa() {
        return this.ma;
    }
}
public class J05059_XAC_DINH_DANH_SACH_TRUNG_TUYEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hoc_Sinh []a = new Hoc_Sinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new Hoc_Sinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        int chitieu = sc.nextInt();
        Arrays.sort(a, new Comparator<Hoc_Sinh>(){
            public int compare(Hoc_Sinh a, Hoc_Sinh b){
                if(a.getfinal()!=b.getfinal()){
                    if(a.getfinal() > b.getfinal()) return -1;
                    else return 1;
                }
                return a.getMa().compareTo(b.getMa());
            }
        });
        double diemchuan = a[chitieu - 1].getfinal();
        System.out.printf("%.1f", diemchuan);
        System.out.println();
        for(Hoc_Sinh x: a){
            if (x.getfinal() < diemchuan) x.setstatus("TRUOT");
            else x.setstatus("TRUNG TUYEN");
        }
        for(Hoc_Sinh x: a) System.out.println(x);
    }
} 

