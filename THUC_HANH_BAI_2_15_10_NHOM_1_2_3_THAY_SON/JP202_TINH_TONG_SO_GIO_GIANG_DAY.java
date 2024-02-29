package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
class GV1{
    private String id, subject;
    private double time;
    public GV1(String s){
        String []a = s.trim().split("\\s+");
        this.id = a[0];
        this.subject = a[1];
        this.time = Double.parseDouble(a[2]);
    }
    public String getid(){
        return this.id;
    }
    public double gettime(){
        return this.time;
    }
}
class MonHoc1{
    private String id, ten;
    public MonHoc1(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }
}
public class JP202_TINH_TONG_SO_GIO_GIANG_DAY {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();//n: số môn học
        sc.nextLine();
        MonHoc1 []a1 = new MonHoc1[n];
        for(int i = 0;i<n;i++){
            a1[i] = new MonHoc1(sc.next(), sc.nextLine());
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        HashMap<String, String>mp1 = new HashMap<>();//mp1[mã GV] = tên GV
        HashMap<String, Double>mp2 = new HashMap<>();//mp2[mã GV] = số giờ dạy
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            String tmp = "";
            for(int i = 1;i<a.length;i++) tmp+=a[i] + " ";
            mp1.put(a[0], tmp.trim());
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = sc.nextInt();
        sc.nextLine();
        GV1 []a = new GV1[k];
        for(int i = 0;i<k;i++) a[i] = new GV1(sc.nextLine());
        ArrayList<String>tmp = new ArrayList<>();
        for(GV1 x: a){
            String s = x.getid();
            if(mp2.containsKey(s)) mp2.put(s, mp2.get(s) + x.gettime());
            else{
                tmp.add(s);
                mp2.put(s, x.gettime());
            }
        }
        for(String x: tmp){
            System.out.print(mp1.get(x) + " ");
            System.out.printf("%.2f", mp2.get(x));
            System.out.println();
        }
    }
} 
