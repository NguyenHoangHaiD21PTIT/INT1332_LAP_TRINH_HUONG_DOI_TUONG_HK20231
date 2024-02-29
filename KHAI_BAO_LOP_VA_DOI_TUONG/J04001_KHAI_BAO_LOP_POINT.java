import java.util.*;
public class J04001_KHAI_BAO_LOP_POINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f", p1.distance(p2));
            System.out.println();
        }
    }
}