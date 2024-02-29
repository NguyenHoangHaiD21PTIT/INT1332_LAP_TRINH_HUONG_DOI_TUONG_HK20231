import java.util.*;
import java.io.*;

public class J05019_LUONG_MUA_TRUNG_BINH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TramMua[] a = new TramMua[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new TramMua(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        ArrayList<String> v = new ArrayList<>(); // Lưu tên trạm mưa
        LinkedHashMap<String, Double> mp1 = new LinkedHashMap<>(); // mp1[i] lưu tổng lượng mưa tại trạm thứ i
        LinkedHashMap<String, Double> mp2 = new LinkedHashMap<>(); // mp2[i] lưu tổng số giờ mưa
        for (TramMua x : a) {
            String s = x.getname(); // Tên trạm mưa
            double time = x.gettime();//Lấy tổng thời gian mưa lần đó tại trạm đó
            double mua = x.getluongmua();//Lấy tổng lượng mưa lần đó trạm đó
            if (mp1.containsKey(s)) {
                double res = mp1.get(s);//Lượng mưa tổng các lần đang có
                res+=mua;//Cộng thêm lượng mưa lần đang xét
                mp1.put(s, res);
                
                double res2 = mp2.get(s);//Lấy tổng số giờ mưa hiện có của trạm
                res2+=time;
                mp2.put(s, res2);
            } else {
                mp1.put(s, mua);
                mp2.put(s, time);
                v.add(s);
            }
        }
        
        for (int i = 0; i < v.size(); i++) {
            String s = v.get(i);
            System.out.print("T0" + (i + 1) + " " + s + " ");
            System.out.printf("%.2f", mp1.get(s) / mp2.get(s) * 1.0);
            System.out.println();
        } 
    }
}
class TramMua{
    private String name, bd, kt;
    private double luongmua, giomua;
    public TramMua(String name, String bd, String kt, double luongmua){
        this.name = name.trim();
        this.bd = bd.trim();
        this.kt = kt.trim();
        this.luongmua = luongmua;
        String []a = this.bd.trim().split(":");
        String []b = this.kt.trim().split(":");
        long x1 = Long.parseLong(a[0]), x2 = Long.parseLong(a[1]), x3 = Long.parseLong(b[0]), x4 = Long.parseLong(b[1]);
        this.giomua = (x3 * 60 + x4 - x1 * 60 - x2)/60.0;
    }
    
    public String getname(){
        return this.name;
    }
    public double gettime(){
        return this.giomua;
    }
    public double getluongmua(){
        return this.luongmua;
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/
