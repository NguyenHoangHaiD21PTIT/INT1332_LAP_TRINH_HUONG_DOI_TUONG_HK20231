import java.util.*;
class Author{
    private String name, email, gender, id;
    public Author(int x, String name, String email, String gender) {
        this.id = String.format("#%d", x);
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String toString(){
        return this.id + "\n" + "Name : " + this.name + "\n" + "Email : " + this.email + "\n" + "Gender : " + this.gender;
    }
}
class Book implements Comparable<Book>{
    private String name;
    private int price, quantity;
    private ArrayList<Author>at;
    public Book(String name, int price, int quantity, ArrayList<Author> at) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.at = at;
    }
    public String toString(){ 
        String res = "-----------------------" + "\n" + "Book information: " + "\n" + "Name : " + this.name
                +"\n" + "Price : " + this.price + "\n" + "Quantity : " + this.quantity + "\n" + "Author information : " + "\n";
        for(Author x: at) res+=x.toString()+"\n";
        return res;
    }
    @Override
    public int compareTo(Book t) {
        return this.name.compareTo(t.name);
    }
}
public class BAI_9_BOOKS_AND_AUTHORS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSach = Integer.parseInt(sc.nextLine());
        String tmp = sc.nextLine();
        ArrayList<Book>a  = new ArrayList<>();
        for(int i = 0;i<soSach;i++){ 
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine()), quantity = Integer.parseInt(sc.nextLine());
            int soTacGia = Integer.parseInt(sc.nextLine());
            ArrayList<Author>b = new ArrayList<>();
            for(int j = 1;j<=soTacGia;j++) b.add(new Author(j, sc.nextLine(), sc.nextLine(), sc.nextLine()));
            a.add(new Book(name, price, quantity, b));
            String tmp1 = sc.nextLine();
        }
        Collections.sort(a);
        for(Book x: a) System.out.println(x);
    }
}