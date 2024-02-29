package KHAI_BAO_LOP_VA_DOI_TUONG;
import java.util.*;
public class J04004_TONG_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo (sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo (sc.nextLong(), sc.nextLong());
        System.out.println(a.cong(b));
    }
}

