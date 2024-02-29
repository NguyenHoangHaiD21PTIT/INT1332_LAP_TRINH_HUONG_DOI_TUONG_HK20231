import java.util.Scanner;
public class J03006_SO_DEP_1 {
    public static int check(String s){
        for(int i = 0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return 0;
            int x = s.charAt(i) - '0';
            int y = s.charAt(s.length()-i-1) - '0';
            if (x%2==1||y%2==1) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check(s)==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
   
}
