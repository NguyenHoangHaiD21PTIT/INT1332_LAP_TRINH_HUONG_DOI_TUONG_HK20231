package THUC_HANH_1_01_10;
import java.util.*;
public class TNTest03_TANG_DAN_GIAM_DAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            ArrayList<Integer>chan = new ArrayList<>();
            ArrayList<Integer>le = new ArrayList<>();
            HashSet<Integer>hs = new HashSet<>();
            while(n-- >0){
                int x = sc.nextInt();
                hs.add(x);
            }
            for(int x: hs){
                if(x%2==0) chan.add(x);
                else le.add(x);
            }
            Collections.sort(chan);
            Collections.sort(le);
            for(int x: chan) System.out.print(x + " ");
            System.out.println();
            for(int x: le) System.out.print(x +" ");
            System.out.println();
        }
    }
}
