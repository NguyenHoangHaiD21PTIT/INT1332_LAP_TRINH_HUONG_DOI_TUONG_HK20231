package KHAI_BAO_LOP_VA_DOI_TUONG;
import java.util.*;
class Pair<T1, T2>{
    private T1 first; 
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public String toString(){   
        return "(" + this.first + "," + this.second + ")";
    }
}
public class JP115_DANH_SACH_CANH_SU_DUNG_LOP_PAIR_Generic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        ArrayList<Pair<Integer, Integer>>b = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = sc.nextInt();
                if(a[i][j]==1 && i < j) b.add(new Pair<>(i + 1, j + 1));
            }
        }
        for(Pair x: b) System.out.println(x);
    }
}
