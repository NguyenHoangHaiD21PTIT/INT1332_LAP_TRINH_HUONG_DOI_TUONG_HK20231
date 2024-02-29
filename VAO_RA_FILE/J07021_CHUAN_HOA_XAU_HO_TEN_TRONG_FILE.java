import java.io.*;
import java.util.*;
public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static String chuanhoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in")); // Đọc từ file DATA.in
        while (true) {
            String s = sc.nextLine();
            if(s.equals("END")) break;
            String[] a = s.trim().split("\\s+");
            for (String x : a) System.out.print(chuanhoa(x) + " ");
            System.out.println();
        } 
    }
}







