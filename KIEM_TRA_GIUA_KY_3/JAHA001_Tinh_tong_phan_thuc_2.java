package KIEM_TRA_GIUA_KY_3;
import java.util.Scanner;
public class JAHA001_Tinh_tong_phan_thuc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            int n = Integer.parseInt(sc.nextLine());
            double tong = 0.0;
            if (n % 2 != 0) {
                for (int i = 1; i <= n; i += 2) {
                    if ((i / 2) % 2 == 0) tong += 1.0 / i;
                    else tong -= 1.0 / i;
                }
            } else {
                for (int i = 2; i <= n; i += 2) {
                    if ((i / 2) % 2 != 0) tong += 1.0 / i; 
                    else tong -= 1.0 / i;
                }
            }
            System.out.printf("%.5f%n", tong);
        }
    }
}
