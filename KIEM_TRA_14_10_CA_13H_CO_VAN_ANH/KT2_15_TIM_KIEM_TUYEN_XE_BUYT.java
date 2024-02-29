package KIEM_TRA_14_10_CA_2;
import java.util.*;
import java.io.*;
class Bus implements Comparable<Bus>{
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

    @Override
    public int compareTo(Bus t) {
        String []a = this.ngayDi.trim().split("/");
        String []b = t.ngayDi.trim().split("/");
        int a0 = Integer.parseInt(a[0]), a1 = Integer.parseInt(a[1]), a2 = Integer.parseInt(a[2]);
        int b0 = Integer.parseInt(b[0]), b1 = Integer.parseInt(b[1]), b2 = Integer.parseInt(b[2]);
        if(a2!=b2) return b2 - a2;
        else if (a1!=b1) return b1 - a1;
        else return b0 - a0;
    }
    public int getthang(){
        return Integer.parseInt(this.ngayDi.substring(3, 5));
    }
}

public class KT2_15_TIM_KIEM_TUYEN_XE_BUYT {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Bus []a = new Bus[n];
        for(int i = 0;i<n;i++){
            a[i] = new Bus(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
        }
        Arrays.sort(a);
        int y = sc.nextInt();
        int check = 0;
        for(Bus x: a){
            if(x.getthang()==y){
                check = 1;
                System.out.println(x);
                break;
            }
        }
        if(check==0) System.out.println("khong co");
    }
}
