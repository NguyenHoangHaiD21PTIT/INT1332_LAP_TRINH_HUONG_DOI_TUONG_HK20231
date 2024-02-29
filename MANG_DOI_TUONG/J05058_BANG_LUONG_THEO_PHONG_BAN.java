import java.util.*;
import java.io.*;
class NhanV{
    private String id, name, phongban;
    private long luongcb, ngaycong, heso, tongluong;
    public NhanV(String id, String name, long luongcb, long ngaycong){
        this.id = id;
        this.name = name;
        this.luongcb = luongcb * 1000;
        this.ngaycong = ngaycong;
        char loai = this.id.charAt(0);
        int sonam = Integer.parseInt(this.id.substring(1, 3));
        this.phongban = this.id.substring(3);
        if(sonam >=1 && sonam <=3){
            if(loai=='A' || loai=='B') this.heso = 10;
            else if (loai == 'C') this.heso = 9;
            else this.heso = 8;
        } else if(sonam >=4 && sonam <=8){
            if(loai=='A') this.heso = 12;
            else if (loai == 'B') this.heso = 11;
            else if (loai == 'C') this.heso = 10;
            else this.heso = 9;
        } else if (sonam >=9 && sonam <=15){
            if(loai=='A') this.heso = 14;
            else if (loai == 'B') this.heso = 13;
            else if (loai == 'C') this.heso = 12;
            else this.heso = 11;
        } else {
            if(loai=='A') this.heso = 20;
            else if (loai == 'B') this.heso = 16;
            else if (loai == 'C') this.heso = 14;
            else this.heso = 13;
        }
        this.tongluong = this.luongcb * this.ngaycong * this.heso;
    }
    public String toString(){
        return this.id + " " + this.name;
    }
    public long getluong(){
        return this.tongluong;
    }
    public String getpban(){
        return this.phongban;
    }
}
public class J05058_BANG_LUONG_THEO_PHONG_BAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp = new HashMap<>();
        while(t-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            String res ="";
            for(int i = 1;i<a.length;i++) res+=a[i] + " ";
            mp.put(a[0], res.trim());
        }
        int n = sc.nextInt();
        NhanV []a = new NhanV[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new NhanV(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        } 
        String s = sc.next();
        System.out.println("Bang luong phong " + mp.get(s) + ":");
        for(NhanV x: a){
            if(x.getpban().equals(s)){
                System.out.println(x + " " + x.getluong());
            }
        }
        
    }
}
