package VAO_RA_FILE;
import java.util.*;
import java.io.*;
class Monthi{
    private String idm, name, hinhthuc;
    public Monthi(String idm, String name, String hinhthuc) {
        this.idm = idm;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }
    public String getIdm() {
        return idm;
    }
    public String getName() {
        return name;
    }  
}
class Cathi implements Comparable<Cathi>{
    private String idct, ngay, gio, phong, idmon, nhomhp, sosv;
    public Cathi(int x, String ngay, String gio, String phong) {
        this.idct = String.format("C%03d", x);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }
    public String getIdct() {
        return idct;
    }
    public String getIdmon() {
        return idmon;
    }   
    public String getPhong() {
        return phong;
    }
    public String getNgay() {
        return ngay;
    }
    public String getGio() {
        return gio;
    }

    public String getNhomhp() {
        return nhomhp;
    }
    public String getSosv() {
        return sosv;
    }
    @Override
    public int compareTo(Cathi t) {
        String []a1 = this.ngay.trim().split("/");
        String []a2 = t.ngay.trim().split("/");
        if(!a1[2].equals(a2[2])) return a1[2].compareTo(a2[2]);
        if(!a1[1].equals(a2[1])) return a1[1].compareTo(a2[1]);
        if(!a1[0].equals(a2[0])) return a1[0].compareTo(a2[0]);
        if(!this.gio.equals(t.gio)) return this.gio.compareTo(t.gio);
        return this.idct.compareTo(t.idct);
    }
    public void solve(String mamon, String nhomhp, String sosv){
        this.idmon = mamon;
        this.nhomhp = nhomhp;
        this.sosv = sosv;
    }
}
class LichThi{
    private String idcathi, idmon, nhomhp, sosv;
    public LichThi(String idcathi, String idmon, String nhomhp, String sosv) {
        this.idcathi = idcathi;
        this.idmon = idmon;
        this.nhomhp = nhomhp;
        this.sosv = sosv;
    }
    public String getIdcathi() {
        return idcathi;
    }
    public String getIdmon() {
        return idmon;
    }
    public String getNhomhp() {
        return nhomhp;
    }
    public String getSosv() {
        return sosv;
    }
}
public class J07060_SAP_XEP_LICH_THI {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("MONTHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp1 = new HashMap<>();
        Monthi []a = new Monthi[n];
        for(int i = 0;i<n;i++){
            a[i] = new Monthi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp1.put(a[i].getIdm(), a[i].getName());
        }
        sc = new Scanner (new File("CATHI.in"));
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp2 = new HashMap<>();
        Cathi []b = new Cathi[m];
        for(int i = 0;i<m;i++){
            b[i] = new Cathi(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp2.put(b[i].getIdct(), b[i].getNgay() + " " + b[i].getGio() + " " + b[i].getPhong());
        }
        Arrays.sort(b);
        sc = new Scanner (new File("LICHTHI.in"));
        int p = sc.nextInt();
        LichThi []c = new LichThi[p];
        for(int i = 0;i<p;i++){
            sc.nextLine();
            c[i] = new LichThi(sc.next(), sc.next(), sc.next(), sc.next());
        }
        for(Cathi x: b){
            for(LichThi y: c){
                if(x.getIdct().equals(y.getIdcathi())){
                    x.solve(y.getIdmon(), y.getNhomhp(), y.getSosv());
                    break;
                }
            }
        }
        for(Cathi x: b){
            System.out.println(mp2.get(x.getIdct()) + " " + mp1.get(x.getIdmon()) + " " +x.getNhomhp() + " " + x.getSosv());
        }
    }
}
