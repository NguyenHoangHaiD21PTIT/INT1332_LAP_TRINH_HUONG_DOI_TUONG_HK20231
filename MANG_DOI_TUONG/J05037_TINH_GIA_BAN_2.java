import java.util.*;
import java.io.*;
class HHoa{
    private String id, name, dvt;
    private long dongia, sl, phivc, thanhtien, giaban;
    public HHoa(int x, String name, String dvt, long dongia, long sl){
        this.id = "MH" + String.format("%02d", x);
        this.name = name;
        this.dvt = dvt;
        this.dongia = dongia;
        this.sl = sl;
        this.phivc = Math.round(this.dongia * this.sl * 5.0/100.0);
        this.thanhtien = Math.round(this.dongia * this.sl + this.phivc);
        this.giaban = (int)Math.ceil((this.thanhtien * (102.0/100.0) / (this.sl *1.0))/100) *100 ;
    }
    public long getban(){
        return this.giaban;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.dvt + " " + this.phivc + " " +this.thanhtien + " " + this.giaban;
    }
}
public class J05037_TINH_GIA_BAN_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HHoa []a = new HHoa[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new HHoa(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<HHoa>(){
            public int compare(HHoa a, HHoa b){
                if(a.getban() > b.getban()) return -1;
                else return 1;
            }
        });
        for(HHoa x: a) System.out.println(x);
    }
} 
