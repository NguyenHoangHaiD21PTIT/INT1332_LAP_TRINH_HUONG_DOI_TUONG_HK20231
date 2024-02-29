import java.util.*;
import java.io.*;
class SinhV{
    public static String chuanhoa1(String s){ //Chuẩn hóa từ trong tên
        return Character.toUpperCase(s.charAt(0)) + s .substring(1).toLowerCase();
    }
    public static String chuanhoa2(String s){ //Chuẩn hóa cả xâu họ tên
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=chuanhoa1(x) + " ";
        return res;
    }
    private String name, id;
    private double x1, x2, x3, tbc;
    public SinhV(int x, String name, double x1, double x2, double x3){
        this.id = "SV" + String.format("%02d", x);
        this.name = chuanhoa2(name);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.tbc = (this.x1 * 3.0 + this.x2 * 3.0 + this.x3 * 2.0)/8.0;
    }
    public double gettbc(){
        return this.tbc;
    }
    public String toString(){
        return this.id + " " + this.name + String.format("%.2f", this.tbc);
    }
    public String getid(){
        return this.id;
    }
}
public class J07054_TINH_DIEM_TRUNG_BINH {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\VAO_RA_FILE\\BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<Double>b = new ArrayList<>(); //Mảng lưu các giá trị khác nhau của điểm
        SinhV []a = new SinhV[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new SinhV(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        //Đếm tần suất các giá trị khác nhau của điểm
        LinkedHashMap<Double, Integer>mp = new LinkedHashMap<>();
        for(SinhV x: a){
            double tmp = x.gettbc();
            if(mp.containsKey(tmp)){
                int freq = mp.get(tmp);
                freq++;
                mp.put(tmp, freq);
            } else {
                b.add(tmp);
                mp.put(tmp, 1);
            }
        }
        //Sắp xếp mảng các điểm khác nhau giảm dần
        Collections.sort(b, new Comparator<Double>(){
            public int compare(Double a, Double b){
                if(a > b) return -1;
                else return 1;
            }
        });
        //Tiến hành xét hạng điểm 
        LinkedHashMap<Double, Integer>mp1 = new LinkedHashMap<>(); //vector luu hạng điểm
        mp1.put(b.get(0), 1);
        int x = 1;
        for(int i = 1;i<b.size();i++){
            x+=mp.get(b.get(i - 1));
            mp1.put(b.get(i), x);
        }
        Arrays.sort(a, new Comparator<SinhV>(){
            public int compare(SinhV a, SinhV b){
                if(a.gettbc()!=b.gettbc()){
                    if(a.gettbc() > b.gettbc()) return -1;
                    else return 1;
                }
                return a.getid().compareTo(b.getid());
            }
        });
        for(SinhV p: a){
            System.out.print(p);
            System.out.println(" " + mp1.get(p.gettbc()));
        }
    }
} 