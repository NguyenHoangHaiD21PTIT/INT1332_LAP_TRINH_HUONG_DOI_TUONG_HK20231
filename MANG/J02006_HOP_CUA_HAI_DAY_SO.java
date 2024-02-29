import java.util.Scanner;
public class J02006_HOP_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int[n]; int []b = new int[m];
        int []m1 = new int[1005]; int []m2 = new int[1005];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            m1[a[i]]=1;
        }
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
            m2[b[i]]=1;
        }
        for(int i = 1;i<1000;i++){
            if (m1[i] == 1 || m2[i]==1) System.out.print(i + " ");
        }
    }
}
