import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
    private String name;
    private int correct, submit;
    public Student(String name, int correct, int submit){
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }
    @Override
    public int compareTo(Student t) {
        if(this.correct!=t.correct) return t.correct - this.correct;
        if(this.submit!=t.submit) return this.submit - t.submit;
        return this.name.compareTo(t.name);
    }
    public String toString(){ 
        return this.name.trim() + " " + this.correct + " " + this.submit;
    }
}
public class JP037_LUYEN_TAP_LAP_TRINH{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("LUYENTAP.in"));
        int n = sc.nextInt();
        Student []a = new Student[n];
        for(int i = 0;i<n;i++){ 
            sc.nextLine();
            a[i] = new Student(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for(Student x: a) System.out.println(x);
    }
}
