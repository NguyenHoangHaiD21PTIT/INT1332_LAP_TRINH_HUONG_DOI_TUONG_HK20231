import java.util.Scanner;
public class J02013_SAP_XEP_NOI_BOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int idx = n - i - 1;
            int check = 0;
            for (int j = 0; j < idx; j++) {
                if (a[j] > a[j + 1]) {
                    check = 1;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (check == 1) {
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int p : a) System.out.print(p + " ");
                System.out.println();
            } else {
                break;
            }
        }
    }
}
