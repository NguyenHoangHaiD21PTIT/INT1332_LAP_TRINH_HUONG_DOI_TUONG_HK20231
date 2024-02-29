import java.util.Scanner;
public class JP002_TAP_HOP_SO_NGUYEN {
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
        //In tập giao
        for(int i = 1;i<1000;i++){
            if (m1[i] == 1 && m2[i]==1) System.out.print(i + " ");
        }
        System.out.println();
        //Hiệu A - B
        for(int i = 1;i<1000;i++){
            if (m1[i] == 1 && m2[i]==0) System.out.print(i + " ");
        }
        System.out.println();
        //Hiệu B - A
        for(int i = 1;i<1000;i++){
            if (m1[i] == 0 && m2[i]==1) System.out.print(i + " ");
        }
    }
}
