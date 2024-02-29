import java.util.*;
import java.io.*;
class NongSan{
    private String id;
    private long slnhap, slxuat, dongia, tien, thue;
    public NongSan(String id, long slnhap){
        this.id = id;
        this.slnhap = slnhap;
        if(this.id.charAt(0)=='A'){
            this.slxuat = Math.round(this.slnhap * 6 / 10.0);
        } else {
            this.slxuat = Math.round(this.slnhap * 7 / 10.0);
        }
        if(this.id.charAt(4)=='Y'){
            this.dongia = 110000;
        } else {
            this.dongia = 135000;
        }
        this.tien = this.slxuat * this.dongia;
        if(this.id.charAt(0)=='A'&&this.id.charAt(4)=='Y'){
            this.thue = this.tien * 8/100;
        } else if (this.id.charAt(0)=='A'&&this.id.charAt(4)=='N'){
            this.thue = this.tien * 11/100;
        } else if (this.id.charAt(0)=='B'&&this.id.charAt(4)=='Y'){
            this.thue = this.tien * 17/100;
        } else {
            this.thue = this.tien * 22/100;
        }
    }
    public long getthue(){
        return this.thue;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.slnhap + " " + this.slxuat + " " + this.dongia + " " + this.tien + " " + this.thue;
    }
}
public class J05049_LIET_KE_XUAT_NHAP_HANG_THEO_NHOM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NongSan []a = new NongSan[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new NongSan(sc.nextLine(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<NongSan>(){
            public int compare(NongSan a, NongSan b){
                if(a.getthue() > b.getthue()) return -1;
                else return 1;
            }
        });
        String s = sc.next();
        for(NongSan x: a){
            if(x.getid().startsWith(s)) System.out.println(x);
        }
    }
}
