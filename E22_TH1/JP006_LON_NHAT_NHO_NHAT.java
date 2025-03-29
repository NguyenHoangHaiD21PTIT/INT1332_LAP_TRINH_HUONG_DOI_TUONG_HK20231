import java.io.*;
import java.util.*;
public class JP006_LON_NHAT_NHO_NHAT {
    public static void main(String[] args){
        long maxVal = Long.MIN_VALUE, minVal = Long.MAX_VALUE;
        while (sc.hasNextLong()) {
            long x = sc.nextLong();
            if (x > maxVal) maxVal = x;
            if (x < minVal) minVal = x;
        }
        System.out.println(maxVal + " " + minVal);        
    }
}
