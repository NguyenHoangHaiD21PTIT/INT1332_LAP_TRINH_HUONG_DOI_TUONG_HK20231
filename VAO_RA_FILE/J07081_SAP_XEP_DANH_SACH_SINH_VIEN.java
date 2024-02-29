import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Student{
    public String id, name, phone, mail;
    public Student(String id, String name, String phone, String mail){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }
    public String getmsv(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.phone + " " + this.mail;
    }
}
public class J07081_SAP_XEP_DANH_SACH_SINH_VIEN {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = sc.nextInt();
            sc.nextLine();
            Student []a = new Student[n];
            for(int i = 0;i<n;i++){
                a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<Student>(){
                public int compare(Student a, Student b){
                    if(!a.getname().equals(b.getname())){
                        String []x = a.getname().trim().split("\\s+");
                        String []y = b.getname().trim().split("\\s+");
                        if(!x[x.length - 1].equals(y[y.length - 1])) return x[x.length - 1].compareTo(y[y.length - 1]);
                        if(!x[0].equals(y[0])) return x[0].compareTo(y[0]);
                        return x[1].compareTo(y[1]);
                    }
                    return a.getmsv().compareTo(b.getmsv());
                }
            });
            for(Student x: a) System.out.println(x);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
