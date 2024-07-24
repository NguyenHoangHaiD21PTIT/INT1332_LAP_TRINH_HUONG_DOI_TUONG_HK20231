package KIEM_TRA_GIUA_KY_3;
import java.util.Scanner;
public class JavaKT02_Khoang_cach_Mahattan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            String[] s1 = sc.nextLine().trim().split("\\s+");
            if (s.length != s1.length) {
                System.out.println("INVALID");
            } else {
                double dis = 0;
                for (int i = 0; i < s.length; i++) {
                    dis += Math.abs(Integer.parseInt(s[i]) - Integer.parseInt(s1[i]));
                }
                System.out.printf("%.5f%n", dis);
            }
        }
    }
}
