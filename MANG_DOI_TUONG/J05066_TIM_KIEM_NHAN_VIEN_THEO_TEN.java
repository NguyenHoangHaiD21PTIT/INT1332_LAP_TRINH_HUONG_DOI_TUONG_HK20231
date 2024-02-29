import java.util.*;
import java.io.*;
class NV{
    private String chucvu, id, heso, name;
    public NV(String s){ //coi mã nhân viên và họ tên là cả 1 xâu, rồi tách theo dấu cách. Trong đó mã nhân viên là xâu con đầu tiên
        String []a = s.trim().split("\\s+");
        this.id = a[0].substring(4);//3 ký tự cuối MNV là số hiệu
        this.chucvu = a[0].substring(0,2);//Chức vụ 
        this.heso = a[0].substring(2, 4);//Hệ số lương
        //Họ tên chính là toàn bộ phần còn lại của xâu s sau khi lấy đi mã nhân viên
        this.name = "";
        for(int i = 1;i<a.length;i++){
            this.name+=a[i]+" ";
        }
    }
    public String toString(){
        return this.name + this.chucvu + " " + this.id + " " + this.heso;
    }
    public String getchuc(){
        return this.chucvu;
    }
    public void setchuc(String s){
        this.chucvu = s;
    }
    public String getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String geths(){
        return this.heso;
    }
}
public class J05066_TIM_KIEM_NHAN_VIEN_THEO_TEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        int n = sc.nextInt();
        sc.nextLine();
        NV []a = new NV[n];
        HashMap<String, Integer>mp = new HashMap<>();
        //mp[i] lưu tần suất xuất hiện của chức vụ khi đếm
        for(int i = 0;i<n;i++)a[i] = new NV(sc.nextLine());
        for(NV x: a){
            String s1 = x.getchuc();
            int s2 = Integer.parseInt(x.getid());
            if((s1.equals("GD") && s2 > 1) ||(s1.equals("TP") && s2 > 3) || (s1.equals("PP") && s2 > 3)) x.setchuc("NV");
        }
        Arrays.sort(a, new Comparator<NV>(){
            public int compare (NV a, NV b){
                if(!a.geths().equals(b.geths())) return b.geths().compareTo(a.geths());
                return a.getid().compareTo(b.getid());
            }
        });
        int q = sc.nextInt();
        while(q-- >0){
            sc.nextLine();
            String s = sc.next().trim();
            for(NV x: a){
                if (x.getname().toLowerCase().contains(s.toLowerCase())) System.out.println(x);
            }
            System.out.println();
        }
    }
} 
