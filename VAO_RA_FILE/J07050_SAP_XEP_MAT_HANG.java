import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Hang {
    private String ma;
    private String ten, nhom;
    private double mua, ban, loinhuan;
    public Hang(int x, String ten, String nhom, double mua, double ban) {
        this.ma = "MH" + String.format("%02d", x);
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

public class J07050_SAP_XEP_MAT_HANG {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MATHANG.in"));
            int n = sc.nextInt();
            Hang[] a = new Hang[n];
            for (int i = 0; i < n; i++) {
                sc.nextLine();
                a[i] = new Hang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}