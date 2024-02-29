import java.util.*;
import java.io.*;
class ThanhPho{
    private String maVung, ten;
    private int giaCuoc;
    public ThanhPho(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }
    public String getMaVung() {
        return maVung;
    }
    public String getTen() {
        return ten;
    }
    public int getGiaCuoc() {
        return giaCuoc;
    }  
}
class CuocGoi implements Comparable<CuocGoi>{
    private String sdt, batDau, ketThuc, thanhPho;
    private int soPhut, giaCuoc, tongTien;
    public CuocGoi(String sdt, String batDau, String ketThuc){
        this.sdt = sdt;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        String []a = this.batDau.trim().split(":");
        String []b = this.ketThuc.trim().split(":");
        long x1 = Integer.parseInt(a[0]), x2 = Integer.parseInt(a[1]), x3 = Integer.parseInt(b[0]), x4 = Integer.parseInt(b[1]);
        this.soPhut = (int) (x3 * 60 + x4 - x1 * 60 - x2);
    }
    public void setthanhPho(String s){
        this.thanhPho = s;
    }
    public void setgiaCuoc(int x){ 
        this.giaCuoc = x;
    }
    public void settongTien(int x){ 
        this.tongTien = x;
    }
    public int gettongTien(){
        return this.tongTien;
    }
    public String getsdt(){
        return this.sdt;
    }
    public int getsoPhut(){
        return this.soPhut;
    }
    public void setsoPhut(int x){
        this.soPhut = x;
    }
    public String toString(){ 
        return this.sdt + " " + this.thanhPho + " " + this.soPhut + " " + this.tongTien;
    }
    public int compareTo(CuocGoi b){
        return b .tongTien - this.tongTien;
    }
}
public class J05072_TINH_CUOC_DIEN_THOAI_CO_DINH_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ThanhPho []a = new ThanhPho[n];
        for(int i = 0;i<n;i++){
            a[i] = new ThanhPho(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        int m = sc.nextInt();
        CuocGoi []b = new CuocGoi[m];
        for(int i = 0;i<m;i++){
            sc.nextLine();
            b[i] = new CuocGoi(sc.next(), sc.next(), sc.next());
        }
        for(CuocGoi x: b){
            if(x.getsdt().charAt(0)!='0'){
                x.setthanhPho("Noi mang");
                x.setgiaCuoc(800);
                x.setsoPhut((int) Math.ceil((double) x.getsoPhut() / 3));
                x.settongTien(x.getsoPhut() * 800);
                continue;
            } 
            String s = x.getsdt().substring(1, 3);
            for(ThanhPho y: a){
                if(y.getMaVung().equals(s)){
                    x.setthanhPho(y.getTen());
                    x.setgiaCuoc(y.getGiaCuoc());
                    x.settongTien(x.getsoPhut() * y.getGiaCuoc());
                    break;
                }
            }
        }
        Arrays.sort(b);
        for(CuocGoi x: b) System.out.println(x);
    }
}
