import java.util.*;
public class JP003_TINH_TONG_CAC_CHU_SO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            ArrayList<Character>a = new ArrayList<>();
            int tong = 0;
            for(char x: s.toCharArray()){
                if(Character.isDigit(x)){
                    tong+=(x - '0');
                } else {
                    a.add(x);
                }
            }
            Collections.sort(a);
            for(char x: a) System.out.print(x);
            System.out.println(tong);
        }
    }
}
