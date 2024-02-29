package KIEM_TRA_14_10_CA_13H_CO_VAN_ANH;
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
}
public class KT2_14_TAO_LOP_TUYEN_XE_BUYT {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Bus []a = new Bus[n];
        for(int i = 0;i<n;i++){
            a[i] = new Bus(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
        }
        for(Bus x: a) System.out.println(x);
    }
}
