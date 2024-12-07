import java.util.*;
public class JKT057_XANH_TRANG_DO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int cntx = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == 'X') cntx++;
        }
        int res = 0;
        char[] arr = a.toCharArray();
        for (int i = 0; i < cntx; i++) {
            if (arr[i] == 'T') {
                for (int j = cntx; j < n; j++) {
                    if (arr[j] == 'X') {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        res++;
                        break;
                    }
                }
            } else if (arr[i] == 'D') {
                for (int j = n - 1; j > i; j--) {
                    if (arr[j] == 'X') {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        res++;
                        break;
                    }
                }
            }
        }
        for (int i = cntx; i < n; i++) {
            if (arr[i] == 'D') {
                for (int j = n - 1; j > i; j--) {
                    if (arr[j] == 'T') {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
