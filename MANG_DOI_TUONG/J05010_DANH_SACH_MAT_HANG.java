import java.util.*;

class Hang {
    private int ma;
    private String ten, nhom;
    private double mua, ban, loinhuan;
    public Hang(int x, String ten, String nhom, double mua, double ban) {
        this.ma = x;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = this.ban - this.mua;
    }

    public double profit() {
        return this.loinhuan;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.loinhuan);
    }
}

public class J05081_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc dấu xuống dòng thừa sau khi đọc n
        Hang[] a = new Hang[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Hang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine(); 
        }
        Arrays.sort(a, new Comparator<Hang>() {
            public int compare(Hang a, Hang b) {
                if (a.profit() > b.profit()) return -1;
                else return 1;
            }
        });
        for(Hang x: a){
            System.out.println(x);
        }
    }
} 
