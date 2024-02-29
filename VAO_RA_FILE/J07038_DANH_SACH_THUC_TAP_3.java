import java.util.*;
import java.io.*;
class Sinh_Vien {
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    private String msv, ten, lop, mail, dn;
    public Sinh_Vien(String msv, String ten, String lop, String mail) {
        this.msv = msv.trim();
        this.ten = chuanhoa2(ten).trim();
        this.lop = lop.trim();
        this.mail = mail.trim();
    }
    public String getMsv() {
        return msv;
    }
    public String getTen() {
        return ten;
    }
    public String getLop() {
        return lop;
    }
}
class DoanhNghiep{
    private String id, ten;
    private int slot;
    public DoanhNghiep(String id, String ten, int slot) {
        this.id = id.trim();
        this.ten = ten.trim();
        this.slot = slot;
    }
    public String getTen() {
        return ten;
    }
    public String getId() {
        return id;
    }
    public int getSlot() {
        return slot;
    }   
}

class Thuc_Tap implements Comparable<Thuc_Tap>{
    private String msv, mdn;
    public Thuc_Tap(String msv, String mdn) {
        this.msv = msv.trim();
        this.mdn = mdn.trim();
    }
    public String getMdn() {
        return mdn;
    }
    public String getMsv() {
        return msv;
    } 
    public void setMdn(String mdn) {
        this.mdn = mdn;
    }  
    @Override
    public int compareTo(Thuc_Tap t) {
        return this.msv.compareTo(t.msv);
    }
}

public class J07038_DANH_SACH_THUC_TAP_3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Sinh_Vien[] a = new Sinh_Vien[n];
        HashMap<String, String> mp1 = new HashMap<>();//key: MSV, value: tên + lớp
        for (int i = 0; i < n; i++) {
            a[i] = new Sinh_Vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp1.put(a[i].getMsv(), a[i].getTen() + " " + a[i].getLop());
        }
        sc = new Scanner(new File("DN.in"));
        int m = sc.nextInt();
        HashMap<String, String>mp2 = new HashMap<>();//key: mã dn, val: tên dn
        HashMap<String, Integer>mp3 = new HashMap<>();//key: mã dn, val: số lượng
        DoanhNghiep[] b = new DoanhNghiep[m];
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            b[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            mp2.put(b[i].getId(), b[i].getTen());
            mp3.put(b[i].getId(), b[i].getSlot());
        }
        sc = new Scanner(new File("THUCTAP.in"));
        int p = sc.nextInt();
        Thuc_Tap[] c = new Thuc_Tap[p];
        for (int i = 0; i < p; i++) {
            sc.nextLine();
            c[i] = new Thuc_Tap(sc.next(), sc.next());
        }
        Arrays.sort(c);
        HashMap<String, Integer>mp4 = new HashMap<>();
        for(Thuc_Tap x: c){
            String s = x.getMdn();
            if(mp4.containsKey(s)) mp4.put(s, mp4.get(s) + 1);
            else mp4.put(s, 1);
            if(mp4.get(s) > mp3.get(s)) x.setMdn("NONE");
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            System.out.println("DANH SACH THUC TAP TAI " + mp2.get(s) +":");
            for(Thuc_Tap x: c){
                if(x.getMdn().equals(s)){ 
                    System.out.println(x.getMsv() + " " + mp1.get(x.getMsv()));
                }
            }        
        }
    }
}
