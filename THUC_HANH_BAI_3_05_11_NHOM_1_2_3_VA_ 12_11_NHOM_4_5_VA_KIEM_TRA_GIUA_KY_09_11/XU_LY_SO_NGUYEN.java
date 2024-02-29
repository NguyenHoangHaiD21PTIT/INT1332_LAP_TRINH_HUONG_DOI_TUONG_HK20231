import java.math.BigInteger;
import java.util.*;
public class XU_LY_SO_NGUYEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){ 
            String s = sc.nextLine();
            int cnt = 1000, check = 0;//check = 0: o tìm đc số chia hết cho 13 
            if(new BigInteger(s).mod(new BigInteger("13")).equals(BigInteger.ZERO)){ 
                System.out.println(s);
                continue;
            }
            while(cnt-- >0){ 
                String res = "";//Tạo xâu đảo ngược
                for(int i = s .length() - 1;i>=0;i--) res+=s.charAt(i);
                BigInteger x1 = new BigInteger(s);
                BigInteger x2 = new BigInteger(res);
                BigInteger x = x1.add(x2);
                s = x.toString();

                if(x.mod(new BigInteger("13")).equals(BigInteger.ZERO)){
                    check = 1;
                    System.out.println(s);
                    break;
                }
            }
            if(check==0) System.out.println("-1");
        }
    }
}
