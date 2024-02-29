/*import java.util.*;
import java.io.*;
class NV{
    private String chucvu, id, heso, name;
    public NV(String s){
        String []a = s.trim().split("\\s+");
        this.id = a[0].substring(4);
        this.chucvu = a[0].substring(0,2);
        this.heso = a[0].substring(2, 4);
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
    public String geths(){
        return this.heso;
    }
    public String getid(){
        return this.id;
    }
}
public class J05065_LIET_KE_NHAN_VIEN_THEO_NHOM {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner (new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\MANG_DOI_TUONG\\tmp.in"));
        int n = sc.nextInt();
        sc.nextLine();
        NV []a = new NV[n];
        LinkedHashMap<String, Integer>mp = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)a[i] = new NV(sc.nextLine());
        Arrays.sort(a, new Comparator<NV>(){
            public int compare (NV a, NV b){
                if(!a.geths().equals(b.geths())) return b.geths().compareTo(a.geths());
                return a.getid().compareTo(b.getid());
            }
        });
        for(NV x: a){
            String s = x.getchuc();
            if(mp.containsKey(s)) mp.put(s, mp.get(s) + 1);
            else mp.put(s, 1);
            if((s.equals("GD") && mp.get(s)>1)||(s.equals("TP") && mp.get(s)>3)||(s.equals("PP") && mp.get(s)>3)) x.setchuc("NV");
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            for(NV x: a){
                if (x.getchuc().equals(s)) System.out.println(x);
            }
            System.out.println();
        }
    }
} */
