package HOC_HE_11_07_CO_VAN_ANH;
import java.util.*;
public class Chapter_01_TINH_PI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double eps = sc.nextDouble(), pi = 0.0;
            int n = 1;
            while(Math.abs(pi - Math.PI) > eps){
                pi+= (double)Math.pow(-1, n + 1) * 4.0 / (2 * n - 1);
                n++;
            }
            System.out.print(pi);
        }
    }
}
//Test??
