package KIEM_TRA_14_10_CA_2;
import java.util.*;
import java.io.*;
class Bus{
    private String id, tenTaiXe, ngayDi, soHieu, mode;//mode: che do ngay thuong, nghi, le
    private long soLuot, doanhThu;
    public Bus(int x, String tenTaiXe, String ngayDi, String soHieu, long soLuot, String mode) {
        this.tenTaiXe = tenTaiXe;
        this.ngayDi = ngayDi;
        this.soHieu = soHieu;
        this.soLuot = soLuot;
        this.mode = mode;
        this.id = "HN" + this.soHieu + String.format("%02d", x);
        if(this.soLuot < 5){
            this.doanhThu = this.soLuot * 800;
        } else if (this.soLuot >=5 && this.soLuot <=10){
            this.doanhThu = this.soLuot * 780;
        } else {
            this.doanhThu = this.soLuot * 750;
        }
        if(this.mode.equals("nghi")){
            this.doanhThu = this.doanhThu * 110/100;
        } else if (this.mode.equals("le")) {
            this.doanhThu = this.doanhThu * 120/100;
        }
    }
    public String toString(){
        return this.id + " " + this.tenTaiXe + " " + this.ngayDi + " " + this.soHieu + " " + this.soLuot + " " + this.mode +" " +this.doanhThu;
    }
    public String getId() {
        return id;
    }
    public String getSoHieu() {
        return soHieu;
    }  
    public String getNgayDi() {
        return ngayDi;
    }  
    public void setId(String id) {
        this.id = id;
    }
    
}
public class KT2_17_SUA_TUYEN_XE_BUYT {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Bus []a = new Bus[n];
        for(int i = 0;i<n;i++){
            a[i] = new Bus(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
        }
        String ma = sc.nextLine();
        int check = 0;
        for(Bus x: a){
            if(x.getId().equals(ma)){
                check = 1;
                break;
            }
        }
        if(check ==0 ) System.out.println("khong tim thay");
        else{
            String ten = sc.nextLine();
            long soluot = Long.parseLong(sc.nextLine());
            String chedo = sc.nextLine();
            for(Bus x: a){
                if(x.getId().equals(ma)){
                    System.out.println(x);
                    Bus tmp = new Bus(0, ten, x.getNgayDi(), x.getSoHieu(), soluot, chedo);
                    tmp.setId(ma);
                    System.out.println(tmp);
                }
            }
        }
    }
}
