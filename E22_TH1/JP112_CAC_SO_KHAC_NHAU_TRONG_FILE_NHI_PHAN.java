package E22_TH1;
import java.util.*;
import java.io.*;
public class JP112_CAC_SO_KHAC_NHAU_TRONG_FILE_NHI_PHAN {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String>a = (ArrayList<String>)in.readObject();
        TreeSet<Integer>ts = new TreeSet<>();
        for (String s : a) {
            String []tmp = s.trim().split("\\s+");
            for(String x: tmp){
                try {
                    int number = Integer.parseInt(x);
                    ts.add(number); 
                } catch (NumberFormatException e) {
                }
            }   
        }
        for (int x: ts) System.out.println(x);
    }
}
