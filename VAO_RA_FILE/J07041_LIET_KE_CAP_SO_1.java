import java.util.*;
import java.io.*;
import test.Pair;
public class J07041_LIET_KE_CAP_SO_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) in.readObject();
        Collections.sort(a);
        for(Pair i : a){
            if(i.getFirst()<i.getSecond()) System.out.println(i);
        }
    }
}
