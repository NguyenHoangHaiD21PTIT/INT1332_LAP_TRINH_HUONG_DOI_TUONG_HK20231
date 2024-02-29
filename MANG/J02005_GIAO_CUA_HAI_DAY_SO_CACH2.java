import java.util.Scanner;
import java.util.TreeSet;
public class J02005_GIAO_CUA_HAI_DAY_SO_CACH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer>s1 = new TreeSet<>();
        TreeSet<Integer>s2 = new TreeSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        while(n-- >0){
            int x = sc.nextInt();
            s1.add(x);
        }
        while(m-- >0){
            int x = sc.nextInt();
            s2.add(x);
        }
        for(int x: s1){
            if(s2.contains(x)) System.out.print(x + " ");
        }
    }
}
