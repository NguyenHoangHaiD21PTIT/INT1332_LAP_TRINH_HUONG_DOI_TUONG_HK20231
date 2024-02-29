import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.io.*;
class LuuTru{
    public static long chenhlech(String s1, String s2){
        String []a = s1.split("/");
        String []b = s2.split("/");
        int nam1 = Integer.parseInt(a[2]), thang1 = Integer.parseInt(a[1]), ngay1 = Integer.parseInt(a[0]);
        int nam2 = Integer.parseInt(b[2]), thang2 = Integer.parseInt(b[1]), ngay2 = Integer.parseInt(b[0]);
        LocalDate d1 = LocalDate.of(nam1, thang1, ngay1);
        LocalDate d2 = LocalDate.of(nam2, thang2, ngay2);
        return ChronoUnit.DAYS.between(d1, d2);
    }
    private String id, name, phong, den, di;
    private long ngayo;
    public LuuTru(int x, String name, String phong, String den, String di){
        this.id = "KH" + String.format("%02d", x);
        this.name = name;
        this.phong = phong;
        this.den = den;
        this.di = di;
        this.ngayo = chenhlech(this.den, this.di);
    }
    public long geto(){
        return this.ngayo;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.phong + " " + this.ngayo;
    }
}
public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        LuuTru []a = new LuuTru[n];
        for(int i = 0;i<n;i++){
            a[i] = new LuuTru(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<LuuTru>(){
            public int compare(LuuTru a, LuuTru b){
                if(a.geto() > b.geto()) return -1;
                else return 1;
            }
        });
        for(LuuTru x: a) System.out.println(x);
    }
}






