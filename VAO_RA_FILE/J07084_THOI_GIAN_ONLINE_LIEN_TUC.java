import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Coder implements Comparable<Coder>{
    public static long chenhlech(String s1, String s2){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime bd = LocalDateTime.parse(s1, d);
        LocalDateTime kt = LocalDateTime.parse(s2, d);
        return java.time.Duration.between(bd, kt).toMinutes();
    }
    private String ten, batDau, ketThuc;
    private long soPhut;
    public Coder(String ten, String batDau, String ketThuc) {
        this.ten = ten;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.soPhut = chenhlech(this.batDau, this.ketThuc);
    }
    @Override
    public int compareTo(Coder t) {
        if(this.soPhut!=t.soPhut){
            if(this.soPhut > t.soPhut) return -1;
            else return 1;
        }
        return this.ten.compareTo(t.ten);
    }
    public String toString(){
        return this.ten + " " + this.soPhut;
    }
}
public class J07084_THOI_GIAN_ONLINE_LIEN_TUC {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Coder []a = new Coder[n];
        for(int i = 0;i<n;i++) a[i] = new Coder(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Coder x: a) System.out.println(x);
    }
}
