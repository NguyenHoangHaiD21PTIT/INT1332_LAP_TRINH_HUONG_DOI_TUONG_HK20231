/*import java.util.*;
import java.io.*;
class Mat_Hang{
    private String ten, dvt, id;
    private long mua, ban;
    public Mat_Hang(int x, String ten, String dvt, long mua, long ban) {
        this.id = String.format("MH%03d", x);
        this.ten = ten;
        this.dvt = dvt;
        this.mua = mua;
        this.ban = ban;
    }
    public long getBan() {
        return ban;
    }
    public String getTen() {
        return ten;
    }
    public String getDvt() {
        return dvt;
    }
    public long getMua() {
        return mua;
    }
    public String getId() {
        return id;
    }  
}
class Hoa_Don implements Comparable<Hoa_Don>{
    private String kh, mh, id;
    private long sl, loinhuan;
    public Hoa_Don(int x, String kh, String mh, long sl) {
        this.id = String.format("HD%03d", x);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }
    public String getKh() {
        return kh;
    }
    public String getMh() {
        return mh;
    }
    public String getId() {
        return id;
    }   
    public long getSl() {
        return sl;
    } 
    public void setLoinhuan(long loinhuan) {
        this.loinhuan = loinhuan;
    }
    public long getLoinhuan() {
        return loinhuan;
    }   
    @Override
    public int compareTo(Hoa_Don t) {
        if(this.loinhuan > t. loinhuan) return -1;
        else return 1;
    }
}
public class J06006_QUAN_LY_BAN_HANG_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\JAVA\\src\\QUAN_HE_GIUA_CAC_LOP\\tmp.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp1 = new HashMap<>();
        for(int i = 1;i<=n;i++){
            String s = String.format("KH%03d", i);
            String ten = sc.nextLine(), gioi = sc.nextLine(), ns = sc.nextLine(), dc = sc.nextLine();
            mp1.put(s, ten + " " + dc);
        }
        int m = sc.nextInt();
        Mat_Hang []a = new Mat_Hang[m];
        for(int i = 0;i<m;i++){
            sc.nextLine();
            a[i] = new Mat_Hang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        int p = sc.nextInt();
        Hoa_Don []b = new Hoa_Don[p];
        for(int i = 0;i<p;i++){
            b[i] = new Hoa_Don(i+1, sc.next(), sc.next(), sc.nextInt());
        }
        for(Hoa_Don x: b){
            for(Mat_Hang y: a){
                if(x.getMh().equals(y.getId())){
                    x.setLoinhuan(x.getSl() * (y.getBan() - y.getMua()));
                    break;                    
                }
            }
        }
        Arrays.sort(b);
        for(Hoa_Don x: b){
            for(Mat_Hang y: a){
                if(x.getMh().equals(y.getId())){
                    System.out.print(x.getId()+" " + mp1.get(x.getKh()) + " ");
                    System.out.println(y.getTen() + " " + x.getSl() + " " + x.getSl() * y.getBan() + " " +x.getLoinhuan());
                    break;                    
                }
            }
        }
    }
} */
