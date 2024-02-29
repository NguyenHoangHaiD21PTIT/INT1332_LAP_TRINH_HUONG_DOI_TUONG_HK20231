import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class DN{
    private String id, name;
    private int slot;
    public DN(String id, String name, int slot){
        this.id = id;
        this.name = name;
        this.slot = slot;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.slot;
    }
}
public class J07037_DANH_SACH_DOANH_NGHIEP {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = sc.nextInt();
            DN []a = new DN[n];
            for(int i = 0;i<n;i++){
                sc.nextLine();
                a[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
            }
            Arrays.sort(a, new Comparator<DN>(){
                public int compare(DN a, DN b){
                    return a.getid().compareTo(b.getid());
                }
            });
            for(DN x: a) System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}  
