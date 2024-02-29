package MANG_DOI_TUONG;
import java.util.*;
class Student{
    public static String chuanhoa(String s){
        String []a = s.trim().split("\\s+");
        String res = "";
        for(String x: a) res+=Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        return res.trim();
    }
    public static String chuanhoaNS(String s){ 
        if(s.charAt(1)=='/') s = "0" + s;
        if(s.charAt(4)=='/') s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }
    private String id, msv, name, ngaySinh, queQuan;
    private int ngay, thang, nam;
    public Student(int x, String msv, String name, String ngaySinh, String queQuan) {
        this.id = "SV" + String.format("%02d", x);
        this.msv = msv;
        this.name = chuanhoa(name);
        this.ngaySinh = chuanhoaNS(ngaySinh);
        this.queQuan = queQuan;
        String []a = this.ngaySinh.trim().split("/");
        this.nam = Integer.parseInt(a[2]);
        this.thang = Integer.parseInt(a[1]);
        this.ngay = Integer.parseInt(a[0]);
    }
    public String getMsv() {
        return msv;
    }
    public String getName() {
        return name;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public String getQueQuan() {
        return queQuan;
    } 
    public int getNgay() {
        return ngay;
    }
    public int getThang() {
        return thang;
    }
    public int getNam() {
        return nam;
    }
    public String toString(){ 
        return this.id + " " + this.msv + " " + this.name + " " + this.ngaySinh + " " + this.queQuan;
    }
}
public class BAI_96_TRUY_VAN_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student>a1 = new ArrayList<>();
        for(int i = 1;i<=t;i++) a1.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        int q = sc.nextInt(), ok = 0;
        sc.nextLine();
        while(q-- >0){ 
            String s = sc.nextLine();
            ok = 0;
            ArrayList<Student> a = (ArrayList<Student>) a1.clone();
            if(s.startsWith("1")){ 
                s = s.substring(2);
                Collections.sort(a, new Comparator<Student>(){
                    public int compare(Student a, Student b){ 
                        return a.getName().compareTo(b.getName());
                    }
                });
                for(Student y: a){ 
                    if(y.getQueQuan().equals(s)){ 
                        ok = 1;
                        System.out.println(y);
                    }
                }
                if(ok ==0) System.out.println("-1");
            } else if (s.startsWith("2")){ 
                int x1 = Integer.parseInt(s.substring(2));
                Collections.sort(a, new Comparator<Student>(){
                    public int compare(Student a, Student b){ 
                        if(a.getThang()!=b.getThang()) return b.getThang() - a.getThang();
                        return b.getNgay() - a.getNgay();
                    }
                });
                for(Student y: a){ 
                    if(y.getNam()==x1){ 
                        ok = 1;
                        System.out.println(y);
                    }
                }
                if(ok ==0) System.out.println("-1");
            } else if (s.startsWith("3")){ 
                Collections.sort(a, new Comparator<Student>(){
                    public int compare(Student a, Student b){ 
                        return a.getMsv().compareTo(b.getMsv());
                    }
                });
                for(Student y: a) System.out.println(y); 
            } else if (s.startsWith("4")){
                s = s.substring(2);
                for(Student y: a){
                    ok = 1;
                    if(y.getName().toLowerCase().contains(s.toLowerCase())) System.out.println(y);
                }
                if(ok==0) System.out.println("-1");
            }
            System.out.println();
        }
    }
}