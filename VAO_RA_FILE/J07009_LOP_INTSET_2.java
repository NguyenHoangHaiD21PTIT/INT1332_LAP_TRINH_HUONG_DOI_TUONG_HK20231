import java.util.*;
import java.io.*;
class IntSet{
    private TreeSet<Integer>st;
    public IntSet(int []a){
        this.st = new TreeSet<>();
        for(int x: a) st.add(x);
    }
    public IntSet intersection(IntSet b){
        IntSet res = new IntSet(new int [0]);
        for(int x: this.st){
            if(b.st.contains(x)) res.st.add(x);
        }
        return res;
    }
    public String toString(){
        String res = "";
        for(int x: this.st) res+=x + " ";
        return res;
    }
}
public class J07009_LOP_INTSET_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
