package THUC_HANH_BAI_2_22_10_NHOM_4_5_THAY_SON;
import java.util.*;
import java.io.*;
public class DSA_P062_SO_LUONG_DAU_NGOAC_VUONG_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0, res = 0;
        Stack<Pair<Character, Integer>> st = new Stack<>();//stack lưu dấu mở ngoặc và số dấu ngoặc vuông mở hiện có (từ đầu xâu tính đến thời điểm gặp dấu mở)
        st.push(new Pair<>('*', 0));//để tránh stack rỗng
        for (char i : s.toCharArray()) {
            if (!st.isEmpty() && ((i == ')' && st.peek().first == '(') || (i == ']' && st.peek().first == '['))) {
            //Đóng và có mở tương ứng --> Là dãy ngoặc đúng --> Xóa dấu mở ngoặc cùng cấp
                st.pop();
                if (!st.isEmpty()) {
                    res = Math.max(res, cnt - st.peek().second);
                    //Như vậy, đỉnh stack bây giờ lưu dấu mở ngoặc và số dấu ngoặc vuông mở khi không xét đến dấu mở cùng cấp
                }
            } else { //gặp mở thì push dấu mở và số dấu ngoặc vuông mở hiện có
                if(i=='[')cnt++;
                st.push(new Pair<>(i, cnt));
            }
        }
        System.out.println(res);
    }
    static class Pair<T, U> {
        T first;
        U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}
