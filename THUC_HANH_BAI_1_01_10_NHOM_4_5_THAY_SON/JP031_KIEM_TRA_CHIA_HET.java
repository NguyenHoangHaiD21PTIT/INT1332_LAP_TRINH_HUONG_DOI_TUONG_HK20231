package THUC_HANH_1_01_10;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class JP031_KIEM_TRA_CHIA_HET {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("SONGUYEN.IN"));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            BigInteger a = new BigInteger(s);
            String x = "7", y = "13";
            BigInteger b = new BigInteger(x), c = new BigInteger(y);
            BigInteger tmp1 = a.mod(b), tmp2 = a.mod(c);
            if(tmp1.equals(BigInteger.ZERO)&&tmp2.equals(BigInteger.ZERO)){
                System.out.println("Both");
            } else if (tmp1.equals(BigInteger.ZERO)){
                System.out.println("Div 7");
            } else if (tmp2.equals(BigInteger.ZERO)){
                System.out.println("Div 13");
            } else {
                System.out.println("None");
            }
        }
    }
}
