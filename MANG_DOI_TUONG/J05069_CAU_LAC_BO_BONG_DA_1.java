import java.util.*;
import java.io.*;
class BongDa {
    private String ma1, ma2, name;//mã 1 là tên viết tắt CLB, mã 2 là tên trận đấu, name là tên đầy đủ CLB
    private long dongia, sum;
    public BongDa(String ma1, String name, long dongia) {
        this.ma1 = ma1;
        this.name = name;
        this.dongia = dongia;
    }
    public String getMa1() {
        return ma1;
    }
    public void setMa2(String ma2) {
        this.ma2 = ma2;
    }
    public long getDongia() {
        return dongia;
    }
    public void setSum(long sum) {
        this.sum = sum;
    }
    public String toString(){
        return this.ma2+" "+this.name+" "+this.sum;
    }
}
public class J05069_CAU_LAC_BO_BONG_DA_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        BongDa[] a=new BongDa[t];
        for(int i=0;i<t;i++){
            sc.nextLine();
            a[i]=new BongDa(sc.nextLine(),sc.nextLine(),sc.nextLong());
        }
        int q=sc.nextInt();
        while(q-->0){
            sc.nextLine();
            String s=sc.next();
            long ve=sc.nextLong();
            String ss=s.substring(1,3);
            for(BongDa x:a){
                if(x.getMa1().equals(ss)){
                    x.setMa2(s);
                    x.setSum(ve*x.getDongia());
                    System.out.println(x);
                }
            }
        }
    }
}
