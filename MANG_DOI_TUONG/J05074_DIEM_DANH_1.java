/*import java.util.*;
import java.io.*;
class NguoiHoc{
    private String msv, ten, lop,;
    private int chuyencan;
    public NguoiHoc(String msv, String ten, String lop){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.chuyencan = 10;
    }
    public String getmsv(){ //Lấy mã sinh viên
        return this.msv;
    }
    public void setcc(int x){ //Thay đổi điểm chuyên cần
        this.chuyencan = x;
    } 
    public int getcc(){ //Tính điểm chuyên cần
        return this.chuyencan;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.lop + " " + this.chuyencan + " ";
    }
}
public class J05074_DIEM_DANH_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, String>mp = new LinkedHashMap<>();
        NguoiHoc []a = new NguoiHoc[n];
        for(int i = 0;i<n;i++) a[i] = new NguoiHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            String []tmp = s.trim().split("\\s+");
            mp.put(tmp[0], tmp[1]);
        }
        for(NguoiHoc x: a){
            String s = mp.get(x.getmsv());
            for(char p: s.toCharArray()){
                if(p =='v') x.setcc(x.getcc() - 2);
                else if (p =='m') x.setcc(x.getcc() - 1);
            }
            if(x.getcc()<=0){
                x.setcc(0);
            }
        }
        for(NguoiHoc x: a){
            System.out.print(x);
            if(x.getcc()==0) System.out.print("KDDK");
            System.out.println();
        }
    }
}*/
