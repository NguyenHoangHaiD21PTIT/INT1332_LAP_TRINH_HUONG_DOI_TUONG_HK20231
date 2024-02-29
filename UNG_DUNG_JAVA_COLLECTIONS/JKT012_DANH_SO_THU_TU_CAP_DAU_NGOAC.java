import java.util.*;
public class JKT012_DANH_SO_THU_TU_CAP_DAU_NGOAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            Stack<Integer>st = new Stack<>();
            int cnt = 0;//số cặp đóng mở ngoặc
            for(char x: s.toCharArray()){
                if(x=='('){ 
                    cnt++; //bắt đầu xuất hiện một cặp mới
                    System.out.print(cnt + " ");
                    st.push(cnt);
                } else if (x == ')'){
                    System.out.print(st.pop() + " ");
                }
            }
            System.out.println();
        }
    }
}
