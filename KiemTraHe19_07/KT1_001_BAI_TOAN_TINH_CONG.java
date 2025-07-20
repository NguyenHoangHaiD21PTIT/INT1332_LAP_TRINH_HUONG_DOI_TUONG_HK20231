import java.util.*;
class NhanVien{
    private String hoTen, chucVu;
    private long soNgay, luongCB;
    private double luongThang, thuong, phuCap, thuNhap;
    public static String chuanHoa(String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static String chuanHoa2(String s){
        String []tmp = s.trim().split("\\s+");
        String ans = "";
        for(String x: tmp) ans+=chuanHoa(x) + " ";
        return ans.trim();
    }
    public void input(Scanner in){
        hoTen = in.nextLine();
        hoTen = chuanHoa2(hoTen);//Chuẩn hoá tên
        luongCB = Integer.parseInt(in.nextLine());
        soNgay = Integer.parseInt(in.nextLine());
        chucVu = in.nextLine();
        //Tính lương tháng
        luongThang = luongCB * soNgay;
        //Tính tiền thưởng
        if(soNgay >= 25) thuong = luongThang * 0.2;
        else if (soNgay >= 22) thuong = luongThang * 0.1;
        //Tính phụ cấp theo chức vụ
        if(chucVu.equals("GD")) phuCap = 250000;
        else if (chucVu.equals("PGD")) phuCap = 200000;
        else if (chucVu.equals("TP")) phuCap = 180000;
        else phuCap = 150000;
        //Tổng thu nhập
        thuNhap = luongThang + thuong + phuCap;
    }
    public String toString(){
        return hoTen +" "+ (long)luongThang + " " + (long) phuCap + " " + (long)thuNhap;
    }
}
public class KT1_001_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien tc = new NhanVien();
        tc.input(in);
        System.out.println(tc);
    }
}
/*
Input:
buI      tHi   TRaNg
45000
23
PGD
Output: 
Bui Thi Trang 1035000 200000 1338500
*/