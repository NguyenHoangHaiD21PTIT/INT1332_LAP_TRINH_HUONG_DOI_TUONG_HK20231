import java.util.*;
public class J01020_DAY_DU_CAC_CHU_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long tmp = n;
            if(n==0){
                System.out.println("Impossible");
                continue;
            }
            HashSet<Character>hs = new HashSet<>();
            while(true){
                String s = n +"";
                for(char x: s.toCharArray()) hs.add(x);
                if(hs.size()==10){
                    System.out.println(n);
                    break;
                }
                n+=tmp;
            }
        }
    }
}
