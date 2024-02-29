package KHAI_BAO_LOP_VA_DOI_TUONG;
import java.util.*;
import java.io.*;
class Point{
    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint (Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    double distance(Point p){
        return Math.sqrt(Math.pow(p.x-this.x,2) + Math.pow(p.y-this.y,2));
    }
}
class Triangle{
    private double canh1,canh2,canh3;
    public Triangle(Point a, Point b, Point c) {
        this.canh1 = a.distance(b);
        this.canh2 = b.distance(c);
        this.canh3 = c.distance(a);
    }
    public boolean valid(){
        double m = this.canh1;
        double n = this.canh2;
        double p = this.canh3;
        return m+n>p && n+p>m && p+m>n;
    }  
    public double getPerimeter(){
        return (double) Math.round((this.canh1 + this.canh2 + this.canh3)*1000)/1000;
    }
}
public class J04019_LOP_TRIANGLE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
