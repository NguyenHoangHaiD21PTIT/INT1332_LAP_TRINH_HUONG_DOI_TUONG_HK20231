import java.util.*;
import java.io.*;
class HocSinh{
    private String ma, ten;
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
    public HocSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = chuanhoa2(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(this.ma.charAt(2)=='1'){
            this.uutien = 0.5;
        } else if (this.ma.charAt(2)=='2'){
            this.uutien = 1.0;
        } else {
            this.uutien = 2.5;
        }
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
            res+=String.format("%.1f", this.tongfinal);
        }
        return res;
    }
    public double getfinal(){
        return this.tongfinal;
    }
}
public class J07052_DANH_SACH_TRUNG_TUYEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        HocSinh []a = new HocSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HocSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        int chitieu = sc.nextInt();
        //Sắp xếp danh sách thí sinh
        Arrays.sort(a, new Comparator<HocSinh>(){
            public int compare(HocSinh a, HocSinh b){
                if(a.getfinal()>b.getfinal()) return -1;
                else return 1;
            }
        });
        double diemchuan = a[chitieu - 1].getfinal();
        System.out.printf("%.1f", diemchuan);
        System.out.println();
        for(HocSinh x: a){
            System.out.print(x);
            if(x.getfinal()<diemchuan) System.out.println("TRUOT");
            else System.out.println("TRUNG TUYEN");
        }
    }
} 
//9 9 8 8 8 8 7 7 7  6 6 6 5 5 
//7
