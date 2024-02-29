import java.util.*;
import java.io.*;
public class J07015_SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN {
    public static int checknt(int n){
        if(n<=1) return 0;
        for(int i = 2;i<=(int)Math.sqrt(n);i++){
           if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream FileIS = new FileInputStream("SONGUYEN.in");
        ObjectInputStream is = new ObjectInputStream(FileIS);
        ArrayList<Integer> a = (ArrayList<Integer>) is.readObject();
        int []cnt  = new int [10005];
        for(int x: a){
            if(checknt(x)==1) cnt[x]++;
        }
        for(int i = 2;i<=9999;i++){
            if(cnt[i]!=0) System.out.println(i + " " + cnt[i]);
        }  
    }
}
