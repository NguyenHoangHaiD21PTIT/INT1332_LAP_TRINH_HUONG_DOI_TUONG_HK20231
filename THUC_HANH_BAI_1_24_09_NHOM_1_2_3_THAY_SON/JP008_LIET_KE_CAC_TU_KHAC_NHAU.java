import java.util.*;
public class JP008_LIET_KE_CAC_TU_KHAC_NHAU{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String>t1 = new TreeSet<>();
        while(n-- >0){
            String s = sc.nextLine();
            String []a = s.trim().toLowerCase().split("\\s+");
            for(String x: a) t1.add(x);
        }
        int m = sc.nextInt();
        sc.nextLine();
        TreeSet<String>t2 = new TreeSet<>();
        while(m-- >0){
            String s = sc.nextLine();
            String []a = s.trim().toLowerCase().split("\\s+");
            for(String x: a) t2.add(x);
        }
        for(String s: t1){
            if(!t2.contains(s)){
                System.out.print(s + " ");
            }
        }
        System.out.println();
        for(String s: t2){
            if(!t1.contains(s)){
                System.out.print(s + " ");
            }
        }
    }
}
