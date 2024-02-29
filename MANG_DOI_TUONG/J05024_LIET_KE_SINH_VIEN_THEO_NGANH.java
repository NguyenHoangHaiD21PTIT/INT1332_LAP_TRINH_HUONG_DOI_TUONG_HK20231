import java.util.*;
import java.io.*;
class SV{
    private String msv, name, lop, email, nganh;
    public SV(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        if(this.msv.contains("DCKT")){
            this.nganh = "Ke toan";
        } 
        if (this.msv.contains("DCCN") && this.lop.charAt(0)!='E'){
            this.nganh = "Cong nghe thong tin"; 
        } 
        if (this.msv.contains("DCAT") && this.lop.charAt(0)!='E'){
            this.nganh = "An toan thong tin"; 
        } 
        if (this.msv.contains("DCVT")){
            this.nganh = "Vien thong";
        } 
        if (this.msv.contains("DCDT")){
            this.nganh = "Dien tu";
        }
    }
    public String getnganh(){
        return this.nganh;
    }
    public String toString(){
        return this.msv + " " + this.name + " " + this.lop + " " + this.email;
    }
}
public class J05024_LIET_KE_SINH_VIEN_THEO_NGANH {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SV> a = new ArrayList<>();
        while(n-- >0){        
            a.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for(SV x: a){
                if (x.getnganh().equalsIgnoreCase(s)) System.out.println(x);
            }
        }
    }
}
