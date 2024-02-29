import java.util.Scanner;
public class J03038_DANH_DAU_CHU_CAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []cnt = new int[300];
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++) cnt[s.charAt(i) - '0'] = 1;
        int res = 0;
        for(int i = 0;i<=255;i++){
            if(cnt[i] == 1) res++;
        }
        System.out.println(res);
    }
}
