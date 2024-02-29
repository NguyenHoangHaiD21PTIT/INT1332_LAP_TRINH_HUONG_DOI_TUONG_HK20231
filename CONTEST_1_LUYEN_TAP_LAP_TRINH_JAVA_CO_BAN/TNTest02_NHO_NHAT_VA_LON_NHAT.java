import java.math.BigInteger;
import java.util.Scanner;
public class TNTest02_NHO_NHAT_VA_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            sc.nextLine();
            if (n==0) break;
            String Max = "0";
            String Min = "";
            for(int i = 0;i<100;i++) Min+='9';
            BigInteger x = new BigInteger(Min);//Số bé nhất gỉa sử
            BigInteger y = new BigInteger(Max);//Số to nhất gỉa sử
            while(n-- >0){
                String s = sc.nextLine();
                BigInteger z = new BigInteger(s);
                x = x.min(z);
                y = y.max(z);
            }
            if (x==y) System.out.println("BANG NHAU");
            else System.out.println(x + " " + y);
        }
    }
}
