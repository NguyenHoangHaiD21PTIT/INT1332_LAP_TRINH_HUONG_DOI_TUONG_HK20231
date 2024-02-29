package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
import static java.util.Collections.max;
import static java.util.Collections.min;
public class JP211_PHEP_TOAN_CO_BAN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger>a = new ArrayList<>();
        BigInteger res = new BigInteger("0");
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            BigInteger tmp = new BigInteger(s);
            a.add(tmp);
            res = res.add(tmp);
        }
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(res);
    }
}
