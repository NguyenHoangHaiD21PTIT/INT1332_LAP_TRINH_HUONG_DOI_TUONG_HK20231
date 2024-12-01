package KTCL;
import java.io.*;
import java.util.*;
class Student{
    private String msv, ten, deTai, time;
    public Student(String msv, String ten, String deTai) {
        this.msv = msv;
        this.ten = ten;
        this.deTai = deTai;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.deTai + " " + this.time;
    }
}
public class JP_BaoCaoThucTapTheoCa {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("BAITAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student>a = new ArrayList<>();
        for(int i = 0;i<n;i++) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        sc = new Scanner(new File("BAOCAO.in"));
        for(int i = 0;i<n;i++){
            String msv = sc.nextLine(), gio = sc.nextLine();
            a.get(i).setTime(gio);
        }
        ArrayList<Student>sang = new ArrayList<>(), chieu = new ArrayList<>();
        for(Student x: a){
            String gio = x.getTime();
            String []tmp = gio.trim().split(":");
            int x1 = Integer.parseInt(tmp[0].trim()), y1 = Integer.parseInt(tmp[1].trim());
            if(x1 < 12) sang.add(x);
            else{
                x1-=12;
                String newTime = String.format("%02d:%d", x1, y1);
                x.setTime(newTime);
                chieu.add(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN BAO CAO CA SANG: " + sang.size());
        for(Student x: sang) System.out.println(x);
        System.out.println();
        System.out.println("DANH SACH SINH VIEN BAO CAO CA CHIEU: " + chieu.size());
        for(Student x: chieu) System.out.println(x);
    }
}
