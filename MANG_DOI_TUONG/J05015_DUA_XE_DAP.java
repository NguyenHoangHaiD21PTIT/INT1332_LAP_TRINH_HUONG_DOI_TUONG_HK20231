import java.util.*;
import java.io.*;
class Cuaro{
    private String name, donvi, id, vedich;
    private long tocdo; 
    private double chenh;
    public Cuaro(String name, String donvi, String vedich){
        this.name = name;
        this.donvi = donvi;
        this.vedich = vedich;
        String []a = this.name.trim().split("\\s+");
        String []b = this.donvi.trim().split("\\s+");
        String res ="";
        for(String x: b) res+=Character.toString(x.charAt(0));
        for(String x: a) res+=Character.toString(x.charAt(0));
        this.id = res;
        String []c = this.vedich.trim().split(":");
        this.chenh = Integer.parseInt(c[0]) + Integer.parseInt(c[1])/60.0 - 6.0;
        this.tocdo = Math.round(120.0/chenh);
    }
    public double getchenh(){
        return this.chenh;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.donvi + " " + this.tocdo + " Km/h";
    }
}
public class J05015_DUA_XE_DAP {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Cuaro []a = new Cuaro[n];
        for(int i = 0;i<n;i++){
            a[i] = new Cuaro(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<Cuaro>(){
            public int compare(Cuaro a, Cuaro b){
                if(a.getchenh() < b.getchenh()) return -1;
                else return 1;
            }
        });
        for(Cuaro x: a) System.out.println(x);
    }
}
