import java.util.*;
import java.io.*;
import test.Pair;
public class J07042_LIET_KE_CAP_SO_2 {
    public static int UCLN(int a1, int b1){
        int a = a1, b = b1;
        while(b!=0){
            int res = a%b;
            a = b;
            b = res;
        }
        return a;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) in.readObject();
        Collections.sort(a);
        HashSet<Pair>s = new HashSet<>();
        for(Pair i : a){
            int x = i.getFirst();
            int y = i.getSecond();
            if(x < y && !s.contains(i) && UCLN(x, y) ==1) System.out.println(i);
            s.add(i);
        }
    }
}