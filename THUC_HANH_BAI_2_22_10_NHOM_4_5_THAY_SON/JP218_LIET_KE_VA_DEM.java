package THUC_HANH_BAI_2_22_10_NHOM_4_5_THAY_SON;
import java.util.*;
import java.io.*;
public class JP218_LIET_KE_VA_DEM {
    public static int check(String s){
        for(int i = 0; i <= s.length() - 2; i++){
            if(s.charAt(i) > s.charAt(i + 1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        ArrayList<String>a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s) == 1){
                if(mp.containsKey(s)){ 
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                    a.add(s);
                }
            }
        }
        Collections.sort(a, new Comparator<String>(){
            public int compare(String s1, String s2){
                return mp.get(s2) - mp.get(s1);
            }
        });
        for(String x: a) System.out.println(x + " " + mp.get(x));
    }
}
