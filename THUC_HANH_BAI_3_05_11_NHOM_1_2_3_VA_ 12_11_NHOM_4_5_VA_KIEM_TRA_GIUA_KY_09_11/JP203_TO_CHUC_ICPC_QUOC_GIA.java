package THUC_HANH_BAI_3_05_11_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
class Team implements Comparable<Team>{
    private String ID, tenTeam, tenTruong;
    public Team(String tenTeam, String tenTruong) {
        this.tenTeam = tenTeam.trim();
        this.tenTruong = tenTruong;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String toString(){
        return this.ID + " " + this.tenTeam + " " + this.tenTruong;
    }
    @Override
    public int compareTo(Team t) {
        if(!this.tenTruong.equals(t.tenTruong)) return this.tenTruong.compareTo(t.tenTruong);
        return this.tenTeam.compareTo(t.tenTeam);
    }
}
public class JP203_TO_CHUC_ICPC_QUOC_GIA {
    public static void main(String[] args) throws IOException{  
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, String>mp = new HashMap<>();
        while(t-- >0){
            String s = sc.nextLine();
            String []tmp = s.trim().split("\\s+");
            String res = "";
            for(int i = 1;i<tmp.length;i++) res+=tmp[i] + " ";
            mp.put(tmp[0], res.trim());
        }
        sc = new Scanner(new File("REGISTER.in"));
        ArrayList<Team>a = new ArrayList<>();
        int x = sc.nextInt();
        sc.nextLine();
        while(x-- >0){
            String res1 = sc.nextLine();
            String []tmp1 = res1.trim().split("\\s+");
            int sl = Integer.parseInt(tmp1[1]);
            while(sl-->0){
                String s = sc.nextLine();
                a.add(new Team(s, mp.get(tmp1[0])));
            }
        }
        Collections.sort(a);
        for(int i = 0;i<a.size();i++){ 
            a.get(i).setID(String.format("team%02d", i + 1));
            System.out.println(a.get(i));
        }
    }
}
