import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07085_TONG_CHU_SO {
    public static String change (String s){
        String res = "";
        for(char x: s.toCharArray()){
            if(Character.isDigit(x)) res+=Character.toString(x);
        }
        return res;
    }
    public static int tong(String s){
        int sum = 0;
        for(char x: s.toCharArray()) sum+=(x - '0');
        return sum;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String>a = (ArrayList<String>) in.readObject();
        for(String x: a){
            String tmp = change(x);
            BigInteger z = new BigInteger(tmp);
            System.out.println(z + " " + tong(tmp));
        }
    }
}
