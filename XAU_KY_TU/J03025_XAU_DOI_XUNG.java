import java.util.Scanner;
public class J03025_XAU_DOI_XUNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            int dem = 0;//xem có bao nhiêu cặp khác nhau nếu xét từ 2 đầu đi vào
            //Mỗi một cặp khác nhau thì ta sẽ phải thay 1 trong 2 kí tự 2 đầu
            for(int i = 0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length() - i - 1)) dem++; 
            }
            if(dem==1){
                System.out.println("YES");
            } else if (dem ==0){
                if(s.length()%2==0) System.out.println("NO");
                else System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
