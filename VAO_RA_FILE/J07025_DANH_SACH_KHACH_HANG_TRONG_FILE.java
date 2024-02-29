/*import java.util.*;
import java.io.*;
class KH{
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
    private String ma, ten, gioi, nsinh, dc;
    private int ngay, thang, nam;
    public KH(int x, String ten, String gioi, String nsinh, String dc){
        this.ma = "KH" + String.format("%03d", x);
        this.ten = chuanhoa2(ten);
        this.gioi = gioi;
        this.nsinh = chuanhoa3(nsinh);
        this.dc = dc;
        String []a = this.nsinh.split("/");
        this.ngay = Integer.parseInt(a[0]);
        this.thang = Integer.parseInt(a[1]);
        this.nam = Integer.parseInt(a[2]);
    }
    public String toString(){
        return this.ma+ " " + this.ten + this.gioi + " " + this.dc +" " + this.nsinh ;
    }
    public int getngay(){
        return this.ngay;
    }
    public int getthang(){
        return this.thang;
    }
    public int getnam(){
        return this.nam;
    }
}
public class J07025_DANH_SACH_KHACH_HANG_TRONG_FILE {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (new File("KHACHHANG.in"));
            int n = sc.nextInt();
            sc.nextLine();
            KH []a = new KH[n];
            for(int i = 0;i<n;i++){
                a[i] = new KH(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<KH>(){
                public int compare(KH a, KH b){
                    if(a.getnam()!=b .getnam()) return a.getnam() - b.getnam();
                    else if (a.getthang()!=b.getthang()) return a.getthang() - b.getthang();
                    return a.getngay() - b.getngay();
                }
            });
            for(KH x: a) System.out.println(x);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
} */
