import java.util.*;
class ThucTap{
    private int stt;
    private String msv, ten, lop, mail, dn;
    public ThucTap(int stt, String msv, String ten, String lop, String mail, String dn){
        this.stt = stt;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.dn = dn;
    }
    public String getmsv(){
        return this.msv;
    }
    public String getdn(){
        return this.dn;
    }
    public String toString(){
        return String.format("%d %s %s %s %s %s", this.stt, this.msv, this.ten, this.lop, this.mail, this.dn);
    }
}
public class J05035_DANH_SACH_THUC_TAP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThucTap []a = new ThucTap[n];
        for(int i = 0;i<n;i++){
            a[i] = new ThucTap(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<ThucTap>() {
            public int compare(ThucTap a, ThucTap b) {
                return a.getmsv().compareTo(b.getmsv());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            for(ThucTap x: a){
                if(x.getdn().equals(s)) System.out.println(x);
            }
        }
    }
}