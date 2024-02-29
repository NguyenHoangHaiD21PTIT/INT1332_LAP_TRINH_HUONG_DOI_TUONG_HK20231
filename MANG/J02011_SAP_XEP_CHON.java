import java.util.Scanner;
public class J02011_SAP_XEP_CHON {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ;i<n;i++) a[i] = sc.nextInt();
        //Với mỗi i, ta sẽ tìm vị trí phần tử nhỏ nhất trong đoạn sau i, gọi là k. Nếu a[i]> a[k] thì sẽ hoán vị
        for(int i = 0;i<n-1;i++){
            int pos = i; //Vị trí cần tìm
            for(int j = i + 1;j<n;j++){
                if(a[j] < a[pos]) pos = j;
            }
            //Nếu a[i] hiện tại to hơn thì hoán vị
            if(a[i] > a[pos]){
                int tmp = a[i];
                a[i] = a[pos];
                a[pos] = tmp;
            }
            //In mảng ra
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int k = 0;k<n;k++) System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
