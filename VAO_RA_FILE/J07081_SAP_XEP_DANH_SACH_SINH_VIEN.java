import java.io.*;
import java.util.*;
class Student implements Comparable<Student> {
    private String id, name, phone, mail;
    private String ho, tendem, ten;
    public Student(String id, String name, String phone, String mail) {
        this.id = id;
        this.name = name.trim();
        this.phone = phone;
        this.mail = mail;
        String[] parts = this.name.split("\\s+");
        this.ho = parts[0];
        this.ten = parts[parts.length - 1];
        this.tendem = "";
        for (int i = 1; i < parts.length - 1; i++) this.tendem += parts[i] + " ";
        this.tendem = this.tendem.trim(); 
    }
    @Override
    public int compareTo(Student other) {
        if (!this.ten.equals(other.ten)) return this.ten.compareTo(other.ten);
        if (!this.ho.equals(other.ho)) return this.ho.compareTo(other.ho);
        if (!this.tendem.equals(other.tendem)) return this.tendem.compareTo(other.tendem);
        return this.id.compareTo(other.id);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + mail;
    }
}
public class J07081_SAP_XEP_DANH_SACH_SINH_VIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);  
        for (Student x : a) System.out.println(x);
    }
}
