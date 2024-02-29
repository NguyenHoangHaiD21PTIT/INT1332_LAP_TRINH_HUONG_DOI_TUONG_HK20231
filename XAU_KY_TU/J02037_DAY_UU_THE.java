import java.util.Scanner;
public class J02037_DAY_UU_THE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            int n = a.length;
            int chan = 0, le =0;
            for(int i = 0;i<n;i++){
                if(((a[i].charAt(a[i].length() - 1)) - '0') % 2 == 1) le++;
                else chan++;
            }
            if (n%2==1 && le>chan) System.out.println("YES");
            else if (n%2==0 && chan>le) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
