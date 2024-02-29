import java.util.*;
import java.io.*;
class WordSet {
    private TreeSet<String> ts;
    WordSet(String file) throws FileNotFoundException {
        Scanner ip = new Scanner(new File(file));
        this.ts = new TreeSet<>();
        while(ip.hasNext()) {
            this.ts.add(ip.next().toLowerCase());
        }
    }
    public TreeSet getTs() {
        return this.ts;
    }
    public String union(WordSet s) {
        TreeSet<String> y = s.getTs();
        TreeSet<String> x = new TreeSet<>();
        for(String str : this.ts)
            x.add(str);
        for(String str : y)
            x.add(str);
        String res = "";
        for(String str : x)
            res += str + " ";
        return res;
    }
    public String intersection(WordSet s) {
        TreeSet<String> x = new TreeSet<>();
        TreeSet<String> y = s.getTs();
        for(String str : this.ts)
            if(y.contains(str))
                x.add(str);
        String res = "";
        for(String str : x)
            res += str + " ";
        return res;
    }
}
public class J07014_HOP_VA_GIAO_CUA_HAI_TAP_TU {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("C:\\Users\\Admin\\OneDrive\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA1.in");
        WordSet s2 = new WordSet("C:\\Users\\Admin\\OneDrive\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
