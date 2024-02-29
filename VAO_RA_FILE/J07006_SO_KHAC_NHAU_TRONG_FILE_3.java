import java.util.*;
import java.io.*;
public class J07006_SO_KHAC_NHAU_TRONG_FILE_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream FileIS = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(FileIS);
        ArrayList<Integer> a = (ArrayList<Integer>) is.readObject();
        int []cnt = new int [1005];
        for(int x: a) cnt[x]++;
        for(int i = 0;i<1000;i++){
            if(cnt[i]!=0) System.out.println(i + " " + cnt[i]);
        }
    }
}
