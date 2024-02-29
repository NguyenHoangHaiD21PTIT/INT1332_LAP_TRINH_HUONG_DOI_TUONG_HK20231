import java.util.Scanner;
public class J03021_DIEN_THOAI_CUC_GACH {
    public static char change(char c){
        if(c=='a'||c=='b'||c=='c') return '2';
    	else if(c=='d'||c=='e'||c=='f') return '3';
    	else if(c=='g'||c=='h'||c=='i') return '4';
    	else if(c=='j'||c=='k'||c=='l') return '5';
    	else if(c=='m'||c=='n'||c=='o') return '6';
    	else if(c=='p'||c=='q'||c=='r'||c=='s') return '7';
    	else if(c=='t'||c=='u'||c=='v') return '8';
        else return '9';  
    }
    public static int rev(String s){
        for(int i = 0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length() - i - 1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            String res = s.toLowerCase();
            String ans = "";
            for(int i = 0;i<res.length();i++) ans+=change(res.charAt(i));
            if (rev(ans)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
