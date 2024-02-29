import java.util.*;
class ThiSinh{
    private int ma;
    private String name, birth;
    private double diem1, diem2, diem3, tong;
    public ThiSinh(int ma, String name, String birth, double diem1, double diem2, double diem3){
        this.ma = ma;
        this.name = name;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = this.diem1 + this.diem2 + this.diem3;
    }
    public String toString(){
        return this.ma + " " + this.name + " " + this.birth + " " + String.format("%.1f", this.tong);
    }
    public double gettong(){
        return this.tong;
    }
    public int getma(){
        return this.ma;
    }
}
public class J05009_TIM_THU_KHOA_CUA_KY_THI {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ThiSinh []a = new ThiSinh[n];
        double res = -1.5; //Tổng điểm cao nhất
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            res = Math.max(res, a[i].gettong());
        }
        Arrays.sort(a, new Comparator<ThiSinh>(){
            public int compare(ThiSinh a, ThiSinh b){
                double x = a.gettong();
                double y = b.gettong();
                if(x!=y){
                    if(x>y) return -1;
                    else return 1;
                }
                return a.getma() - b.getma();
            }
        });
        for(ThiSinh x: a){
            if(x.gettong()==res) System.out.println(x);
        }   
    }
}
