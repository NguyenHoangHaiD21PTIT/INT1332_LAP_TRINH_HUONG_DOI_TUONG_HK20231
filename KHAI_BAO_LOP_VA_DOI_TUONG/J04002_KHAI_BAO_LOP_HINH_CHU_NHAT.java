import java.util.*;
class Rectangle {
    public static String chuanhoa(String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    private double width, height;
    private String color;
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public String getColor(){
        return this.chuanhoa(color);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setColor(String color){
        this.color = chuanhoa(color);
    }
    public double findArea(){
        return this.width * this.height;
    }
    public double  findPerimeter(){
        return (this.width + this.height) * 2;
    }
}

public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle p = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(p.getWidth()<=0||p.getHeight()<=0){
            System.out.println("INVALID");
        } else {
            System.out.print((int)p.findPerimeter()+ " " + (int)p.findArea() + " " + p.getColor());
        }
    }
}