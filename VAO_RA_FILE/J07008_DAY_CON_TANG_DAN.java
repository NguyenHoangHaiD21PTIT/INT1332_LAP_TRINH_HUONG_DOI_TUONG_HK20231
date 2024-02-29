import java.io.*;
import java.util.*;
public class J07008_DAY_CON_TANG_DAN {
    static int ok;//biến dùng để kiểm tra còn sinh được tiếp hay không
    //Mảng a gồm n phần tử dùng để sinh nhị phân
    //a[i] = 1 nghĩa là lấy b[i] vào trong cấu hình, ngược lại = 0 tức là không lấy
    public static void kt(int a[], int n) {//Khởi tạo cấu hình toàn số 0
        for (int i = 0; i < n; i++) a[i] = 0;
    }
    public static void sinh(int a[], int n) {
        int i = n - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == -1) ok = 0;
        else a[i] = 1;
    }
    //Kiểm tra điều kiện dãy thu được tăng dần đúng hay sai
    public static int check(ArrayList<Integer> tmp) {
        for (int i = 0; i < tmp.size() - 1; i++) {
            if (tmp.get(i) > tmp.get(i + 1)) return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        int[] a = new int[n];
        ok = 1;
        kt(a, n);
        ArrayList<String> ans = new ArrayList<>(); //Nơi lưu các xâu thỏa mãn xuất ra màn hình
        while (ok == 1) {//còn sinh được
            String s = "";
            //Ứng với từng cấu hình nhị phân ta sẽ biết số nào lấy, số nào không lấy, để thêm vào cấu hình tmp
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    s += b[i] +"" + " ";//Chuyển số được chọn thành xâu, rồi nối vào xâu đang có
                    tmp.add(b[i]);//Thêm vào cấu hình tmp để xong thì check
                }
            }
            //Nếu là dãy con tăng dần lớn hơn 2 phần tử thì thêm xâu tương ứng vào
            if (check(tmp) == 1 && tmp.size()>=2) ans.add(s.trim()); 
            sinh(a, n);
        }
        Collections.sort(ans);
        for (String x : ans) System.out.println(x);
    }
}