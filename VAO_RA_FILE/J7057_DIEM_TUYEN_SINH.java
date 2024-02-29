package FILE;

import  java.io.*;
import java.util.*;
class thisih{
    public static String chuanhoa1(String s){
        return Character.toUpperCase(s.charAt(0))+ s.substring(1).toLowerCase();
    }
    public static String chuanhoa(String s){
        String [] a = s.trim().split("\\s+");
        String res="";
        for(String x: a) res+= chuanhoa1(x)+" ";
        return res;
    }
    private String ma, hoten,diem, dantoc, kv, trangthai;
    private double dt, ut, xt;

    public thisih(int x, String hoten,String diem,String dantoc, String kv) {
        this.ma = "TS"+String.format("%02d", x);
        this.hoten = chuanhoa(hoten);
        this.dantoc = dantoc;
        this.kv = kv;
        this.dt =Double.parseDouble(diem);
        this.ut=0;
        if(this.kv.equals("1")) this.ut+=1.5;
        else if(this.kv.equals("2")) this.ut+=1;
        if(!this.dantoc.equals("Kinh")) this.ut+=1.5;
        this.xt = this.dt + this.ut; 
        if(this.xt >=20.5) this.trangthai="Do";
        else this.trangthai= "Truot";
    }

    public String getMa() {
        return ma;
    }

    public double getXt() {
        return xt;
    }
    public String toString(){
        return this.ma+" "+this.hoten+String.format("%.1f", this.xt)+" "+this.trangthai;
    }
}
public class J7057_DIEM_TUYEN_SINH {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\OneDrive\\Desktop\\JAVA\\src\\VAO_RA_FILE\\PT.in"));
        int n = sc.nextInt();
        sc.nextLine();
        thisih []a= new thisih[n];
        for(int i =0; i<n; i++){
            
            a[i]= new thisih(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<thisih>(){
            public int compare(thisih a, thisih b){
                if(a.getXt() != b.getXt()){
                    if(a.getXt() > b.getXt()) return -1;
                    else return 1;           
                }
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(thisih x: a) System.out.println(x);
        
    }
}