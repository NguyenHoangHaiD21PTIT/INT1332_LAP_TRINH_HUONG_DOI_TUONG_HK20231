/*import java.util.*;
import java.io.*;
class GV{
    private String id, subject, time;
    public GV(String s){
        String []a = s.trim().split("\\s+");
        this.id = a[0];
        this.subject = a[1];
        this.time = a[2];
    }
    public String getid(){
        return this.id;
    }
    public String getSubject() {
        return subject;
    }
    
    public String gettime(){
        return this.time;
    }
}

/**
 *
 * @author Admin
 */
/*public class J06008_INH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp1 = new HashMap<>();
        while(n-- >0){ 
            String id = sc.next().trim(), name = sc.nextLine().trim();
            mp1.put(id, name);
        }
        int m = sc.nextInt();
        HashMap<String, String>mp2 = new HashMap<>();
        sc.nextLine();
        while(m-- >0){ 
            String id = sc.next().trim(), name = sc.nextLine().trim();
            mp2.put(id, name);
        }
        int p = sc.nextInt();
        sc.nextLine();
        GV []a = new GV[p];
        for(int i = 0;i<p;i++){
            a[i] = new GV(sc.nextLine().trim());
        }
        String s = sc.next();
        System.out.println("Giang vien: " + mp2.get(s));
        double res = 0;
        for(GV x: a){
            if(x.getid().equals(s)){
                System.out.println(mp1.get(x.getSubject()) + " " + x.gettime());
                res+=Double.parseDouble(x.gettime());
            }
        }
        System.out.println("Tong: " + String.format("%.2f", res));
    }
}*/
