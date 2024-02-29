import java.util.*;
public class J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien []a = new NhanVien[n];
        for(int i = 0;i<n;i++){
            a[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(NhanVien x: a) System.out.println(x);
    }
}
