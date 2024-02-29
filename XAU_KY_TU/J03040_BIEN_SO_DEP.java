import java.util.Scanner;
public class J03040_BIEN_SO_DEP {
    public static int checktang(String s){
        int x1 = s.charAt(5) - '0';
        int x2 = s.charAt(6) - '0';
        int x3 = s.charAt(7) - '0';
        int x4 = s.charAt(9) - '0';
        int x5 = s.charAt(10) - '0';
        if (x1 < x2 && x2 < x3 && x3 < x4 && x4 <x5) return 1;
        else return 0;
    }
    public static int checkequal1(String s){
        int x1 = s.charAt(5) - '0';
        int x2 = s.charAt(6) - '0';
        int x3 = s.charAt(7) - '0';
        int x4 = s.charAt(9) - '0';
        int x5 = s.charAt(10) - '0';
        if (x1 == x2 && x2 == x3 && x3 == x4 && x4 == x5) return 1;
        else return 0;
    }
    public static int checkequal2(String s){
        int x1 = s.charAt(5) - '0';
        int x2 = s.charAt(6) - '0';
        int x3 = s.charAt(7) - '0';
        int x4 = s.charAt(9) - '0';
        int x5 = s.charAt(10) - '0';
        if (x1 == x2 && x2 == x3 && x4 == x5) return 1;
        else return 0;
    }
    public static int checklocphat(String s){
        char x1 = s.charAt(5);
        char x2 = s.charAt(6);
        char x3 = s.charAt(7);
        char x4 = s.charAt(9);
        char x5 = s.charAt(10);
        if ((x1 == '8' || x1 == '6') && (x2 == '8' || x2 == '6') && (x3 == '8' || x3 == '6') && (x4 == '8' || x4 == '6') && (x5 == '8' || x5 == '6'))return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if (checktang(s)==1 || checkequal1(s)==1||checkequal2(s)==1||checklocphat(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
