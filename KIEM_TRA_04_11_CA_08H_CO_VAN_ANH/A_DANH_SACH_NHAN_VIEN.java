package KIEM_TRA_04_11_CA_08H_CO_VAN_ANH;
import java.util.*;
import java.io.*;
class Nhanvien implements Comparable<Nhanvien>{
    private String maNV, ten, gioi;
    private int luong;
    private boolean check;
    public Nhanvien(String maNV, String ten, boolean check, int luong) {
        this.maNV = maNV;
        this.ten = ten;
        if(check) this.gioi = "nam";
        else this.gioi = "nu";
        this.luong = luong;
    }
    public String toString(){
        return this.maNV + " " + this.ten + " " + this.gioi + " " + this.luong;
    }
    public int compareTo(Nhanvien t) {
        String []x1 = this.ten.trim().toLowerCase().split("\\s+");
        String []x2 = t.ten.trim().toLowerCase().split("\\s+");
        if (!x1[x1.length - 1].equals(x2[x2.length - 1])) return x1[x1.length - 1].compareTo(x2[x2.length - 1]);
        else if (!x1[0].equals(x2[0])) return x1[0].compareTo(x2[0]);
        return x1[1].compareTo(x2[1]);
    }
}
public class A_DANH_SACH_NHAN_VIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("nhanvien.dat"));
        ArrayList<Nhanvien>a = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String []tmp = s.trim().split("/");
            a.add(new Nhanvien(tmp[0], tmp[1], Boolean.parseBoolean(tmp[2]), Integer.parseInt(tmp[3])));
        }
        Collections.sort(a);
        for(Nhanvien x: a) System.out.println(x);
    }
}
