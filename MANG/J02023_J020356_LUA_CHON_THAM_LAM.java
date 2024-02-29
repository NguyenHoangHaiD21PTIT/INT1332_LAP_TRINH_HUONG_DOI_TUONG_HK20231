import java.util.Scanner;
public class J02023_J020356_LUA_CHON_THAM_LAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(); //n là số chữ số, s là tổng chữ số
        int []big = new int[n]; int []small = new int[n]; //mảng lưu các chữ số của số to và số bé
        int tmp = s; 
        if (s > 9*n || (s==0&&n>1)){
            System.out.println("-1 -1");
        } else {
            //1. Tìm số lớn nhất: Ta cố gắng biểu diễn thành nhiều số 9 nhất có thể, đưa số 9 lên đầu
            for(int i = 0;i<n;i++){
                if(s>=9){ //Đẩy các số 9 vào
                    big[i] = 9;
                    s-=9;
                } else if (s>0) { //Gán nốt phần dư
                    big[i] = s;
                    s = 0;
                }
            }
            tmp--;
            //2. Tìm số nhỏ nhất: Phía cuối càng nhiều số 9 càng tốt, tuy nhiên small[0] phải !=0
            for(int i = n-1;i>=1;i--){
                if(tmp>=9){//Đẩy hết số 9 về cuối
                    small[i] = 9;
                    tmp-=9;
                } else if (tmp >0){
                    small[i] = tmp;
                    tmp = 0;
                } else {
                    small[i] = tmp;
                }
            }
            small[0] = tmp + 1;
            //In kết quả
            for(int i = 0;i<n;i++) System.out.print(small[i]);
            System.out.print(" ");
            for(int i = 0;i<n;i++) System.out.print(big[i]);
            System.out.println();
        }
    }
}
