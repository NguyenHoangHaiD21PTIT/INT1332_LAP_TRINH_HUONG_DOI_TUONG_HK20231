package MANG;
import java.util.*;
public class J02019_TONG_UOC_SO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int []sumdiv = new int [b + 5];//sumdiv[i] lưu tổng ước của số i
        for(int i = 1;i<=b;i++) sumdiv[i] = 1;//Ban đầu mới chỉ xác định được các số chia hết cho 1
        for(int i = 2;i<=b;i++){ 
            //Duyệt qua số nào thì lần lượt tăng tổng ước số của các số là bội của số đang xét
            for(int j = i;j<=b;j+=i) sumdiv[j]+=i;
            //Ví dụ: Duyệt qua 2. Xét các bội của 2, bội của 2 đương nhiên có ước là 2. Do dó tăng tổng ước lên
        }
        int cnt = 0;
        for(int i = a;i<=b;i++){
            if(sumdiv[i] - i >i) cnt++;
        }
        System.out.println(cnt);
    }
}
