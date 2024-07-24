package KIEM_TRA_GIUA_KY_3;
import java.util.*;
public class JavaKT09_Tao_2_chuoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();    
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            int[] charCount = new int[256];
            for (char c : s.toCharArray()) charCount[c]++;   
            List<Character> s1List = new ArrayList<>();
            List<Character> s2List = new ArrayList<>();
            for (int i = 0; i < 256; i++) {
                if (charCount[i] == 1) s1List.add((char) i);
                else if (charCount[i] > 1) s2List.add((char) i);
            }
            Collections.sort(s1List);
            Collections.sort(s2List);
            if (s1List.isEmpty()) System.out.println("NONE");
            else {
                for (char c : s1List) System.out.print(c);
                System.out.println();
            }
            if (s2List.isEmpty()) System.out.println("NONE");
            else {
                for (char c : s2List) System.out.print(c);
                System.out.println();
            }
        }
    }
}
