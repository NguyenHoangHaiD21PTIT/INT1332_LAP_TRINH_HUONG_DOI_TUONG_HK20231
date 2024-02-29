import java.util.*;
public class J04009_DIEN_TICH_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt();
        while(t-- >0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            Triangle p = new Triangle(a,b,c);
            if(!p.valid()){
                System.out.println("INVALID");
            } else {
                System.out.printf("%.2f", p.dientich());
                System.out.println();
            }
        }
    }
}
