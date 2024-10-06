package E22_TH1;
import java.util.*;
public class JP017_DANH_DAU_SAN_PHAM_LOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[100005];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            a[x] = 1;
        }
        ArrayList<Integer> loi = new ArrayList<>(), khongLoi = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1) loi.add(i);
            else khongLoi.add(i);
        }
        System.out.print("Errors: ");
        printRanges(loi);
        System.out.print("Not Errors: ");
        printRanges(khongLoi);
    }
    public static void printRanges(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println();
            return;
        }
        String res = "";
        int start = list.get(0), end = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == end + 1) {
                end = list.get(i);  
            } else {
                if (start == end) res+= String.format("%d", start) + " ";
                else res+= String.format("%d-%d", start, end) + " ";
                start = list.get(i);
                end = list.get(i);
            }
        }
        res+="and ";
        if (start == end) res+= String.format("%d", start);
        else res+= String.format("%d-%d", start, end);
        System.out.println(res);
    }
}

/*
100 10
2 3 5 10 11 12 25 26 88 89
*/
