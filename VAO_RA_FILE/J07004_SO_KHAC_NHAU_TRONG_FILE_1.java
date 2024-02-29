import java.io.*;
import java.util.*;
public class J07004_SO_KHAC_NHAU_TRONG_FILE_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in")); 
        TreeMap<Long, Integer>mp = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            long x = Long.parseLong(s);
            if(mp.containsKey(x)){
                int freq = mp .get(x);
                freq++;
                mp.put(x, freq);
            } else {
                mp.put(x, 1);
            }
        }
        Set<Map.Entry<Long, Integer>>entrySet = mp.entrySet();
        for (Map.Entry<Long, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }  
    }
}
