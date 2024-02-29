import java.util.Scanner;
public class J03018_TIM_SO_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            int tmp = 0;
            if(s.length()==1) tmp = s.charAt(0) - '0';
            else tmp = (s.charAt(s.length()-2) - '0') * 10 + (s.charAt(s.length()-1) - '0');
            if (tmp%4!=0) System.out.println("0");
            else System.out.println("4");
        }
    }
}
