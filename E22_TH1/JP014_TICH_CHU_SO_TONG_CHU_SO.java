import java.util.*;
public class JP014_TICH_CHU_SO_TONG_CHU_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        while(t-- >0){
            String s = sc.nextLine();
            long tong = 0, cnt = 0, tich = 1;
            for (int i = 0; i < s.length(); i++) {
                long digit = s.charAt(i) - '0';
                if (i % 2 == 1) tong += digit;  
                else {
                    if (digit != 0) {
                        cnt++;
                        tich *= digit;
                    }
                }
            }
            if (cnt > 0) System.out.print(tich + " ");
            else System.out.print("0 ");
            System.out.println(tong);
        }
    }
}
/*
3
12345678
20000
22334455667788
*/
