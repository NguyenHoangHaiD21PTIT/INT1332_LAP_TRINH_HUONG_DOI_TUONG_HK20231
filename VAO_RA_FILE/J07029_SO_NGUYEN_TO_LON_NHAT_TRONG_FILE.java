import java.util.*;
import java.io.*;
public class J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE {
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
        FileInputStream FileIS = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(FileIS);
        ArrayList<Integer> a = (ArrayList<Integer>) is.readObject();
        ArrayList<Integer>res = new ArrayList<>();
        int []cnt = new int [1000001];
        for(int x: a){
            if(nt[x]==0){
                cnt[x]++;
            }
        }
        int dem = 0;
        for(int i = 1000000;i>=2;i--){
            if(cnt[i]!=0){
                System.out.println(i + " " + cnt[i]);
                dem++;
            }
            if(dem==10) break;
        }
    }
}