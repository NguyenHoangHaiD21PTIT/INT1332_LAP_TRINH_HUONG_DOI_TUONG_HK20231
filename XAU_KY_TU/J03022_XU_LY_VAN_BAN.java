package XAU_KY_TU;
import java.util.*;
import java.io.*;
public class J03022_XU_LY_VAN_BAN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){ 
            String tmp = sc.next();
            s+=tmp + " ";
        }
        s = s.replace('?', '.');
        s = s.replace('!', '.');
        s = s.replace(". ", ".");
        s = s.replace(" . ", ".");
        s = s.replace(" .", ".");
        String []a = s.trim().split("\\.");
        for(String x: a) System.out.println(Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase());
    }
}
