import java.util.*;
public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT_CACH2 {
    public static int check(String s){
        for(int i = 0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer>mp = new LinkedHashMap<>();
        ArrayList<String>a = new ArrayList<>();
        int GTLN = -1;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)==1){
                GTLN = Math.max(GTLN, s.length());
                if(mp.containsKey(s)) mp.put(s, mp.get(s) + 1);
                else {
                    mp.put(s, 1);
                    a.add(s);
                }
            }
        }
        for(String x: a){
            if(x.length()==GTLN) System.out.println(x + " " + mp.get(x));
        }
    }
}