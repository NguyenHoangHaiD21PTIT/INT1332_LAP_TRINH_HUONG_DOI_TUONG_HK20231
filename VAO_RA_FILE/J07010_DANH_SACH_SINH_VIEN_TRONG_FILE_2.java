/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class SinhVien {
    private String msv, ten, lop, birth;
    private double gpa;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public static String chuanhoa3(String s){ //Chuẩn hóa ngày sinh
        if (s.charAt(2)!='/') s = "0" + s;
        if (s.charAt(5)!='/') s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }
    public SinhVien(int x, String ten, String lop, String birth, double gpa){
        this.msv = "B20DCCN" + String.format("%03d", x);
        this.ten = chuanhoa2(ten);
        this.lop = lop;
        this.birth = chuanhoa3(birth);
        this.gpa = gpa;
    }
    public double getgpa(){
        return this.gpa;
    }
    public String toString(){
        return this.msv + " " + this.ten + this.lop + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}
public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2 {
    public static void main(String[] args) {
        //try {
            //Scanner sc = new Scanner(new File("SV.in"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            SinhVien []a = new SinhVien[n];
            for(int i = 0;i<n;i++){
                sc.nextLine();
                a[i] = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            }
            for(SinhVien x: a) System.out.println(x);
        //} catch (FileNotFoundException e) {
            //e.printStackTrace();
        //}
    }
}  */