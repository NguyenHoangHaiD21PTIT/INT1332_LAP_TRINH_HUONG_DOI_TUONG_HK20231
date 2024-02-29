import java.util.*;
import java.io.*;
class HoBo{
    private String name, loai;
    private double gpa; private int drl;
    public HoBo(String name, double gpa, int drl){
        this.name = name;
        this.gpa = gpa;
        this.drl = drl;
        if(this.gpa >= 3.6 && this.drl >= 90) this.loai = "XUATSAC"; 
        else if(this.gpa >= 3.2 && this.drl >= 80) this.loai = "GIOI"; 
        else if(this.gpa >= 2.5 && this.drl >= 70) this.loai = "KHA"; 
        else this.loai = "KHONG";
    }
    public String toString(){
        return this.name + ": " + this.loai;
    }
    public double getgpa(){
        return this.gpa;
    }
    public void setloai(String s){
        this.loai = s;
    }
}
public class J05062_HOC_BONG_SINH_VIEN {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), chitieu = sc.nextInt();
        HoBo []a = new HoBo[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HoBo(sc.nextLine(), sc.nextDouble(), sc.nextInt());
        }
        HoBo []b = a.clone();
        Arrays.sort(a, new Comparator<HoBo>(){
            public int compare(HoBo a, HoBo b){
                if(a.getgpa() > b.getgpa()) return -1;
                else return 1;
            }
        });
        double diemchuan = a[chitieu - 1].getgpa();
        for(HoBo x: a){
            if(x.getgpa()< diemchuan) x.setloai("KHONG");
        }
        for(HoBo x: b) System.out.println(x);
    }
}
