import java.util.*;
import java.io.*;
class Pair<T1, T2>{
    public static boolean checknt(int x){
        if(x <=1) return false;
        for(int i = 2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    private T1 fisrt;
    private T2 second;
    public Pair(T1 first, T2 second){
        this.fisrt = first;
        this.second = second;
    }
    public boolean isPrime(){
        return checknt((Integer)this.fisrt) && checknt((Integer)this.second);
    }
    public String toString(){
        return this.fisrt + " " + this.second;
    }
}
public class J07017_LOP_PAIR_generic {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
