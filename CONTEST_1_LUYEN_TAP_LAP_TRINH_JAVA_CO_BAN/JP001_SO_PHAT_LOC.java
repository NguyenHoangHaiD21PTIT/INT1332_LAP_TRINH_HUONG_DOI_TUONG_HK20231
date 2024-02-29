import java.util.Scanner;
public class JP001_SO_PHAT_LOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            if (s.endsWith("86")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
