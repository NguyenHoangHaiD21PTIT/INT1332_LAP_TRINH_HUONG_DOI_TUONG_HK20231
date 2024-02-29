import java.util.Scanner;
public class J01010_CAT_DOI {
    public static char change(char c){
        if (c=='0'||c=='8'||c=='9') return '0';
        else if (c=='1') return '1';
        else return '-';
    }
    public static int check(String s){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='-') return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s = sc.nextLine();
            String ans = "";
            for(int i = 0;i<s.length();i++) ans+=change(s.charAt(i));
            if (check(ans)==0){
                System.out.println("INVALID");
            } else {
                long res = 0;
                for(int i = 0;i<ans.length();i++) res = res * 10 + (ans.charAt(i) - '0');
                if(res==0) System.out.println("INVALID");
                else System.out.println(res);
            }
        }
    }
}
