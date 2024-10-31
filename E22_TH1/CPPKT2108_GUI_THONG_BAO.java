import java.util.*;
public class CPPKT2108_GUI_THONG_BAO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+"); 
            int length = 0; 
            for (String word : words) {
                length += word.length();
                if (length <= 100) {
                    System.out.print(word + " "); 
                    length += 1; 
                } else {
                    break; 
                }
            }
            System.out.println();
        }
    }
}
/*
2
Can cu Ke hoach giang day - hoc tap hoc ky 1 nam hoc 2021 - 2022 Can cu ket qua thi hoc ky 2 va hoc ky phu ky he nam hoc 2020 – 2021
Hoc vien Cong nghe Buu chinh Vien thong to chuc khai giang truc tuyen
*/
