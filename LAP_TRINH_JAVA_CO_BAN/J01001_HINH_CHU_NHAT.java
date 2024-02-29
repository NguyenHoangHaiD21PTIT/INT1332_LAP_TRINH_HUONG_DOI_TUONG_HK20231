import java.util.Scanner;
public class J01001_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<=0 || b<=0){
            System.out.println("0");
        } else{
            int chuvi = 2 *(a + b);
            int dienTich = a * b;
            System.out.println(chuvi + " "+ dienTich);
        }
    }
}
