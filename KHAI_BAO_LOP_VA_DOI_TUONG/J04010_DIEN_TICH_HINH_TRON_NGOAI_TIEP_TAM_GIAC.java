import java.util.*;
public class J04010_DIEN_TICH_HINH_TRON_NGOAI_TIEP_TAM_GIAC {
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
                double S = p.dientich();
                double r = p.get1() * p.get2() * p.get3()/(4.0 * S); //bán kính
                double S1 = Math.PI * r * r;
                System.out.printf("%.3f", S1);
                System.out.println();
            }
        }
    }
}

