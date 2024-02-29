import java.util.*;

class MatHang {
    private String ma, ten, dvt;
    private int mua, ban, loinhuan;

    public MatHang(int x, String ten, String dvt, int mua, int ban) {
        this.ma = String.format("%03d", x);
        this.ten = ten;
        this.dvt = dvt;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = this.ban - this.mua;
    }

    public int profit() {
        return this.loinhuan;
    }

    public String getma() {
        return this.ma;
    }

    public String toString() {
        return "MH" + this.ma + " " + this.ten + " " + this.dvt + " " + this.mua + " " + this.ban + " " + this.loinhuan;
    }
}

public class J05081_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        MatHang[] a = new MatHang[n];
        for (int i = 0; i < n; i++) {
            a[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine(); 
        }
        Arrays.sort(a, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b) {
                if (a.profit() != b.profit()) {
                    return b.profit() - a.profit();
                }
                return a.getma().compareTo(b.getma());
            }
        });
        for(MatHang x: a){
            System.out.println(x);
        }
    } 
} 
