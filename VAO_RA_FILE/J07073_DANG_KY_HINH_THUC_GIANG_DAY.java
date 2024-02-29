import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Subject{
    private String id, ten, tc, lt, th;
    public Subject(String id, String ten, String tc, String lt, String th){
        this.id = id;
        this.ten = ten;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }
    public String getid(){
        return this.id;
    }
    public String getth(){
        return this.th;
    }
    public String toString(){
        return this.id + " " + this.ten + " " + this.tc + " " + this.lt + " " + this.th;
    }
}
public class J07073_DANG_KY_HINH_THUC_GIANG_DAY {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            sc.nextLine();
            Subject []a = new Subject[n];
            for(int i = 0;i<n;i++){
                a[i] = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<Subject>(){
                public int compare(Subject a, Subject b){
                    return a.getid().compareTo(b.getid());
                }
            });
            for(Subject x: a){
                if(x.getth().equals("Truc tuyen") || x.getth().endsWith(".ptit.edu.vn")){
                    System.out.println(x);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
