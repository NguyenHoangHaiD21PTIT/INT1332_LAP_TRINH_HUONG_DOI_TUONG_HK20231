package XAU_KY_TU;
import java.util.*;
import java.io.*;
public class J03029_CHUAN_HOA_CAU {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine(), res = "";
            String []a = s.trim().split("\\s+");
            for(String x1: a) res+=x1 + " ";
            res = res.trim();
            res = res.replace(" ?", "?");
            res = res.replace(" .", ".");
            res = res.replace(" !", "!");
            char x = res.charAt(res.length()-1);
            if(x!='?' && x!='.' && x!='!') res+=".";
            System.out.println(Character.toUpperCase(res.charAt(0)) + res.substring(1).toLowerCase());
        }
    }
}
