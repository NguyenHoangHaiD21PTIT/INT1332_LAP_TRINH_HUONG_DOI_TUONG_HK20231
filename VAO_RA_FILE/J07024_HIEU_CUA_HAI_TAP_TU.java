import java.util.*;
import java.io.*;
class WordSet{
    private TreeSet<String>ts;
    public WordSet (String fileName) throws IOException{
        ts = new TreeSet<>();
        Scanner sc = new Scanner (new File(fileName));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            this.ts.add(s);
        }
    }
    public WordSet(TreeSet<String>t){
        this.ts = t;
    }
    public WordSet difference (WordSet b){
        TreeSet<String>t = new TreeSet<>();
        for(String x: this.ts){
            if(!b.ts.contains(x)) t.add(x);
        }
        WordSet a = new WordSet(t);
        return a;
    }
    public String toString(){
        String res = "";
        for(String x: this.ts) res+=x + " ";
        return res;
    }
}
public class J07024_HIEU_CUA_HAI_TAP_TU {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
} 

