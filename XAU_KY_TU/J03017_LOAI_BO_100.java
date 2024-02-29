import java.util.Scanner;

public class J03017_LOAI_BO_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            String s = sc.nextLine();
            int ans = 0; // Số ký tự bị loại bỏ
            while (s.contains("100")) {
                // Tìm vị trí đầu tiên của chuỗi "100" trong xâu s
                int index = s.indexOf("100");
                ans += 3;
                // Cắt chuỗi từ [0; index - 1] và [index+3; hết]
                s = s.substring(0, index) + s.substring(index + 3);
            }
            System.out.println(ans);
        }
    }
}