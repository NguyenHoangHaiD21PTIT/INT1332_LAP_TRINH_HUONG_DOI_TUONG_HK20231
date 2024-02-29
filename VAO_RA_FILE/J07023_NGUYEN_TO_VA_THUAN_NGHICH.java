import java.util.*;
import java.io.*;
public class J07023_NGUYEN_TO_VA_THUAN_NGHICH {
    public static int checkrev(int x){
        String s = Integer.toString(x);
        if(s.length()%2==0||s.length()==1) return 0;
        for(int i = 0;i<= s. length()/2;i++){
            char a = s.charAt(i);
            char b = s.charAt(s.length()-i-1);
            if(a!=b) return 0;
        }
        return 1;
    }
    public static int checknt(int n){
        if(n<=1) return 0;
        for(int i = 2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer>a = (ArrayList<Integer>)in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer>b = (ArrayList<Integer>)in2.readObject();
        int []cnt1 = new int[10005];
        int []cnt2 = new int[10005];
        for(int x: a){
            if(checkrev(x)==1 && checknt(x)==1) cnt1[x]++;
        }
        for(int x: b){
            if(checkrev(x)==1 && checknt(x)==1) cnt2[x]++;
        }
        for(int i = 2;i<=10000;i++){
            if(cnt1[i]!=0 && cnt2[i]!=0) System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
        }
    }
}
