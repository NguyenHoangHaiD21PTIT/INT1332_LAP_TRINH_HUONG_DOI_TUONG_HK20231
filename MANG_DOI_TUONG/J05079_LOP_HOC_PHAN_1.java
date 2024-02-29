import java.util.*;
class HocPhan{
    private String id, ten, nhom, gv;
    public HocPhan(String id, String ten, String nhom, String gv){
        this.id = id;
        this.ten = ten;
        this.nhom = nhom;
        this.gv = gv;
    }
    public String getnhom(){
        return this.nhom;
    }
    public String getten(){
        return this.ten;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.nhom + " " + this.gv;
    }
}
public class J05079_LOP_HOC_PHAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HocPhan []a = new HocPhan[n];
        LinkedHashMap<String, String>mp = new LinkedHashMap<>();
        for(int i = 0;i<n;i++){
            a[i] = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp.put(a[i].getid(), a[i].getten());
        }
        //Ví dụ: mp[THCS2] = Tin hoc co so 2
        Arrays.sort(a, new Comparator<HocPhan>(){
            public int compare(HocPhan a, HocPhan b){
                return a.getnhom().compareTo(b.getnhom());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.next();
            System.out.println("Danh sach nhom lop mon " + mp.get(s)+":");
            for(HocPhan x: a){
                if(x.getid().equals(s)) System.out.println(x);
            }
        }
    }
}