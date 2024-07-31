import java.util.*;
public class Java_HA_1_Ro_bot_tham_hiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int x = 0, y = 0;
            String s = sc.nextLine();
            int check = 1;//1: không sai
            for(char tmp: s.toCharArray()){
                if(tmp=='E') x++;
                else if (tmp=='W') x--;
                else if(tmp=='N') y++;
                else if(tmp=='S') y--;
                else{
                    check = 0;
                    break;
                }
            }
            if(check==0) System.out.println("INVALID");
            else System.out.printf("%d %d\n", x, y);
        }
    }
}
