import java.util.Scanner;
public class J01007_KIEM_TRA_SO_FIBONACCI {
    public static long []f = new long[95];
    //Hàm sinh số Fibonacci
    public static void fibo(){
        f[0] = 0; f[1] = 1;
        for(int i = 2;i<=92;i++) f[i] = f[i - 1] + f[i - 2];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        fibo();
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            int check = 0; //Giả sử đó không là số Fibo
            for(int i = 0;f[i]<=n;i++){
            	if(f[i]==n){
                    check = 1;
                    break;
            	}
            }
            if (check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    } 
}