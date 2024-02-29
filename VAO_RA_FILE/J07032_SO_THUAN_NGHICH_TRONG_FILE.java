import java.util.*;
import java.io.*;
public class J07032_SO_THUAN_NGHICH_TRONG_FILE {
    public static int check(int x){
        String s = "" + x;
        if(s.length()%2==0||s.length()==1) return 0;
        for(int i = 0;i<= s. length()/2;i++){
            int a = s.charAt(i);
            int b = s.charAt(s.length()-i-1);
            if(a!=b) return 0;
            if(a%2==0||b%2==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer>a = (ArrayList<Integer>)in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer>b = (ArrayList<Integer>)in2.readObject();
        ArrayList<Integer>res = new ArrayList<>();
        int []cnt1 = new int[1000005]; int []cnt2 = new int[1000005];
        int cnt = 0;
        for(int x: a){
            if(check(x)==1) cnt1[x]++;
        }
        for(int x: b){
            if(check(x)==1) cnt2[x]++;
        }
        for(int i = 2;i<=1000000;i++){
            if(cnt1[i]!=0&&cnt2[i]!=0){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
                cnt++;
            }
            if(cnt==10) break;
        }
    }
}
