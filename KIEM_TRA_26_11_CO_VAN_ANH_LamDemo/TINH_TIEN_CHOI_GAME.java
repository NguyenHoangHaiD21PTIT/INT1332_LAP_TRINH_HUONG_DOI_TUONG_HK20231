package KIEM_TRA_26_11_CO_VAN_ANH_LamDemo;
import java.util.*;
import java.io.*;
class NguoiChoi implements Comparable<NguoiChoi>{
    private String maKH, hoTen, tenMay, gioVao, gioRa;
    private long thoiGian, tienAn, tienChoi;
    public static String chuanHoa(String s){ 
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        return res.trim();
    }
    public static int chenhLech(String s1, String s2){ 
        String []a = s1.trim().split(":");
        String []b = s2.trim().split(":");
        int gioVao = Integer.parseInt(a[0]), phutVao = Integer.parseInt(a[1]), gioRa = Integer.parseInt(b[0]), phutRa = Integer.parseInt(b[1]);
        double tmp = (gioRa*60 + phutRa - gioVao*60 - phutVao)/60.0;
        return (int)Math.ceil(tmp);
    }
    public NguoiChoi(int x, String hoTen, String tenMay, String gioVao, String gioRa, long tienAn) {
        this.maKH = "KH" + String.format("%02d", x);
        this.hoTen = chuanHoa(hoTen);
        this.tenMay = tenMay;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.tienAn = tienAn;
        this.thoiGian = chenhLech(this.gioVao, this.gioRa);
        if(this.tenMay.startsWith("Hacom")){ 
            this.tienChoi = this.thoiGian * 100000;
        } else if (this.tenMay.startsWith("Dell")){ 
            this.tienChoi = this.thoiGian * 70000;
        } else {
            this.tienChoi = this.thoiGian * 40000;
        }
    }
    public String toString(){ 
        return this.maKH + " " + this.hoTen + " " + this.tenMay + " " + this.thoiGian + " " + this.tienChoi;
    }
    @Override
    public int compareTo(NguoiChoi t) {
        if(this.thoiGian > t.thoiGian) return 1;
        else return -1;
    }
}
public class TINH_TIEN_CHOI_GAME {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("game.dat"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NguoiChoi>a = new ArrayList<>();
        for(int i = 1;i<=t;i++){
            a.add(new NguoiChoi(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(a);
        for(NguoiChoi x: a) System.out.println(x);
    }
}
