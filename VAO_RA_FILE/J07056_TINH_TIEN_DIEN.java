import java.util.*;
import java.io.*;
class User{
    private String id, name, loai;
    private long dau, cuoi, dinhmuc, indm, vuotdm, tong, VAT;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public User(int x, String name, String loai, long dau, long cuoi){
        this.id = "KH" + String.format("%02d", x);
        this.name = chuanhoa2(name);
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
        long sodien = this.cuoi - this.dau;
        if(this.loai.equals("A")){
            this.dinhmuc = 100;
        } else if (this.loai.equals("B")){
            this.dinhmuc = 500;
        } else {
            this.dinhmuc = 200;
        }
        if(sodien <= this.dinhmuc){
            this.indm = sodien * 450; 
            this.vuotdm = 0;
            this.VAT = 0;
        } else {
            this.indm = this.dinhmuc * 450;
            this.vuotdm = (sodien - this.dinhmuc) * 1000;
            this.VAT = this.vuotdm * 5/100;
        }
        this.tong = this.indm + this.vuotdm + this.VAT;
    }
    public long gettong(){
        return this.tong;
    }
    public String toString(){
        return this.id + " " + this.name + this.indm + " " + this.vuotdm + " " + this.VAT + " " + this.tong;
    }
}     
public class J07056_TINH_TIEN_DIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        User []a = new User[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new User(i + 1, sc.nextLine(), sc.next(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<User>(){
            public int compare (User a, User b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(User x: a) System.out.println(x);
    }
}
