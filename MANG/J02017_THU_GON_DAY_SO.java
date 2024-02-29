import java.util.Scanner;
public class J02017_THU_GON_DAY_SO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a= new int [n];
        int ans=n;
        for(int i=0; i<n; i++)a[i]=sc.nextInt();
        if ( n < 2 ) System.out.println(n);
        else {
            while (true){
                for ( int i = 0; i < n - 1; i++ ){
                    if ( (a[i] + a[i + 1]) % 2 == 0 ) {
                        n -= 2;
                        int tmp = i;
                        for ( int j = tmp; j < n; j++ ) a[j] = a[j + 2];
                        }
                    }
                if ( ans == n ) break;
                else ans = n;
            }
            System.out.println(ans);
        }
    }
}


