import java.util.Scanner;
public class JP005_CHUAN_HOA_HO_TEN {
    public static String chuanhoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int q = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            //In tên trước
            int n = a.length;
            if (q == 1){
                System.out.print(chuanhoa(a[n - 1]) + " ");
                for(int i = 0;i<=n - 2;i++) System.out.print(chuanhoa(a[i]) + " ");
            } else {
                for(int i = 1;i<=n - 1;i++) System.out.print(chuanhoa(a[i]) + " ");
                System.out.print(chuanhoa(a[0]) + " ");
            }
            System.out.println();
        }
    }
}







