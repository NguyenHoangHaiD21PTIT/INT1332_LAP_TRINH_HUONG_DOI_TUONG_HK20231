import java.util.*;
import java.io.*;
class CLB{
    private String id, name; 
    private int giave;
    public CLB(String id, String name, int giave){
        this.id = id;
        this.name = name;
        this.giave = giave;
    }
    public String getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public int getgia(){
        return this.giave;
    }
}
class TranDau{
    private String id, name;
    private int cdv, doanhthu;
    public TranDau(String id, int cdv){
        this.id = id;
        this.cdv = cdv;
    }
    public String getid(){
        return this.id;
    }
    public int getcdv(){
        return this.cdv;
    }
    public int getdoanhthu(){
        return this.doanhthu;
    }
    public void setname(String s){
        this.name = s;
    }
    public void setdoanhthu(int x){
        this.doanhthu = x;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.doanhthu;
    }
}
public class J05070_CAU_LAC_BO_BONG_DA_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CLB []a = new CLB[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new CLB(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int q = sc.nextInt();
        sc.nextLine();
        TranDau []b = new TranDau[q];
        for(int i = 0;i<q;i++){
            b[i] = new TranDau(sc.next(), sc.nextInt());
        }
        for(TranDau x: b){
            String s = x.getid();
            String tmp = s.substring(1, 3);
            for(CLB y: a){
                if(tmp.equals(y. getid())){
                    x.setname(y.getname());
                    x.setdoanhthu(x.getcdv() * y.getgia());
                }
            }
        }
        Arrays.sort(b, new Comparator<TranDau>(){
            public int compare (TranDau a, TranDau b){
                return b.getdoanhthu() - a.getdoanhthu();
            }
        });
        for(TranDau x: b)  System.out.println(x);
    }
}
