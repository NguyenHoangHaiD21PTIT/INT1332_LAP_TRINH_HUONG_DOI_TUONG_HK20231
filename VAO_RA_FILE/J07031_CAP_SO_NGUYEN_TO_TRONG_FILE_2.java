import java.util.*;
import java.io.*;
public class J07031_CAP_SO_NGUYEN_TO_TRONG_FILE_2 {
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
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer>a = (ArrayList<Integer>)in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer>b = (ArrayList<Integer>)in2.readObject();
        TreeSet<Integer>t1 = new TreeSet<>();
        HashMap<Integer, Integer>mp = new HashMap<>();
        for(int x: a){
            if(nt[x]==0) t1.add(x);
        }
        HashSet<Integer>t2 = new HashSet<>();
        for(int x: b){
            if(nt[x]==0) t2.add(x);
        }
        for(int x: t1){
            if(x < 500000 && !t2.contains(x)){
                if(t1.contains(1000000 - x) && !t2.contains(1000000 - x)) System.out.println(x + " " + (1000000 - x));
            }
        }
    }
}

