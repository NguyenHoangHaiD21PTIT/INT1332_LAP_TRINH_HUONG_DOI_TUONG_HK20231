import java.util.Scanner;
import java.util.TreeSet;
public class J02006_HOP_CUA_HAI_DAY_SO_CACH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer>s = new TreeSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        while(n-- >0){
            int x = sc.nextInt();
            s.add(x);
        }
        while(m-- >0){
            int x = sc.nextInt();
            s.add(x);
        }
        for(int x: s) System.out.print(x + " ");
    }
}
