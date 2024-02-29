import java.util.*;
class Person{
    private String name, birth;
    private int ngay, thang, nam;
    public Person(String name, String birth){
        this.name = name;
        this.birth = birth;
        String []a = this.birth.split("/");
        this.ngay = Integer.parseInt(a[0]);
        this.thang = Integer.parseInt(a[1]);
        this.nam = Integer.parseInt(a[2]);
    }
    public int getngay(){
        return this.ngay;
    }
    public int getthang(){
        return this.thang;
    }
    public int getnam(){
        return this.nam;
    }
    public String toString(){
        return this.name;
    }
}
public class J05032_TRE_NHAT_GIA_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Person []a = new Person[n];
        for(int i = 0;i<n;i++){
            a[i] = new Person(sc.next(), sc.next());           
        }
        Arrays.sort(a, new Comparator<Person>(){
            public int compare (Person a, Person b){
                if(a.getnam()!=b .getnam()) return a.getnam() - b.getnam();
                else if (a.getthang()!=b.getthang()) return a.getthang() - b.getthang();
                return a.getngay() - b.getngay();
            }
        });
        System.out.println(a[n - 1]);
        System.out.println(a[0]);
    }
}
