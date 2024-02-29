import java.util.Scanner;

public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static String chuanhoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for (String x : a) System.out.print(chuanhoa(x) + " ");
            System.out.println();
        }
    }
}






