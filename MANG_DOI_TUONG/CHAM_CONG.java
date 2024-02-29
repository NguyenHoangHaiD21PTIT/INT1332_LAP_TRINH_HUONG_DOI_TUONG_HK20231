import java.util.*;
class Work implements Comparable<Work>{
    private String id, name, timein, timeout;
    private int tong;//Tổng số phút làm
    public Work(String id, String name, String timein, String timeout){
        this.id = id;
        this.name = name;
        this.timein = timein;
        this.timeout = timeout;
        int x = Integer.parseInt(this.timein.substring(0,2));
        int y = Integer.parseInt(this.timein.substring(3));
        int z = Integer.parseInt(this.timeout.substring(0,2));
        int t = Integer.parseInt(this.timeout.substring(3));
        this.tong = (z * 60 + t) - (x * 60 + y);
    }
    public String toString(){
        String res ="";
        res+=this.id + " " + this.name + " ";
        this.tong -= 60;
        int x = this.tong/60;
        int y = this.tong%60;
        res+= x + " gio " + y + " phut ";
        if(this.tong >= 480) res+="DU";
        else res+="THIEU";
        return res;
    }
    @Override
    public int compareTo(Work t) {
       return t.tong - this.tong;
    }
}
public class CHAM_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Work []a = new Work[n];
        for(int i = 0;i<n;i++){
            a[i] = new Work(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(Work x: a) System.out.println(x);
    }
}
