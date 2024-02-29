import java.io.*;
import java.util.*;
class SinhVien {
    private String msv, ten, lop, email;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public SinhVien(String msv, String ten, String lop, String email){
        this.msv = msv;
        this.ten = chuanhoa2(ten);
        this.lop = lop;
        this.email = email;
    }
    public String getmsv(){
        return this.msv;
    }
    public String toString(){
        return this.msv + " " + this.ten + this.lop + " " + this.email;
    }
}
public class J07033_DANH_SACH_SINH_VIEN_TRONG_FILE_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien []a = new SinhVien[n];
        for(int i = 0;i<n;i++){
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                return a.getmsv().compareTo(b.getmsv());
            }
        });
        for(SinhVien x: a) System.out.println(x);
    }
}  