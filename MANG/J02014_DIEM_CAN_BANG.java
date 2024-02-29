import java.util.Scanner;
public class J02014_DIEM_CAN_BANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n + 1];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            int []pre = new int[n + 1];
            //Xây dựng mảng cộng dồn:
            pre[0] = a[0];
            for(int i = 1;i<n;i++) pre[i] = pre[i - 1] + a[i];
            int check = 0;
            for(int i = 1;i<=n - 2;i++){ //Ta so sánh tổng từ chỉ số [0; i - 1] và từ [i + 1; n - 1]
                if (pre[i - 1] == pre[n - 1] - pre[i]){
                   System.out.println(i + 1);
                   check = 1;
                   break;
                }
            }
            if(check == 0) System.out.println(-1);
        }
    }
}
 
