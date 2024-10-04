package E22_TH1;
import java.math.BigInteger;
import java.util.*;
public class JP015_TACH_SO_VA_SAP_XEP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger>a = new ArrayList<>();
        while(n-- >0){
            String s = sc.nextLine();
            for(char x: s.toCharArray()){
                if(Character.isAlphabetic(x)) s = s.replace(x, ' ');
            }
            String []s1 = s.trim().split("\\s+");
            for(String x: s1) a.add(new BigInteger(x));
        }
        Collections.sort(a);
        for(BigInteger x: a){
            System.out.println(x);
        }
    }
}
