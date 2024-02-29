package THUC_HANH_BAI_3_05_11_NHOM_1_2_3_THAY_SON;
import java.util.*;
public class JP221_TANG_DAN_GIAM_DAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            TreeSet<Integer>chan = new TreeSet<>();
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
            for(int x: chan) System.out.print(x + " ");
            System.out.println();
            Collections.sort(le);
            for(int i = le.size() - 1;i>=0;i--) System.out.print(le.get(i) +" ");
            System.out.println();
        }
    }
}
