import java.util.*;
class SoPhuc{
    private int thuc, ao;
    public SoPhuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    public SoPhuc tong(SoPhuc a){
        int x = this.thuc + a.thuc;
        int y = this.ao + a.ao;
        SoPhuc res = new SoPhuc(x, y);
        return res;
    }
    public SoPhuc nhan(SoPhuc a){
        int x = this.thuc * a.thuc - this.ao * a.ao;
        int y = this.thuc * a.ao + this.ao * a.thuc;
        SoPhuc res = new SoPhuc (x, y);
        return res;
    } 
    public String toString(){
        String res = "";
        res+=this.thuc + " ";
        if(this.ao < 0){
            res+="- " + Math.abs(this.ao) + "i";
        } else {
            res+="+ " + Math.abs(this.ao) + "i";
        }
        return res;
    }
}
public class J04018_SO_PHUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = (a.tong(b)).nhan(a);
            SoPhuc d = (a.tong(b)).nhan(a.tong(b));
            System.out.println(c + ", " + d);
        }
    }
}
