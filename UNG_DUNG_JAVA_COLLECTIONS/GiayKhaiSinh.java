package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
class Person1 implements Comparable<Person1>{
    private String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }  
    @Override
    public int compareTo(Person1 t) {
        if(this.age!=t.age) return t.age - this.age;
        return this.name.compareTo(t.name);
    }
    public String toString(){
        return this.name + " " + this.age;
    }
}
class GKS{
    private String tenCha, tenCon;
    private int tuoiChaKhiSinh;
    public GKS(String tenCha, String tenCon, int tuoiChaKhiSinh) {
        this.tenCha = tenCha;
        this.tenCon = tenCon;
        this.tuoiChaKhiSinh = tuoiChaKhiSinh;
    } 
    public String getTenCha() {
        return tenCha;
    }
    public String getTenCon() {
        return tenCon;
    }
    public int getTuoiChaKhiSinh() {
        return tuoiChaKhiSinh;
    } 
}
public class GiayKhaiSinh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tmp = 1;tmp<=t;tmp++){
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<GKS>b = new ArrayList<>();
            while(n-- >0){
                b.add(new GKS(sc.next(), sc.next(), Integer.parseInt(sc.next())));
            }
            ArrayList<Person1>a = new ArrayList<>();
            Stack<Person1>st = new Stack<>();
            st.push(new Person1("Ted", 100));
            while(!st.empty()){ 
                String ten = st.peek().getName();
                int tuoi = st.peek().getAge();
                st.pop();
                for(GKS x: b){ 
                    //Tìm những thằng là con thằng đang xét
                    if(x.getTenCha().equals(ten)){ 
                        a.add(new Person1(x.getTenCon(), tuoi - x.getTuoiChaKhiSinh()));
                        st.push(new Person1(x.getTenCon(), tuoi - x.getTuoiChaKhiSinh()));
                    }
                }
            }
            System.out.println("DATASET " + tmp + ": ");
            Collections.sort(a);
            for(Person1 y: a) System.out.println(y);
        }
    }
}