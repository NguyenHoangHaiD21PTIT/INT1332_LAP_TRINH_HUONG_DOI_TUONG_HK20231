import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class CaThi{
    private String id, ngaythi, giothi, room;
    private int tongngay, tonggio;
    public CaThi(int p, String ngaythi, String giothi, String room){
        this.id = "C" + String.format("%03d", p);
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.room = room;
        String []a = this.ngaythi.split("/");
        String []b = this.giothi.split(":");
        for(String x: a) this.tongngay+=Integer.parseInt(x);
        for(String x: b) this.tonggio+=Integer.parseInt(x);
    }
    public int tongngay(){
        return this.tongngay;
    }
    public int tonggio(){
        return this.tonggio;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.ngaythi + " " + this.giothi + " " + this.room;
    }
}
public class J07059_DANH_SACH_CA_THI {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("CATHI.in"));
            int n = sc.nextInt();
            sc.nextLine();
            CaThi []a = new CaThi[n];
            for(int i = 0;i<n;i++){
                a[i] = new CaThi(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<CaThi>(){
                public int compare(CaThi a, CaThi b){
                    if(a.tongngay()!= b.tongngay()) return a.tongngay() - b.tongngay();
                    if(a.tonggio()!=b.tonggio()) return a.tonggio() - b.tonggio();
                    return a.getid().compareTo(b.getid());
                }
            });
            for(CaThi x: a) System.out.println(x);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
