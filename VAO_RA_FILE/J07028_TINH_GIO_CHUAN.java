import java.util.*;
import java.io.*;
class GV{
    private String id, subject;
    private double time;
    public GV(String s){
        String []a = s.trim().split("\\s+");//Phân tách xâu gồm mã GV, mã môn và tg dạy
        this.id = a[0];
        this.subject = a[1];
        this.time = Double.parseDouble(a[2]);
    }
    public String getid(){
        return this.id;
    }
    public double gettime(){
        return this.time;
    }
}
public class J07028_TINH_GIO_CHUAN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        //Số môn học
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- >0){
            String s = sc.nextLine();
        }
        //số GV
        sc = new Scanner(new File("GIANGVIEN.in"));
        HashMap<String, String>mp1 = new HashMap<>();//mp1[mã GV] = tên GV
        HashMap<String, Double>mp2 = new HashMap<>();//mp2[mã GV] = số giờ dạy
        //số lớp học
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- >0){
            String s = sc.nextLine(); //phân tách xâu gồm mã GV, tên GV
            String []a = s.trim().split("\\s+");
            String tmp = "";
            for(int i = 1;i<a.length;i++) tmp+=a[i] + " "; //tạo xâu tên GV
            mp1.put(a[0], tmp.trim()); //key là mã GV, value là tên GV
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = sc.nextInt();
        sc.nextLine();
        GV []a = new GV[k];
        for(int i = 0;i<k;i++) a[i] = new GV(sc.nextLine());
        ArrayList<String>tmp = new ArrayList<>();//List lưu mã GV
        for(GV x: a){
            String s = x.getid();//Lấy mã GV ra
            //Nếu có rồi thì cộng dồn số giờ dạy
            if(mp2.containsKey(s)) mp2.put(s, mp2.get(s) + x.gettime());
            //Chưa có thì cho vào list
            else{
                tmp.add(s);
                mp2.put(s, x.gettime());
            }
        }
        for(String x: tmp){
            System.out.print(mp1.get(x) + " ");//In tên tương ứng theo mã GV
            System.out.printf("%.2f", mp2.get(x));//In theo số giờ dạy tương ứng
            System.out.println();
        }
    }
} 
