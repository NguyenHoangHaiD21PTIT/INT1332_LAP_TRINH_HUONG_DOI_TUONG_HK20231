import java.util.*;
import java.io.*;
public class J07004_SO_KHAC_NHAU_TRONG_FILE_1_CACH_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA.in"));
        int []a = new int [2000];
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            a[x]++;
        }
        for(int i = 1;i<=1000;i++){
            if(a[i]!=0) System.out.println(i + " " + a[i]);     
        }
    }
}
