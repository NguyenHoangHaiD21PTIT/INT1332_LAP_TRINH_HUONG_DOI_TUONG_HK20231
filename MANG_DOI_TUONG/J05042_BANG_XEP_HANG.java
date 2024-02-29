import java.util.*;
class PTITer{
    private String ten;
    private int correct, submit;
    public PTITer(String ten, int correct, int submit){
        this.ten = ten;
        this.correct = correct;
        this.submit = submit;
    }
    public String getten(){
        return this.ten;
    }
    public int getcor(){
        return this.correct;
    }
    public int getsub(){
        return this.submit;
    }
    public String toString(){
        return this.ten + " " + this.correct + " " + this.submit;
    }
}
public class J05042_BANG_XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        PTITer []a = new PTITer[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new PTITer(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a, new Comparator<PTITer>(){
            public int compare(PTITer a, PTITer b){
                if(a.getcor()!=b .getcor()) return b.getcor() - a.getcor();
                if (a.getsub()!=b.getsub()) return a.getsub() - b .getsub();
                return a.getten().compareTo(b.getten());
            }
        });
        for(PTITer x: a) System.out.println(x);
    }
} 
