import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT {
    public static int check(String s){
        for(int i = 0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer>mp = new LinkedHashMap<>();
        int GTLN = -1;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)==1){
                GTLN = Math.max(GTLN, s.length());
                if(mp.containsKey(s)){
                    int freq = mp.get(s);
                    freq++;
                    mp.put(s, freq);
                } else {
                    mp.put(s, 1);
                }
            }
        }
        Set<Map.Entry<String, Integer>>entrySet = mp.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String s = entry.getKey();
            if (s.length()==GTLN)  System.out.println(s + " " + entry.getValue());
        }
    }
}