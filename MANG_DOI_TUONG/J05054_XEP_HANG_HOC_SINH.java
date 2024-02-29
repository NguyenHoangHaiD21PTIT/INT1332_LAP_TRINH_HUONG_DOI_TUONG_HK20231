import java.util.*;
import java.io.*;
class HocS{
    private String name, id, xeploai;
    private double gpa;
    public HocS(int x, String name, double gpa){
        this.id = "HS" + String.format("%02d", x);
        this.name = name;
        this.gpa = gpa;
        if(this.gpa >= 9.0) this.xeploai = "Gioi";
        else if (this.gpa >= 7.0) this.xeploai = "Kha";
        else if (this.gpa >=5.0) this.xeploai = "Trung Binh";
        else  this.xeploai = "Yeu"; 
    }
    public double getgpa(){
        return this.gpa;
    }
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.1f", this.gpa) +" " + this.xeploai;
    }
}
public class J05054_XEP_HANG_HOC_SINH {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Double>b = new ArrayList<>(); //Mảng lưu các giá trị khác nhau của điểm
        HocS []a = new HocS[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HocS(i + 1, sc.nextLine(), sc.nextDouble());
        }
        //Đếm tần suất các giá trị khác nhau của điểm, lọc ra các giá trị phân biệt
        LinkedHashMap<Double, Integer>mp = new LinkedHashMap<>();
        for(HocS x: a){
            double tmp = x.getgpa();
            if(mp.containsKey(tmp)) mp.put(tmp, mp.get(tmp) + 1);
            else {
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
        for(HocS p: a){
            System.out.print(p);
            System.out.println(" " + mp1.get(p.getgpa()));
        }
    }
} 
/*
3
Tran Minh Hieu
5,9
Nguyen Bao Trung
8,6
Le Hong Ha
9,2
*/