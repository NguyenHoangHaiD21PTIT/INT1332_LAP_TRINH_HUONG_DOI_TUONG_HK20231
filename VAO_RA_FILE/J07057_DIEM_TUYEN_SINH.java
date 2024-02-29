import java.util.*;
import java.io.*;
class TS{
    private String id, name, diem, dantoc, kv, status;
    private double diemthi, uutien, diemfinal;
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    public TS(int x, String name, String diem, String dantoc, String kv){
        this.id = "TS" + String.format("%02d", x);
        this.name = chuanhoa2(name);
        this.diemthi = Double.parseDouble(diem);
        this.dantoc = dantoc;
        this.kv = kv;
        this.uutien = 0;
        if(this.kv.equals("1")){
            this.uutien += 1.5;
        } else if (this.kv.equals("2")){
            this.uutien += 1.0;
        } 
        if(!this.dantoc.equals("Kinh")){
            this.uutien +=1.5;
        }
        this.diemfinal = this.diemthi + this.uutien;
        if(this.diemfinal>=20.5){
            this.status = "Do";
        } else {
            this.status = "Truot";
        }
    }
    public String toString(){
        return this.id + " " + this.name + String.format("%.1f", this.diemfinal) + " " + this.status;
    }
    public String getid(){
        return this.id;
    }
    public double getfinal(){
        return this.diemfinal;
    }
}
public class J07057_DIEM_TUYEN_SINH {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = sc.nextInt();
            sc.nextLine();
            TS []a = new TS[n];
            for(int i = 0;i<n;i++){
                a[i] = new TS(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<TS>(){
                public int compare(TS a, TS b){
                    if(a.getfinal()!=b.getfinal()){
                        if(a.getfinal() > b.getfinal()) return -1;
                        else return 1;
                    }
                    return a.getid().compareTo(b.getid());
                }
            });
            for(TS x: a) System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
