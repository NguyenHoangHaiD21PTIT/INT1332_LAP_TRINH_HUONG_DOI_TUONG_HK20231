package KIEM_TRA_26_11_CO_VAN_ANH_LamDemo;
import java.util.*;
import java.io.*;
class MonHoc implements Comparable<MonHoc>{
    private String maMon, tenMon;
    private int kyHoc, soTinChi;
    public MonHoc(String maMon, String tenMon, int kyHoc, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.kyHoc = kyHoc;
        this.soTinChi = soTinChi;
    }
    @Override
    public int compareTo(MonHoc t) {
        if(this.kyHoc!=t.kyHoc) return this.kyHoc - t.kyHoc;
        return this.maMon.compareTo(t.maMon);
    }
    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.kyHoc + " " + this.soTinChi;
    }
}
public class DANH_SACH_MON_HOC {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("monhoc.dat"));
        ArrayList<MonHoc>a = new ArrayList<>();
        while(sc.hasNextLine()){ 
            String []b = sc.nextLine().trim().split(",");
            a.add(new MonHoc(b[0].trim(), b[1].trim(), Integer.parseInt(b[2].trim()), Integer.parseInt(b[3].trim())));
        }
        Collections.sort(a);
        for(MonHoc x: a) System.out.println(x);
    }
}
