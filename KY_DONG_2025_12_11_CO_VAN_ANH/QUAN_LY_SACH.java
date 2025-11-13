package KY_DONG_2025_12_11_CO_VAN_ANH;
import java.util.*;
class Sach {
    private String ma, ten, nhaXB; 
    private double gia;
    private static int sMa = 0; 
    public Sach(String ten, String nhaXB, double gia) {
        this.ten = ten;
        this.nhaXB = chuanHoa(nhaXB); 
        this.gia = gia;
        Sach.sMa++;
        this.ma = taoMa(this.nhaXB);
    }
    public String getNhaXB() {
        return nhaXB;
    }
    public double getGia() {
        return gia;
    }
    public static String chuanHoa (String x){
        String []a = x.trim().split("\\s+");
        int n = a.length;
        String ans = Character.toUpperCase(a[0].charAt(0)) + a[0].substring(1).toLowerCase() + " ";
        for(int i = 1; i < n; i++) ans += a[i].toLowerCase() + " "; 
        return ans.trim();
    }
    public String taoMa(String nhaXB){
        String []x = nhaXB.toUpperCase().trim().split("\\s+");
        String res = "";
        for(String y: x) res += y.charAt(0);
        sMa++;
        return String.format("%s%03d", res, sMa);
    }
    @Override
    public String toString() {
        return this.nhaXB + ":" + this.ma + " " + this.ten + " " + this.nhaXB + " " + String.format("%.0f", this.gia);
    }
}

class QLSach {
    private List<Sach> a;
    public QLSach() {
        this.a = new ArrayList<>();
    }
    public void nhap(Scanner in) {
        String ten= in.nextLine();
        String nxb = in.nextLine();
        double gia = Double.parseDouble(in.nextLine());
        Sach s = new Sach(ten, nxb, gia);
        this.a.add(s);
    }
    public void maxGiaTheoNXB() {
        Map<String, Sach> mp = new HashMap<>();
        for (Sach s: this.a) {
            String nxb = s.getNhaXB();
            double res = s.getGia(); //Giá cuốn sách hiện tại
            if (!mp.containsKey(nxb) || res > mp.get(nxb).getGia()) mp.put(nxb, s);
        }

        // Lấy danh sách các cuốn sách có giá cao nhất
        List<Sach> ketQua = new ArrayList<>(mp.values());
        // Sắp xếp danh sách này theo Tên Nhà xuất bản
        Collections.sort(ketQua, new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                if (s1.getGia() < s2.getGia()) return -1; 
                else if (s1.getGia() > s2.getGia()) return 1;  
                else return 0;  
            }
        });
        for (Sach s: ketQua) System.out.println(s);
    }

}
public class QUAN_LY_SACH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLSach q = new QLSach();
        for (int i = 0; i < 4; i++) {
            q.nhap(in);
        }
        q.maxGiaTheoNXB();
    }
}
/*
toan lop 6
giaO   duc
50000
ngu van 4
Su pham
40000
hoa hoc 7
GIAO Duc
95000
cong dan 12
SU Pham
38000
*/
