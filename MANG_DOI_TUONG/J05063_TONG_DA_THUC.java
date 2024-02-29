package MANG_DOI_TUONG;
import java.util.*;
class DaThuc{
    private int []heso;//hs[a] = b tức là hệ số của x ^ a là b
    private void solve (String s){ 
        String []a = s.trim().split("\\s+");
        for(String x: a){
            if(!x.equals("+")){//Chỉ xét các xâu đơn thức
                int pos = x.indexOf("*");
                if (pos != -1) {
                    int hso = Integer.parseInt(x.substring(0, pos));
                    int somu = Integer.parseInt(x.substring(pos+3));
                    this.heso[somu]+=hso;
                }
            }
        }
    }   
    public DaThuc(String s){
        heso = new int [10005];
        solve(s);
    }
    public DaThuc cong (DaThuc b){ 
        DaThuc res = new DaThuc("");
        for (int i = 0; i < 10005; i++) {
            res.heso[i] = this.heso[i] + b.heso[i];
        }
        return res;
    }
    public String toString(){
        String res = "";
        ArrayList<Integer>a = new ArrayList<>();//Luu bậc
        for(int i=10000;i>=0;i--){ //Mũ nào có hệ số khác 0 thì đưa vào
            if(this.heso[i] > 0) a.add(i);
        }
        int n = a.size();
        for(int i = 0;i<=n-2;i++) res+=this.heso[a.get(i)] + "*x^" + a.get(i) + " + ";
        res+=this.heso[a.get(n-1)] + "*x^" + a.get(n-1);
        return res;
    }
}
public class J05063_TONG_DA_THUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }  
    }
}
