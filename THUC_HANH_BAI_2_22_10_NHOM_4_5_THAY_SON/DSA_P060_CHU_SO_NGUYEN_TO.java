package THUC_HANH_BAI_2_22_10_NHOM_4_5_THAY_SON;
import java.util.*;
public class DSA_P060_CHU_SO_NGUYEN_TO {
    public static int check(String s){ 
        if(s.length() <4) return 0;
        if(s.charAt(s.length() - 1)=='2') return 0;
        HashSet<Character>hs = new HashSet<>();
        for(char x: s.toCharArray()){
            hs.add(x);
        };
        if(hs.size()==4) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String>a = new ArrayList<>();
        //Bước 1: Khởi tạo:
        String s = "2357";
        Queue<String> q = new LinkedList<>();
        for (char x: s.toCharArray()) q.add(Character.toString(x));
        //Bước 2: Lặp
        while(q.size() >0){
            String x = q.poll();
            if(x.length()==n) break;
            for (char y: s.toCharArray()){
                String x1 = x + y;
                q.add(x1);
                if(check(x1)==1) a.add(x1);
            }
        }
        //In
        for(String x: a) System.out.println(x);
    }
}
