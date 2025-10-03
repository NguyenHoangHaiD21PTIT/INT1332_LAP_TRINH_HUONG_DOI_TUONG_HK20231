import java.util.*;
public class J99113_TAM_GIAC_RONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            // In khoảng trắng đầu dòng
            for (int j = 1; j <= N - i; j++) System.out.print(" ");
            // In ký tự trong dòng
            for (int j = 1; j <= 2 * i - 1; j++) { //Dòng thứ i sẽ có 2 * i - 1 số
                if (i == N || j == 1 || j == 2 * i - 1) System.out.print("*"); //Dòng cuối cùng, hoặc vị trí đầu và cuối mỗi dòng 
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
