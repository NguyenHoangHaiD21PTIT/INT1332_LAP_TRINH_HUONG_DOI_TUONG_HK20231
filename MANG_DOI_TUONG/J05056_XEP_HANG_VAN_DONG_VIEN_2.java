import java.util.*;
import java.io.*;
class VDV{
    public static int chenhlech(String s1, String s2){ //Số giây chênh lệch
        String []a = s1.trim().split(":");
        String []b = s2.trim().split(":");
        int x1 = Integer.parseInt(a[0]), x2 = Integer.parseInt(a[1]), x3 = Integer.parseInt(a[2]);
        int y1 = Integer.parseInt(b[0]), y2 = Integer.parseInt(b[1]), y3 = Integer.parseInt(b[2]);
        int res = y1 * 3600 + y2 * 60 + y3 - x1 * 3600 - x2 * 60 - x3;
        return res;
    }
    public static int tong(String s){//Tổng giây
        String []a = s.trim().split(":");
        int x1 = Integer.parseInt(a[0]), x2 = Integer.parseInt(a[1]), x3 = Integer.parseInt(a[2]);
        return (x1 * 3600 + x2 * 60 + x3);
    }
    private String id, name, ns, bd, kt, prio, real, containprio;
    private int uutien, tongthuc;
    public VDV(int x, String name, String ns, String bd, String kt){
        this.id = "VDV" + String.format("%02d", x);
        this.name = name;
        this.ns = ns;
        this.bd = bd;
        this.kt = kt;
        int tmp = 2021 - Integer.parseInt(this.ns.substring(6));
        if(tmp < 18){
            this.uutien = 0;
        } else if (tmp >=18 && tmp <= 24){
            this.uutien = 1;
        } else if (tmp >= 25 && tmp <= 32){
            this.uutien = 2;
        } else {
            this.uutien = 3;
        }
        //Tạo xâu thời gian ưu tiên
        this.prio = "00:00:0" + String.valueOf(this.uutien);
        
        //Tính chênh lệch giữa XP và KT, tạo xâu thành tích thực tế
        int p = chenhlech(this.bd, this.kt);
        int m = p / 3600, n = (p%3600)/60, q = p % 60; 
        this.real = String.format("%02d:%02d:%02d", m, n, q);
        
        this.tongthuc = p - this.uutien; //Tổng số giây trừ số giây ưu tiên
        int z1 = this.tongthuc / 3600, z2 = (this.tongthuc % 3600)/60, z3 = this.tongthuc % 60;
        this.containprio = String.format("%02d:%02d:%02d", z1, z2, z3);
    }
    public int getthuc(){
        return this.tongthuc;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.real + " " + this.prio + " " + this.containprio;
    }
}
public class J05056_XEP_HANG_VAN_DONG_VIEN_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        VDV []a = new VDV[n];
        for(int i = 0;i<n;i++){
            a[i] = new VDV(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<VDV>(){
            public int compare(VDV a, VDV b){
                return a.getthuc() - b.getthuc();
            }
        });
        //Đếm tần suất các giá trị khác nhau của tổng thời lượng
        ArrayList<Integer>b = new ArrayList<>(); //Mảng lưu các giá trị khác nhau của tổng thời lượng
        int []cnt = new int[400000];
        for(VDV x: a){
            int tmp = x.getthuc();
            if(cnt[tmp] ==0) b.add(tmp);
            cnt[tmp]++;
        }
        //Tiến hành xét hạng tổng thời gian 
        LinkedHashMap<Integer, Integer>mp1 = new LinkedHashMap<>(); //vector luu hạng điểm
        mp1.put(b.get(0), 1);
        int x = 1;
        for(int i = 1;i<b.size();i++){
            x+=cnt[b.get(i - 1)];
            mp1.put(b.get(i), x);
        }
        for(VDV p: a){
            System.out.print(p);
            System.out.println(" " + mp1.get(p.getthuc()));
        }
    }
} 
