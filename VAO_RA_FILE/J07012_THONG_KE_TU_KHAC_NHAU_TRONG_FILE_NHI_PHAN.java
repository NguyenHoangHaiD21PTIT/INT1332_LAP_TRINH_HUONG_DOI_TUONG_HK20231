import java.util.*;
import java.io.*;
public class J07012_THONG_KE_TU_KHAC_NHAU_TRONG_FILE_NHI_PHAN {
    public static int check(char c) {
        if (c == ',' || c == '.' || c == '?' || c == '!' || c == ':' || c == ';' || c == '(' || c == ')' || c == '-' || c == '/') return 1;
        return 0;
    }
    
    public static int checkWord(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                return 0;
            }
        }
        return 1;
    }
    
    public static String change(String s){
        String res = "";
        for(int i = 0;i<s.length();i++){
            if(check(s.charAt(i))==1) res+=" ";
            else res+=s.charAt(i);
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String>a = (ArrayList<String>)in.readObject();
        ArrayList<String>res = new ArrayList<>();
        HashMap<String, Integer>mp = new HashMap<>();
        for(String x: a){
            String s = change(x).toLowerCase();
            String []s1 = s.trim().split("\\s+");
            for(String tmp: s1){
                if(checkWord(tmp)==1){
                    if(mp.containsKey(tmp)) mp.put(tmp, mp.get(tmp) + 1);
                    else {
                        res.add(tmp);
                        mp.put(tmp, 1);
                    }
                }
            }
        }
        Collections.sort(res, new Comparator<String>(){
            public int compare(String a, String b){
                if(mp.get(a)!=mp.get(b)) return mp.get(b) - mp.get(a);
                return a.compareTo(b);
            }
        });
        for(String x: res) System.out.println(x + " " + mp.get(x));
    }
}
