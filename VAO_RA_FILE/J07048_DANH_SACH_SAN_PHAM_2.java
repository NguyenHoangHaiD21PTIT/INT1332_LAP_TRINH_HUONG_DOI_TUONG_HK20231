import java.io.*;
import java.util.*;
class SanPham{
    private String id, name;
    private int giaban, baohanh;
    public SanPham(String id, String name, int giaban, int baohanh){
        this.id = id;
        this.name = name;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }
    public int getban(){
        return this.giaban;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.giaban+" "+this.baohanh;
    }
}
public class J07048_DANH_SACH_SAN_PHAM_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SanPham []a = new SanPham[n];
        for(int i = 0;i<n;i++){
            a[i] = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<SanPham>(){
            public int compare(SanPham a, SanPham b){
                if(a.getban()!=b.getban()) return b.getban() - a.getban();
                return a.getid().compareTo(b.getid());
            }
        });
        for(SanPham x: a) System.out.println(x);
    }
}

