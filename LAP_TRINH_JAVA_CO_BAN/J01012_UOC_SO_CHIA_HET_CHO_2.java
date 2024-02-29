import java.util.Scanner;
public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int dem = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // i is a divisor of n, and n/i is also a divisor of n
                    if (i % 2 == 0) dem++;
                    if ((n / i) % 2 == 0) dem++;
                    if ((n / i) == i && i % 2 == 0) dem--;
                }
            }
            System.out.println(dem);
        }
    }
}