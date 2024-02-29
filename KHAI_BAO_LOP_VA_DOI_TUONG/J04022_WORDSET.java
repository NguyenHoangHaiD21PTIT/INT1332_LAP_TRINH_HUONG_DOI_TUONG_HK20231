/*import java.util.*;
class WordSet{
    private TreeSet<String>st;
    public WordSet(String s){
        this.st = new TreeSet<>();
        String []a = s.trim().split("\\s+");
        for(String x: a) this.st.add(x.toLowerCase());
    }
    public WordSet union(WordSet b){
        WordSet res = new WordSet("");
        for(String x: this.st) res.st.add(x);
        for(String x: b.st) res.st.add(x);
        return res;
    }
    public WordSet intersection (WordSet b){
        WordSet res = new WordSet("");
        for(String x: this.st){
            if(b.st.contains(x)) res.st.add(x);
        }
        return res;
    }
    public String toString(){
        String s = "";
        for(String x: this.st) s+= x + " ";
        return s.trim();
    }
}
public class J04022_WORDSET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}*/
