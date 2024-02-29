/*import java.util.*;
class GiangVien{
    private String name, mon, ten, montat, id;
    public GiangVien(int x, String name, String mon){
        this.id = "GV" + String.format("%02d", x);
        this.name = name;
        this.mon = mon;
        String []a = this.name.trim().split("\\s+");
        this.ten = a[a.length - 1];
        String []b = this.mon.trim().split("\\s+");
        String res ="";
        for(String p: b) res+=Character.toUpperCase(p.charAt(0));
        this.montat = res;
    }
    public String getten(){
        return this.ten;
    }
    public String getma(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.montat;
    }
}
public class J05025_SAP_XEP_DANH_SACH_GIANG_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GiangVien []a = new GiangVien[n];
        for(int i = 0;i<n;i++){
            a[i] = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<GiangVien>(){
            public int compare(GiangVien a, GiangVien b){
                if(!a.getten().equals(b.getten())) return a.getten().compareTo(b.getten());
                return a.getma().compareTo(b.getma());
            }
        });
        for(GiangVien x: a) System.out.println(x);
    }
}*/
