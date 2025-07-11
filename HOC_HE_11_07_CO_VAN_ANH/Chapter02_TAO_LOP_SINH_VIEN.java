package HOC_HE_11_07_CO_VAN_ANH;
import java.util.Scanner;

class SinhVien {
    private String maSV, hoDem, ten, gioiTinh;
    private int tuoi;
    private double diem1, diem2;
    public void setMaSV(int number) {
        this.maSV = "D22DCCN" + String.format("%03d", number);
    }
    public void setDiem(double diem1, double diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    public String getHoVaTen() {
        return hoDem + " " + ten;
    }
    public double getGPA() {
        return (diem1 + diem2 * 2) / 3.0;
    }
    public String getXepLoai() {
        double gpa = getGPA();
        if (gpa < 5.0) return "yeu";
        if (gpa < 6.5) return "trung binh";
        if (gpa < 8.0) return "kha";
        if (gpa < 9.0) return "gioi";
        return "xuat sac";
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine().trim());
        setMaSV(number);
        hoDem = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        while (true) {
            try {
                String tuoiStr = sc.nextLine().trim();
                int x = Integer.parseInt(tuoiStr);
                if (x < 18 || x > 23)
                    System.out.println("nhap sai");
                else {
                    tuoi = x;
                    break;
                }
            } catch (Exception e) {
                System.out.println("nhap sai");
            }
        }
        String s = sc.nextLine();
        if(s.equals("True")) gioiTinh = "nam";
        else gioiTinh = "nu";
        while (true) {
            try {
                double d1 = Double.parseDouble(sc.nextLine().trim());
                if (d1 < 0 || d1 > 10) {
                    System.out.println("nhap sai");
                } else {
                    diem1 = d1;
                    break;
                }
            } catch (Exception e) {
                System.out.println("nhap sai");
            }
        }
        while (true) {
            try {
                double d2 = Double.parseDouble(sc.nextLine().trim());
                if (d2 < 0 || d2 > 10) {
                    System.out.println("nhap sai");
                } else {
                    diem2 = d2;
                    break;
                }
            } catch (Exception e) {
                System.out.println("nhap sai");
            }
        }
    }
    public void output() {
        double gpa = getGPA();
        String xepLoai = getXepLoai();
        System.out.printf("%s %s %s %d %s %.1f %s\n", maSV, hoDem, ten, tuoi, gioiTinh, gpa, xepLoai);
        System.out.printf("%s %s %s\n", hoDem, ten, xepLoai);
    }
}
public class Chapter02_TAO_LOP_SINH_VIEN {
    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        s.input();         
        s.setDiem(4, 8);     
        s.output();          
    }
}
/*
2
30/04/2023
04/05/2023
4
500
27/08/2023
02/04/2023
20
500
*/
