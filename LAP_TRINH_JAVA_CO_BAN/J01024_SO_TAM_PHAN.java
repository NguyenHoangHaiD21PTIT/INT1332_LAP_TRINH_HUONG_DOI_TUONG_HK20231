import java.util.Scanner;
public class J01024_SO_TAM_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int check = 1;
            while(n!=0){
                if(n%10!=0&&n%10!=1&&n%10!=2){
                    check = 0;
                    break;
                }
                n/=10;
            }
            if(check==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

