/*import java.util.*;
import java.io.*;
class Subject{
    private String ma, ten, hinhthuc;
    public Subject(String ma, String ten, String hinhthuc){
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    public String toString(){
        return this.ma + " " + this.ten+ " " + this.hinhthuc;
    }
    public String getma(){
        return this.ma;
    }
}
public class JP116_DANH_SACH_MON_THI_2{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("MONHOC.in"));
        HashSet<String>s = new HashSet<>();
        ArrayList<Subject>a = new ArrayList<>();
        while(sc.hasNextLine()){
            Subject x = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!s.contains(x.getma())) a.add(x);
            s.add(x.getma());
        }
        Collections.sort(a, new Comparator<Subject>(){
            public int compare (Subject a, Subject b){
                return a.getma().compareTo(b.getma());
            }
        });
        for(Subject x: a) System.out.println(x);
    }
}*/
