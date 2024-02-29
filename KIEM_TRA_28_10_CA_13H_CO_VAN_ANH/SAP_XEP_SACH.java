package KIEM_TRA_28_10_CA_13H_CO_VAN_ANH;
import java.util.*;
import java.io.*;
class SachHoc {
    protected String ten, nxb, ma;
    protected double gia;
    private static int cnt = 1;
    public SachHoc(String ten, String nxb, double gia) {
        this.ten = ten;
        this.nxb = nxb;
        this.gia = gia;
        this.ma = String.format("%02d", cnt);
        cnt++;
    }
    public String toString() {
        return this.ma + " " + this.ten + " " + this.nxb + " ";
    }
}
class SachThamKhao extends SachHoc {
    private boolean type;
    private String loai;
    public SachThamKhao(String ten, String nxb, boolean type, double gia) {
        super(ten, nxb, gia);
        this.type = type;
        if (this.type == true) {
            this.loai = "co ban";
            this.gia = this.gia * 110.0 / 100;
        } else {
            this.loai = "nang cao";
            this.gia = this.gia * 115.0 / 100;
        }
        String tmp = "";
        String []a = this.nxb.trim().split("\\s+");
        for(String x: a) tmp+=Character.toUpperCase(x.charAt(0));
        this.ma = tmp + this.ma;
    }
    public String toString() {
        return super.toString() + this.loai + " " + String.format("%.0f", this.gia);
    }
}
class SachGiaoKhoa extends SachHoc {
    private int lop, tap;
    private boolean type;
    private String loai;
    public SachGiaoKhoa(String ten, String nxb, int lop, int tap, boolean type, double gia) {
        super(ten, nxb, gia);
        this.lop = lop;
        this.tap = tap;
        this.type = type;
        if (this.lop >= 1 && this.lop <= 5) {
            this.gia = this.gia * 90.0 / 100;
        } else if (this.lop >= 6 && this.lop <= 9) {
            this.gia = this.gia * 95.0 / 100;
        }
        if (this.type == true) {
            this.loai = "bai tap";
            this.gia = this.gia * 105.0 / 100;
        } else {
            this.loai = "ly thuyet";
        }
        this.ma = "SGK" + (this.lop + "") + (this.tap + "") + this.ma;
    }
    @Override
    public String toString() {
        return super.toString()+ this.lop + " " + this.tap + " " + this.loai + " " + String.format("%.0f", this.gia);
    }
}
class QuanLySach {
    private List<SachHoc> list;
    public QuanLySach() {
        list = new ArrayList<>();
    }
    public void setList(List<SachHoc> list) {
        this.list = list;
    }
    public void sapXepSachGiaoKhoa() {
        Collections.sort(list, new Comparator<SachHoc>() {
            @Override
            public int compare(SachHoc s1, SachHoc s2) {
                if(!s1.nxb.equals(s2.nxb)) return s1.nxb.compareTo(s2.nxb);
                return Double.compare(s1.gia, s2.gia);
            }
        });
        for (SachHoc sach : list)  System.out.println(sach);
    }
}

public class SAP_XEP_SACH {
    public static void main(String[] args) {
        QuanLySach q = new QuanLySach();
        List<SachHoc> list = new ArrayList<>();
        SachThamKhao k = new SachThamKhao("toan lop 6", "giao duc", false, 45);
        list.add(k);
        k = new SachThamKhao("ly lop 11", "dong nai", true, 90);
        list.add(k);
        SachGiaoKhoa g = new SachGiaoKhoa("toan", "dong nai", 5, 1, true, 50);
        list.add(g);
        g = new SachGiaoKhoa("tieng viet", "giao duc", 5, 2, false, 60);
        list.add(g);
        g = new SachGiaoKhoa("giao duc CD", "giao duc", 6, 1, false, 30);
        list.add(g);
        g = new SachGiaoKhoa("dia ly", "giao duc", 6, 1, false, 70);
        list.add(g);
        g = new SachGiaoKhoa("vat ly", "minh Chau", 9, 1, true, 90);
        list.add(g);
        q.setList(list);
        q.sapXepSachGiaoKhoa();
    }
} 


