import java.util.Scanner;
public class J01026_SO_CHINH_PHUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            double res = Math.sqrt(n);
            int res1 = (int) res;
            if (res ==  res1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}