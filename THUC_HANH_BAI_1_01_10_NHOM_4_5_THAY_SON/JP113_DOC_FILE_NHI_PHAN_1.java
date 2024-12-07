import java.io.*;
import java.util.*;
public class JP113_DOC_FILE_NHI_PHAN_1 {
    static int []nt = new int[1000005];//Bằng 0 là SNT và ngược lại
    public static void sang(){
        nt[1] = nt[0] = 1;
        for(int i = 2;i<=(int)Math.sqrt(1000000);i++){
            if(nt[i]==0){
                for(int j = i* i; j<=1000000;j+=i) nt[j] = 1;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sang();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer>a = (ArrayList<Integer>)in.readObject();
        TreeSet<Integer>ts = new TreeSet<>();
        for(int x: a){
            if(nt[x]==0 && x >=100) ts.add(x);
        }
        for(int x: ts) System.out.println(x); 
    }
}
