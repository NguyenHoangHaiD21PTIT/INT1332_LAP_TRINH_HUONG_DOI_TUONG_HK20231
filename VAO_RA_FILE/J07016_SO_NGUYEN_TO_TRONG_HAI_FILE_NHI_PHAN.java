import java.util.*;
import java.io.*;
public class J07016_SO_NGUYEN_TO_TRONG_HAI_FILE_NHI_PHAN {
    static int []nt = new int[10000];//Bằng 0 là SNT và ngược lại
    public static void sang(){
        nt[1] = nt[0] = 1;
        for(int i = 2;i<=(int)Math.sqrt(9999);i++){
            if(nt[i]==0){
                for(int j = i* i; j<=9999;j+=i) nt[j] = 1;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sang();
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer>a = (ArrayList<Integer>)in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer>b = (ArrayList<Integer>)in2.readObject();
        int []cnt1 = new int[10005];
        int []cnt2 = new int[10005];
        for(int x: a){
            if(nt[x]==0) cnt1[x]++;
        }
        for(int x: b){
            if(nt[x]==0) cnt2[x]++;
        }
        for(int i = 2;i<=10000;i++){
            if(cnt1[i]!=0 && cnt2[i]!=0) System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
        }
    }
}