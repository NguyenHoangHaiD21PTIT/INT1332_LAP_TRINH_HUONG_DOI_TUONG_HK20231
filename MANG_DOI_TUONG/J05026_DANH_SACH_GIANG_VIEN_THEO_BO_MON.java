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
    public String getmon(){
        return this.montat;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.montat;
    }
}
public class J05026_DANH_SACH_GIANG_VIEN_THEO_BO_MON {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GiangVien []a = new GiangVien[n];
        for(int i = 0;i<n;i++){
            a[i] = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- >0){
            String s = sc.nextLine();
            String []b = s.trim().split("\\s+");
            String res ="";
            for(String p: b) res+=Character.toUpperCase(p.charAt(0));
            System.out.println("DANH SACH GIANG VIEN BO MON " + res+":");
            for(GiangVien x: a){
                if(x.getmon().equals(res)) System.out.println(x);
            }
        }
    }
} */
