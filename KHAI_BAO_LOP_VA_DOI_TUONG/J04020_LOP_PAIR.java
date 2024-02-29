/*import java.util.*;
import java.io.*;
class Pair<T1, T2>{
    public static int nt(int x){
        if(x<=1) return 0;
        for(int i = 2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0) return 0;
        }
        return 1;
    }
    private T1 first; 
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        if(nt((Integer)this.first)==1 && nt((Integer)this.second)==1) return true;
        else return false;
    }
    public String toString(){
        return this.first + " " + this.second;
    }
}
public class J04020_LOP_PAIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
}*/
