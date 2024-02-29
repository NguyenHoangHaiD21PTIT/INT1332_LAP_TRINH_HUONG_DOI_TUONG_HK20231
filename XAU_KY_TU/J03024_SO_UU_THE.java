import java.util.Scanner;
public class J03024_SO_UU_THE {
    public static int check(String s){
        if (s.charAt(0) == '0') return 0;
        for(int i = 0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            if (check(s)==0){
                System.out.println("INVALID");
            } else {
                int chan = 0, le = 0;
                for(int i= 0 ;i<s.length();i++){ 
                    if((s.charAt(i) - '0') % 2 == 1) le++;
                    else chan++;
                }
                if (s.length()%2==1 && le >chan) System.out.println("YES");
                else if (s.length()%2==0 && chan > le) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
