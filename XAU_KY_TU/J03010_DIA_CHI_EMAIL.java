import java.util.LinkedHashMap;
import java.util.Scanner;
public class J03010_DIA_CHI_EMAIL {
    public static String chuanhoa(String s){
        String []a = s.trim().split("\\s+");
        String res = a[a.length - 1].toLowerCase();
        for(int i = 0;i<=a.length - 2;i++) res+=Character.toLowerCase(a[i].charAt(0));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while(t-- >0){
            String s = sc.nextLine();
            String res = chuanhoa(s);
            System.out.print(res);
            if(mp.containsKey(res)){//Trong map rồi thì tần suất sau thêm sẽ >1 
                int freq = mp.get(res);
                freq++;
                System.out.print(freq);
                mp.put(res, freq);
            } else {
                mp.put(res, 1);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}
