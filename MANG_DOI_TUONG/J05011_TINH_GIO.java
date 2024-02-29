import java.util.*;
class Game{
    private String id, name, timein, timeout;
    private int tong;//Tổng số phút chơi
    public Game(String id, String name, String timein, String timeout){
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
    public int gettong(){
        return this.tong;
    }
    public String toString(){
        String res ="";
        res+=this.id + " " + this.name + " ";
        int x = this.tong/60;
        int y = this.tong%60;
        res+= x + " gio " + y + " phut";
        return res;
    }
}
public class J05011_TINH_GIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Game []a = new Game[n];
        for(int i = 0;i<n;i++){
            a[i] = new Game(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<Game>(){
            public int compare(Game a, Game b){
                return b.gettong() - a.gettong();
            }
        });
        for(Game x: a) System.out.println(x);
    }
}
