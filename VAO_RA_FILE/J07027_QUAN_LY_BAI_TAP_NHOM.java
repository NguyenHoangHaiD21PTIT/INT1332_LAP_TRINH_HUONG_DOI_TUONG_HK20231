import java.util.*;
import java.io.*;
class Nhom{
    private String msv; 
    private int nhom;
    public Nhom(String msv, int nhom) {
        this.msv = msv;
        this.nhom = nhom;
    }
    public String getMsv() {
        return msv;
    }
    public int getNhom() {
        return nhom;
    }  
}
public class J07027_QUAN_LY_BAI_TAP_NHOM {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        HashMap<String, String>mp1 = new HashMap<>();
        sc.nextLine();
        for(int i = 0;i<n;i++){
            String msv = sc.nextLine(), ten = sc.nextLine(), sdt = sc.nextLine();
            mp1.put(msv, ten +" "+ sdt);
        }
        sc = new Scanner(new File("BAITAP.in"));
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<Integer, String>mp2 = new HashMap<>();
        for(int i = 1;i<=m;i++){
            String s = sc.nextLine();
            mp2.put(i, s);
        }
        sc = new Scanner(new File("NHOM.in"));
        Nhom []a = new Nhom[n];
        for(int i = 0;i<n;i++){
            a[i] = new Nhom(sc.next(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a, new Comparator<Nhom>() {
            @Override
            public int compare(Nhom t, Nhom t1) {
                return t.getMsv().compareTo(t1.getMsv());
            }
        });
        for(Nhom x: a){
            System.out.println(x.getMsv() + " " + mp1.get(x.getMsv()) + " " + x.getNhom() + " " + mp2.get(x.getNhom()));
        }
    }
}
