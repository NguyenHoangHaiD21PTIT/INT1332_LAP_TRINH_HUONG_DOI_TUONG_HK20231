import java.util.Scanner;
public class J03028_MA_HOA_DRM {
    static String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int ma(char s) {
        return (int) s - 65;
    }

    public static String rotate(String s) {
        int tmp = 0;
        for (int i = 0;i<s.length();i++) tmp += ma(s.charAt(i));
        String res = "";
        int n = s.length();
        for (int i = 0;i<n;i++) {
            res+=p.charAt((ma(s.charAt(i)) + tmp) % 26);
        }
        return res;
    }

    public static String drm(String s1, String s2) {
        int n = s1.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            res+=p.charAt((ma(s1.charAt(i)) + ma(s2.charAt(i))) % 26);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            int n = s.length() / 2;

            // Step 1: Split into two strings
            String s1 = s.substring(0, n);
            String s2 = s.substring(n);

            // Step 2: Rotate strings
            s1 = rotate(s1);
            s2 = rotate(s2);

            // Step 3: Find DRM string
            System.out.println(drm(s1, s2));
        }
    }
}
