import java.util.*;
import java.io.*;
class Client{
    private int checkin, time;//checkin là thời điểm checkin, time là tổng thời lượng checkin xong
    public Client(int chekin, int time){
        this.checkin = chekin;
        this.time = time;
    }
    public int getcheck(){
        return this.checkin;
    }
    public int gettime(){
        return this.time;
    }
}
public class J02009_XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Client []a = new Client[n];
        for(int i = 0;i<n;i++) a[i] = new Client(sc.nextInt(), sc.nextInt());
        //ai đến trước thì vào làm trước, cùng thời điểm đến thì ai làm nhanh hơn thì vào làm trước
        Arrays.sort(a, new Comparator<Client>(){
            public int compare(Client x, Client y){
                if(x.getcheck()!=y.getcheck()) return x.getcheck() - y.getcheck();
                return x.gettime() - y.gettime();
            }
        });
        int res = 0;
        //trong đó, khi xét đến ông khách thứ i thì res chính là thời điểm ông thứ i - 1 làm xong
        for(int i = 0;i<n;i++){
            //Nếu ông khách hiện tại đến sau thời điểm các ông khách trước đó làm xong
            if(res<=a[i].getcheck()) res = a[i].getcheck() + a[i].gettime();
            else res+=a[i].gettime();
        }
        System.out.println(res);
    }
}
