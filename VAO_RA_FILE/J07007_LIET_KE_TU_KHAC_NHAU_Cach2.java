import java.util.*;
import java.io.*;
public class J07007_LIET_KE_TU_KHAC_NHAU_Cach2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String>ans = new TreeSet<>();
        while(sc.hasNext()) ans.add(sc.next().toLowerCase());
        for(String x: ans)System.out.println(x);
    }
}
