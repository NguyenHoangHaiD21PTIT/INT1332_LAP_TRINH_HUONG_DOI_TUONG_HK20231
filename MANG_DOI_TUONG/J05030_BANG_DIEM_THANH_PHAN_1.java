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
    public String getmsv(){
        return this.msv;
    }
}
public class J05030_BANG_DIEM_THANH_PHAN_1 {
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
                return a.getmsv().compareTo(b.getmsv());
            }
        });
        for(int i = 1;i<=n;i++){
            System.out.println(i + " " + a[i - 1]);
        }
    }
} 
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
1 B20DCAT001 Le Van Nam D20CQAT02-B 6.0 6.0 4.0
2 B20DCCN111 Tran Hoa Binh D20CQCN04-B 9.0 5.0 6.0
3 B20DCCN999 Nguyen Van An D20CQCN04-B 10.0 9.0 8.0
*/
