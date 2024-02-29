import java.io.*;
import java.util.*;

public class J07011_THONG_KE_TU_KHAC_NHAU_CACH2 {
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
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("VANBAN.in")); // Đọc từ file VANBAN.in
            int t = sc.nextInt();
            sc.nextLine();
            LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
            ArrayList<String> a = new ArrayList<>();
            while (t-- > 0) {
                String s = sc.nextLine();
                String s1 = change(s);
                //Tập các token tách theo dấu cách
                String[] tmp = s1.trim().split("\\s+");
                for (String x1 : tmp) {
                    if (checkWord(x1) == 1) {//Thỏa mãn thì viết thường và nhét vào map
                        String x = x1.toLowerCase();
                        if (mp.containsKey(x)) {//Có rối thì tăng tần suất thôi, không thêm nữa
                            int freq = mp.get(x);
                            freq++;
                            mp.put(x, freq);
                        } else { //Chưa có thì thêm vào
                            mp.put(x, 1);
                            a.add(x);
                        }
                    }
                }
            }

            Collections.sort(a, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    if (mp.get(s1) != mp.get(s2)) {
                        return mp.get(s2) - mp.get(s1);
                    }
                    return s1.compareTo(s2);
                }
            });

            for (String x : a) {
                System.out.println(x + " " + mp.get(x));
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}