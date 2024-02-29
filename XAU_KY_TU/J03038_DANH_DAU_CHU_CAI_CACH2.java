import java.util.Scanner;
public class J03038_DANH_DAU_CHU_CAI_CACH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(s.chars().distinct().count());
    }
}
