/*import java.util.*;
class IntSet{
    private TreeSet<Integer>s;
    public IntSet(int []a){
        this.s = new TreeSet<>();
        for(int x: a) this.s.add(x);
    }
    public IntSet union(IntSet b){
        IntSet res = new IntSet(new int[0]);
        for(int x: this.s) res.s.add(x);
        for(int x: b.s) res.s.add(x);
        return res;
    }
    public String toString(){
        String res = "";
        for(int x: this.s) res+=x + " ";
        return res;
    }
}
public class J04021_LOP_INTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}*/
