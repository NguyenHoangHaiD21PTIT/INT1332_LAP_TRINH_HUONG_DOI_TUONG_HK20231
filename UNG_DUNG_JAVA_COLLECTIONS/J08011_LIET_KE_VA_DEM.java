import java.util.*;
public class J08011_LIET_KE_VA_DEM {
    public static int check(String s){
        for(int i = 0; i <= s.length() - 2; i++){
            if(s.charAt(i) > s.charAt(i + 1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        ArrayList<String>a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s) == 1){
                if(mp.containsKey(s)){
                    int freq = mp.get(s);
                    freq++;
                    mp.put(s, freq);
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
