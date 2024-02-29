package XAU_KY_TU;
import java.util.*;
/*
tigersugar
a 10
*/
public class BAI_19_MAT_KHAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//xâu đề cho
        String x = sc.next();//chữ cái
        int y = sc.nextInt();//trọng số
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int index = tmp.indexOf(x);//vị trí ban đầu chữ cái đó
        HashMap<String, Integer>mp  =new HashMap<>();
        mp.put(x, y);
        for(int i = index + 1;i<=25;i++){ 
            String a = Character.toString(tmp.charAt(i - 1));
            String b = Character.toString(tmp.charAt(i));
            mp.put(b, (mp.get(a) + 1)%26);
        }
        for(int i = index - 1;i>=0;i--){ 
            String a = Character.toString(tmp.charAt(i + 1));
            String b = Character.toString(tmp.charAt(i));
            mp.put(b, mp.get(a) - 1);
            if(mp.get(b)<0) mp.put(b, mp.get(b) + 26);
        }
        int ans = 0;
        for(char x1: s.toCharArray()) ans+=mp.get(Character.toString(x1));
        System.out.println(ans);
    }
}
