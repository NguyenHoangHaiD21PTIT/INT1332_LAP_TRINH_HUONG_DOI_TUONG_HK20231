import java.util.*;
import java.io.*;

class KhoHang {
    private String id, ten;
    private int sl;
    private double dongia, chietkhau, thanhtien;

    public KhoHang(String ten, int sl, double dongia) {
        this.ten = ten; 
        String[] a = this.ten.trim().split("\\s+");
        String s1 = Character.toString(Character.toUpperCase(a[0].charAt(0)));
        String s2 = Character.toString(Character.toUpperCase(a[1].charAt(0)));
        this.id = s1 + s2;
        this.sl = sl; 
        this.dongia = dongia;
        if (this.sl > 10) {
            this.chietkhau = this.dongia * this.sl * 5.0 / 100.0;
        } else if (this.sl >= 8) {
            this.chietkhau = this.dongia * this.sl * 2.0 / 100.0;
        } else if (this.sl >= 5) {
            this.chietkhau = this.dongia * this.sl * 1.0 / 100.0;
        } else {
            this.chietkhau = 0.0;
        }
        this.thanhtien = this.dongia * this.sl - this.chietkhau;
    }

    public void setid(String x) {
        this.id = x;
    }

    public String getid() {
        return this.id;
    }
    
    public double getck(){
        return this.chietkhau;
    }

    public String toString() {
        return this.id + " " + this.ten + " " + String.format("%.0f %.0f", this.chietkhau, this.thanhtien);
    }
}
public class J05047_BANG_KE_NHAP_KHO_SAP_XEP_THEO_CHIET_KHAU {
    public static void main(String[] args){
        //Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        KhoHang[] a = new KhoHang[n];
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            a[i] = new KhoHang(sc.nextLine(), sc.nextInt(), sc.nextDouble()); 
        }

        for (int i = 0; i < n; i++) { 
            String s = a[i].getid();
            if (mp.containsKey(s)) {
                int freq = mp.get(s);
                freq++;
                mp.put(s, freq);
            } else {
                mp.put(s, 1);
            }
            a[i].setid(s + String.format("%02d", mp.get(s)));
        }

        Arrays.sort(a, new Comparator<KhoHang>(){
            public int compare(KhoHang a, KhoHang b){
                if(a.getck() > b.getck()) return -1;
                else return 1;
            }
        });
        for(KhoHang x: a) System.out.println(x);
    }
}
