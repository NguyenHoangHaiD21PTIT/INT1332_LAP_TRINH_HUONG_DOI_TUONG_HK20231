import java.util.Scanner;
public class J02007_DEM_SO_LAN_XUAT_HIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int []cnt = new int [100005];
        int t = sc.nextInt();
        for(int p = 1;p<=t;p++){
            for(int i = 0;i<=100000;i++) cnt[i] = 0;
            int n = sc.nextInt();
            int []a = new int[100];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.println("Test "+ p + ": ");
            for(int i = 0;i<n;i++){
                if(cnt[a[i]]!=0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
        }
    } 
}
