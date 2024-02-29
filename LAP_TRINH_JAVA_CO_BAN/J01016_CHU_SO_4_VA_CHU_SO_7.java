import java.util.Scanner;
public class J01016_CHU_SO_4_VA_CHU_SO_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        int dem = 0;
        while(n!=0){
            if(n%10==4||n%10==7) dem++;
            n/=10;
        }
        if(dem==4||dem==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
