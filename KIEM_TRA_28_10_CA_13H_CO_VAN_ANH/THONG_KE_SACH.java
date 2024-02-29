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
    public void setMa() {
    }
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.nxb + " ";
    }
}
class SachThamKhao extends SachHoc {
    private boolean coBan;
    private String loai;
    public SachThamKhao(String ten, String nxb, boolean coBan, double gia) {
        super(ten, nxb, gia);
        this.coBan = coBan;
        if (this.coBan==true) {
            this.loai = "co ban";
            this.gia = this.gia * 110.0 / 100;
        } else {
            this.loai = "nang cao";
            this.gia = this.gia * 115.0 / 100;
        }
        String tmp = "";
        String[] a = this.nxb.trim().split("\\s+");
        for (String x : a)
            tmp += Character.toUpperCase(x.charAt(0));
        this.ma = tmp + this.ma;
    }
    public boolean isCoBan() {
        return coBan;
    }
    @Override
    public String toString() {
        return super.toString() + this.loai + " " + String.format("%.0f", this.gia);
    }
}

class SachGiaoKhoa extends SachHoc {
    private int lop, tap;
    private boolean baiTap;
    private String loai;
    public SachGiaoKhoa(String ten, String nxb, int lop, int tap, boolean baiTap, double gia) {
        super(ten, nxb, gia);
        this.lop = lop;
        this.tap = tap;
        this.baiTap = baiTap;
        if (this.lop >= 1 && this.lop <= 5) {
            this.gia = this.gia * 90.0 / 100;
        } else if (this.lop >= 6 && this.lop <= 9) {
            this.gia = this.gia * 95.0 / 100;
        }
        if (this.baiTap) {
            this.loai = "bai tap";
            this.gia = this.gia * 105.0 / 100;
        } else {
            this.loai = "ly thuyet";
        }
        this.ma = "SGK" + this.lop + "" + this.tap + this.ma;
    }
    public boolean isBaiTap() {
        return baiTap;
    }
    @Override
    public String toString() {
        return super.toString() + this.lop + " " + this.tap + " " + this.loai + " " + String.format("%.0f", this.gia);
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
    public void demNhaXB(boolean sachThamKhaoOnly) {
        Map<String, Integer> nhaXuatBanCount = new HashMap<>();
        for (SachHoc sach : list) {
            if (sach instanceof SachThamKhao) {
                SachThamKhao sachThamKhao = (SachThamKhao) sach;
                if ((sachThamKhaoOnly && sachThamKhao.isCoBan()) || (!sachThamKhaoOnly && !sachThamKhao.isCoBan())) {
                    String nxb = sachThamKhao.nxb; // Truy cập trực tiếp thuộc tính nxb
                    if (nhaXuatBanCount.containsKey(nxb)) {
                        nhaXuatBanCount.put(nxb, nhaXuatBanCount.get(nxb) + 1);
                    } else {
                        nhaXuatBanCount.put(nxb, 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : nhaXuatBanCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
public class THONG_KE_SACH {
    public static void main(String[] args) {
        QuanLySach q = new QuanLySach();
        List<SachHoc> list = new ArrayList<>();
        SachThamKhao k = new SachThamKhao("toan lop 6", "giao duc", false, 45);
        k.setMa();
        list.add(k);
        k = new SachThamKhao("ly lop 11", "dong nai", true, 90);
        k.setMa();
        list.add(k);
        k = new SachThamKhao("Sinh lop 10", "dong nai", false, 120);
        k.setMa();
        list.add(k);
        k = new SachThamKhao("Ngu van lop 6", "giao duc", true, 200);
        k.setMa();
        list.add(k);
        k = new SachThamKhao("giao duc CD lop 7", "Minh chau", true, 60);
        k.setMa();
        list.add(k);
        k = new SachThamKhao("Ngu van lop 8", "giao duc", true, 200);
        k.setMa();
        list.add(k);
        SachGiaoKhoa g = new SachGiaoKhoa("toan", "dong nai", 5, 1, true, 50);
        g.setMa();
        list.add(g);
        g = new SachGiaoKhoa("tieng viet", "giao duc", 5, 2, false, 60);
        g.setMa();
        list.add(g);
        q.setList(list);
        Scanner in = new Scanner(System.in);
        q.demNhaXB(Boolean.parseBoolean(in.nextLine()));
    }
}