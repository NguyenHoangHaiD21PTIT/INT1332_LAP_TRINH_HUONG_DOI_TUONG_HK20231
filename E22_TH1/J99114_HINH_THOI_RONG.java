import java.util.*;
public class J99114_HINH_THOI_RONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int l = 1; l <= 2 * n - 1; l++) {
            int len;
            if (l <= n) len = l; 
            else len = 2 * n - l; // Tam giác dưới
            // In khoảng trắng đầu dòng
            for (int j = 1; j <= n - len; j++) System.out.print(" ");
            // In ký tự *
            for (int j = 1; j <= 2 * len - 1; j++) {
                if (j == 1 || j == 2 * len - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
