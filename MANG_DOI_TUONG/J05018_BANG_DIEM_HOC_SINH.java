/*import java.util.*;
import java.io.*;
class HSinh{
    private String name, id;
    private double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, tbc;
    private String xeploai;
    public HSinh(int x, String name, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9, double x10){
        this.id = "HS" + String.format("%02d", x);
        this.name = name;
        this.x1 = x1; this.x2 = x2; this.x3 = x3; this.x4 = x4;this.x5 = x5;
        this.x6 = x6; this.x7 = x7; this.x8 = x8; this.x9 = x9;this.x10 = x10;
        this.tbc = (this.x1 * 2.0 + this.x2 * 2.0 + this.x3 + this.x4 + this.x5 + this.x6 + this.x7 + this.x8 + this.x9 + this.x10)/12.0;
        this.tbc = (double)Math.ceil(this.tbc * 10)/10;
        if(this.tbc >= 9.0){
            this.xeploai = "XUATSAC";
        } else if(this.tbc >= 8.0){
            this.xeploai = "GIOI";
        } else if(this.tbc >= 7.0){
            this.xeploai = "KHA";
        } else if(this.tbc >= 5.0){
            this.xeploai = "TB";
        } else {
            this.xeploai = "YEU";
        }
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.tbc + " " + this.xeploai;
    }
    public double gettb(){
        return this.tbc;
    }
    public String getid(){
        return this.id;
    }
}
public class J05018_BANG_DIEM_HOC_SINH {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        int n = sc.nextInt();
        HSinh []a = new HSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HSinh(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, new Comparator<HSinh>(){
            public int compare(HSinh a, HSinh b){
                if(a.gettb()!=b.gettb()){
                    if(a.gettb()>b.gettb()) return -1;
                    else return 1;
                }
                return a.getid().compareTo(b.getid());
            }
        });
        for(HSinh x: a) System.out.println(x);
    }
}
/*
3
Luu Thuy Nhi
9,3  9,0  7,1  6,5  6,2  6,0  8,2  6,7  4,8  5,5
Le Van Tam
8,0  8,0  5,5  9,0  6,8  9,0  7,2  8,3  7,2  6,8
Nguyen Thai Binh
9,0  6,4  6,0  7,5  6,7  5,5  5,0  6,0  6,0  6,0
*/