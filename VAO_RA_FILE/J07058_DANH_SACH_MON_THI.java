import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class MonThi{
    private String ma, ten, hinhthuc;
    public MonThi(String ma, String ten, String hinhthuc){
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.hinhthuc;
    }
    public String getma(){
        return this.ma;
    }
}
public class J07058_DANH_SACH_MON_THI {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("MONHOC.in")); 
            int n = sc.nextInt();
            sc.nextLine();
            MonThi []a = new MonThi[n];
            for(int i = 0;i<n;i++){
                a[i] = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<MonThi>(){
                public int compare(MonThi a, MonThi b){
                    return a.getma().compareTo(b.getma());
                }
            });
            for(MonThi x: a){
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
