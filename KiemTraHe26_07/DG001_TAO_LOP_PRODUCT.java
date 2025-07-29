package KiemTraHe26_07;
import java.util.*;
class Product{
    private static int count = 1;
    private String id, name;
    private double price;
    private int stock, cid;
    public void input(Scanner in) {
        name = in.nextLine();
        price = Double.parseDouble(in.nextLine());
        stock = Integer.parseInt(in.nextLine());
        cid = Integer.parseInt(in.nextLine());
        id = String.format("P%02d%03d", cid, count++);
    }
    public double getTotalMoney() {
        return (double)price * stock;
    }
    public void out() {
        System.out.print(id + " " + name + " " + String.format("%.1f", price) + " ");
        if (stock == 0) System.out.println("out of stock");
        else System.out.println(String.format("%.0f", getTotalMoney()));
    }
}
public class DG001_TAO_LOP_PRODUCT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Product p=new Product();
        p.input(in);
        p.out();
    }
}
/*
sua ong tho
25000
2
4
banh my que
3000
0
2
*/