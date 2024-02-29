package VAO_RA_FILE;
import java.io.*;
import java.util.*;
public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner (new File("DATA.in"));
        ArrayList<String>v = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int t = Integer.parseInt(s);
            } catch (NumberFormatException e){
                v.add(s);
            }
        }
        Collections.sort(v);
        for(String x: v) System.out.print(x + " ");
    }
}

