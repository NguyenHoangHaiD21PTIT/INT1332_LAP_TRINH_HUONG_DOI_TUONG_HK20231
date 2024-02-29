import java.util.*;
import java.io.*;
public class JP102_TONG_NHO_NHAT{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            long x = 0, y = 0;
            Arrays.sort(a);
            for(int i = 0;i<n;i++){
                if(i%2==0){
                    x = x * 10 + a[i];
                } else {
                    y = y * 10 + a[i];
                }
            }
            System.out.println(x + y);
        }
    }
}
