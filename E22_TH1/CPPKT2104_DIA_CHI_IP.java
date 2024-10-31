import java.util.*;
public class CPPKT2104_DIA_CHI_IP {
    public static boolean isValid(String s) {
        String[] parts = s.split("\\."); 
        if (parts.length != 4) return false; 
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part); 
                if (num < 0 || num > 255) return false;
            } catch (NumberFormatException e) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(); 
            if (isValid(s)) System.out.println("YES"); 
            else System.out.println("NO");
        }
    }
}
