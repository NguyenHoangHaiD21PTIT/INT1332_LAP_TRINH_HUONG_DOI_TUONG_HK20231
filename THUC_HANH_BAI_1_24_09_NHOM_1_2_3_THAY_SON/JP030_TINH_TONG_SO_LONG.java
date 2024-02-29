import java.util.*;
import java.io.*;
public class JP030_TINH_TONG_SO_LONG{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while(sc.hasNext()){
            try{
                long x = Long.parseLong(sc.next());
                if(x >Integer.MAX_VALUE) tong+=x;
            } catch (Exception e){
            }
        }
        System.out.println(tong);
    }
}
