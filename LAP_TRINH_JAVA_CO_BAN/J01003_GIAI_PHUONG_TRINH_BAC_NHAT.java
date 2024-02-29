import java.util.Scanner;
public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b== 0){
            System.out.println("VSN");
        } else if (a== 0 && b!=0){
            System.out.println("VN");
        } else {
            double d = (double) -b/a;
            System.out.printf("%.2f", d);
            System.out.println();
        }
    }   
}