package KIEM_TRA_04_11_CA_08H_CO_VAN_ANH;
import com.sun.pisces.AbstractSurface;
import java.util.*;
import java.io.*;
class HocSinh{
    public static String chuanhoa1 (String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){
        String []tmp = s.trim().split("\\s+");
        String res = "";
        for(String x:tmp) res+=chuanhoa1(x) + " ";
        return res.trim();
    }
    private String ten, chucVu, loai, ma;
    private double toan, van, anh, GPA, uuTien;
    public HocSinh(int x, String ten, String chucVu, double toan, double van, double anh) {
        this.ma = String.format("HS%03d", x);
        this.ten = chuanhoa2(ten);
        this.chucVu = chucVu;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        if(this.chucVu.equals("LT")) this.uuTien = 0.4;
        else if(this.chucVu.equals("LP")||this.chucVu.equals("BT")) this.uuTien = 0.2;
        else this.uuTien = 0.0;
        this.GPA = (this.toan + this.van + this.anh)/3.0 + this.uuTien;
        if(this.toan==0.0||this.van==0.0||this.anh==0.0||this.GPA<5.0){
            this.loai = "HOC LAI";
        } else if (this.toan<5.0||this.van<5.0||this.anh<5.0||(this.GPA>=5.0 && this.GPA<6.5)){
            this.loai = "Trung binh";
        } else if (this.GPA>=6.5 && this.GPA<8){
            this.loai = "Kha";
        } else {
            this.loai = "Gioi";
        }
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", this.GPA) + " " + this.loai;
    }
}
public class B_XET_LEN_LOP {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("diemthi.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        HocSinh []a = new HocSinh[n];
        for(int i = 0;i<n;i++){
            String ten = sc.nextLine(), diem = sc.nextLine(), chucvu = sc.nextLine();
            String []tmp = diem.trim().split("\\s+");
            a[i] = new HocSinh(i + 1, ten, chucvu, Double.parseDouble(tmp[0]),Double.parseDouble(tmp[1]), Double.parseDouble(tmp[2]));
        }
        for(HocSinh x: a) System.out.println(x);
    }
}
