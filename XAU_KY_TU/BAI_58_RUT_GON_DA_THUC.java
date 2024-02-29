package XAU_KY_TU;
import java.util.*;
public class BAI_58_RUT_GON_DA_THUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        String tmp = "x^+";
        while(t-- >0){ 
            String s = sc.nextLine();
            for (char x: tmp.toCharArray()) s = s.replace(x, ' ');
            String []tmp1 = s.trim().split("\\s+");
            ArrayList<Integer>a = new ArrayList<>();//lưu số mũ
            HashMap<Integer, Integer>mp = new HashMap<>();
            for(int i = 0;i<tmp1.length;i+=2){ 
                int heSo = Integer.parseInt(tmp1[i]);
                int soMu = Integer.parseInt(tmp1[i + 1]);
                if(mp.containsKey(soMu))mp.put(soMu, mp.get(soMu) + heSo);
                else{
                    mp.put(soMu, heSo);
                    a.add(soMu);
                }
            }
            Collections.sort(a);
            String res = "";
            for(int x: a) res+=(x +"") + "x^" + mp.get(x) +" + ";
            System.out.println(res.substring(0, res.length()-2));
        }
    }
}
