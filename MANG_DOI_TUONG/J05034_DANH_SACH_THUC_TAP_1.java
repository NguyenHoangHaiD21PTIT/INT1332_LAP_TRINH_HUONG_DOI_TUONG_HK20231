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
    public String getten(){
        return this.ten;
    }
    public String getdn(){
        return this.dn;
    }
    public String toString(){
        return String.format("%d %s %s %s %s %s", this.stt, this.msv, this.ten, this.lop, this.mail, this.dn);
    }
}
public class J05034_DANH_SACH_THUC_TAP_1 {
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
                return a.getten().compareTo(b.getten());
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
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/
