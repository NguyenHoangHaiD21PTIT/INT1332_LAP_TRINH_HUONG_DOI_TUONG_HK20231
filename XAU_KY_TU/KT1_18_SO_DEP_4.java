import java.util.Scanner;
public class KT1_18_SO_DEP_4 {
    public static int check(char c) {
        if (c != '6' && c != '8') return 0;
        return 1;
    }
    public static boolean check1(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
            if (check(s.charAt(i)) ==0  || check(s.charAt(n - i - 1)) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check1(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
