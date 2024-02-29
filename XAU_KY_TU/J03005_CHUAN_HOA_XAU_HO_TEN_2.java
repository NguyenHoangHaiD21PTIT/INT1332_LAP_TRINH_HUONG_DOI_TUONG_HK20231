import java.util.Scanner;
public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
    public static String chuanhoa (String s){ //Viết hoa chữ cái đầu và viết thường các chữ cái sau
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            for (int i = 1;i<=a.length - 2;i++) System.out.print(chuanhoa(a[i])+ " ");
            System.out.print(chuanhoa(a[a.length - 1]) + ", ");
            System.out.println(a[0].toUpperCase());
        }
    }
}
