import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, ten;
    private int gia; private double phi;
    public LoaiPhong(String x){
        String []a = x.trim().split("\\s+");
        this.id = a[0];
        this.ten = a[1];
        this.gia = Integer.parseInt(a[2]);
        this.phi = Double.parseDouble(a[3]);
    }
    public int compareTo(LoaiPhong b){
        return this.ten.compareTo(b.ten);
    }
    public String toString(){
        return this.id + " " + this.ten + " " + this.gia + " " + this.phi;
    }
}
public class J07045_LOAI_PHONG {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
