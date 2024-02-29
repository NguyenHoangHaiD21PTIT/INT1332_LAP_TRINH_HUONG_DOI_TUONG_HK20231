import java.util.Scanner;
public class J01004_SO_NGUYEN_TO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p = 0;p < t;p++){
            int n = sc.nextInt();
            int check = 1; //Là số nguyên tố
            if (n<=1){
                check = 0;
            } else {
                for(int i = 2;i<= Math.sqrt(n);i++){
                    if(n%i==0){
                        check = 0;
                        break;
                    }
                }
            }
            if (check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}