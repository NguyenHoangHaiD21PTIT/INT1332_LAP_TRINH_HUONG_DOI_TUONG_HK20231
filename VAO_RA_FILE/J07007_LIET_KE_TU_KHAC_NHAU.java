import java.util.*;
import java.io.*;
class WordSet{
    private TreeSet<String>ts;
    public WordSet(String s) throws IOException{
        ts = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            String s1 = sc.next().toLowerCase();
            this.ts.add(s1);
        }
    }
    public String toString(){
        String res = "";
        for(String x: this.ts) res+=x + "\n";
        return res;
    }
}
public class J07007_LIET_KE_TU_KHAC_NHAU {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
