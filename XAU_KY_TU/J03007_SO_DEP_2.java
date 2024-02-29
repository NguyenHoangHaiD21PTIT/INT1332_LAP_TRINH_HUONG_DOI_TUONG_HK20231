import java.util.Scanner;
public class J03007_SO_DEP_2 {
    public static int check1(String s){
        for(int i = 0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return 0;
        }
        return 1;
    }
    public static int check2(String s){
        if (s.charAt(0)=='8'&&s.charAt(s.length() - 1)=='8') return 1;
        else return 0;
    }
    public static int check3(String s){
        int tong = 0;
        for (int i = 0;i<s.length();i++) tong+= s.charAt(i) -'0';
        if (tong%10==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check1(s)==1 && check2(s)==1 && check3(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }  
}
