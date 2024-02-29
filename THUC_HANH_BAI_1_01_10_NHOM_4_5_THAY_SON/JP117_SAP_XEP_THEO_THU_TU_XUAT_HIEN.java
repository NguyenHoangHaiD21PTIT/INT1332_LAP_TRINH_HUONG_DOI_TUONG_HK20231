package THUC_HANH_1_01_10;
import java.util.*;
public class JP117_SAP_XEP_THEO_THU_TU_XUAT_HIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            ArrayList<Integer>a = new ArrayList<>();//lưu các số khác nhau
            HashMap<Integer, Integer>mp = new HashMap<>();
            while(n-- >0){
                int x = sc.nextInt();
                if(!mp.containsKey(x)){
                    a.add(x);
                    mp.put(x, 1);
                } else {
                    mp.put(x, mp.get(x) + 1);
                }
            }
            Collections.sort(a, new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    return mp.get(b) - mp.get(a);
                }
            });
            for(int x: a){
                for(int j = 1;j<=mp.get(x);j++) System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
