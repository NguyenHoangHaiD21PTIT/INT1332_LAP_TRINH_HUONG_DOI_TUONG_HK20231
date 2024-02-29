/*import java.util.*;
import java.io.*;
class Team{
    private String maTeam, tenTeam, tenTruong;
    public Team(int x, String tenTeam, String tenTruong){
        this.maTeam = "Team" + String.format("%02d", x);
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
    }
    public String getTen(){
        return this.tenTeam;
    }
    public String getTruong(){
        return this.tenTruong;
    }
    public String getma(){
        return this.maTeam;
    }
}
class ThiSinh{
    private String maTS, hoTen, maTeam;
    public ThiSinh(int x, String hoTen, String maTeam){
        this.maTS = "C" + String.format("%03d", x);
        this.hoTen = hoTen;
        this.maTeam = maTeam;
    }
    public String toString(){
        return this.maTS + " " + this.hoTen;
    }
    public String getten(){
        return this.hoTen;
    }
    public String getma(){
        return this.maTeam;
    }
}
public class JP036_DANH_SACH_THI_ICPC{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Team []a = new Team[n];
        for(int i = 0 ;i<n;i++){ 
            a[i] = new Team(i + 1, sc.nextLine(), sc.nextLine());
        }
        HashMap<String, String>mp = new HashMap<>();
        for(Team x: a){
            String s = x.getTen() + " " + x.getTruong();
            mp.put(x.getma(), s);
        }
        int m = sc.nextInt();
        ThiSinh []b = new ThiSinh[m];
        sc.nextLine();
        for(int i = 0;i<m;i++){ 
            b[i] = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(b, new Comparator<ThiSinh>(){
            public int compare(ThiSinh a, ThiSinh b){ 
                return a.getten().compareTo(b.getten());
            }
        });
        for(ThiSinh x: b){
            System.out.println(x + " " + mp.get(x.getma()));
        }
    }
}
/*
2
BAV_MIS
Banking Academy of Vietnam
FTU Knights1
Foreign Trade University
6
Le Trung Toan
Team01
Nguyen Trinh Quoc Long
Team01
Giang Minh Tung
Team01
Nguyen Hang Giang
Team02
Nguyen Thanh Nhan
Team02
Nguyen Viet Duc
Team02
*/
