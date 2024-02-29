import java.util.Scanner;
public class J01011_BOI_SO_CHUNG_UOC_SO_CHUNG {
    public static long UCLN (long a, long b){
        long res = 0;
        while(b!=0){
            res = a%b;
            a = b;
            b = res;
        }
        return a;
    }
    public static long BCNN(long a, long b){
        return (a * b)/UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.print(BCNN(a, b) + " " + UCLN(a, b));    
            System.out.println();
        }
    }
}
