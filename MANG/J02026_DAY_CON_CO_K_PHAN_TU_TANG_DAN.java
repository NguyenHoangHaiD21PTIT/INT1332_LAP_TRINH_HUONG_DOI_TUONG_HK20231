import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// 7 3
//0 1 2
//4 5 6
public class J02026_DAY_CON_CO_K_PHAN_TU_TANG_DAN {
    static int ok;
    public static void kt(int b[], int n, int k){
        for(int i = 0; i < k; i++) b[i] = i;
    }
    public static void gen(int b[], int n, int k){
        int i = k - 1;
        while(i >= 0 && b[i] == n - k + i) i--;
        if(i == -1){
            ok = 0;
        } else{
            b[i]++;
            for(int j = i + 1;j<k;j++) b[j] = b[j - 1] + 1;
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            Integer []a = new Integer[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a, new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    if (a < b) return -1;
                    else return 1;
                }      
            });
            //Tạo mảng chỉ số
            int []b = new int[n];
            kt(b, n, k);
            ok = 1;
            while(ok == 1){
                for(int i = 0;i<k;i++) System.out.print(a[b[i]] + " ");
                System.out.println();
                gen(b, n, k);
            }
        }
    }    
}
