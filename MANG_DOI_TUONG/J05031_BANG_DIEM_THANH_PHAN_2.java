import java.util.*;
class SVien{
    private String msv, name, lop;
    private double diem1, diem2, diem3;
    public SVien(String msv, String name, String lop, double diem1, double diem2, double diem3){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public String toString(){
        return this.msv + " " + this.name + " " + this.lop + " " + String.format("%.1f", this.diem1) + " " + String.format("%.1f", this.diem2) + " " + String.format("%.1f", this.diem3) + " ";
    }
    public String getname(){
        return this.name;
    }
}
public class J05031_BANG_DIEM_THANH_PHAN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        SVien []a = new SVien[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new SVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<SVien>(){
            public int compare(SVien a, SVien b){
                return a.getname().compareTo(b.getname());
            }
        });
        for(int i = 1;i<=n;i++){
            System.out.println(i + " " + a[i - 1]);
        }
    }
} 