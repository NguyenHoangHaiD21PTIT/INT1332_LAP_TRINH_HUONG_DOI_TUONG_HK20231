import java.util.Scanner;
public class J03023_SO_LA_MA {
    public static long trans(char c){
        if (c=='I') return 1;
        else if (c=='V') return 5;
        else if (c=='X') return 10;
        else if (c=='L') return 50;
        else if (c=='C') return 100;
        else if (c=='D') return 500;
        else return 1000;
    }
    public static long change(String s){
        long tong = 0;
        tong+= trans(s .charAt(s.length()-1));
        for(int i = s.length() - 2;i>=0;i--){
            if(trans(s.charAt(i+ 1))>trans(s.charAt(i))) tong-=trans(s.charAt(i));
            else tong+=trans(s.charAt(i));
        }
        return tong;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       while(t-- >0){
           String s = sc.next();
           System.out.println(change(s));
       }
    }  
}
