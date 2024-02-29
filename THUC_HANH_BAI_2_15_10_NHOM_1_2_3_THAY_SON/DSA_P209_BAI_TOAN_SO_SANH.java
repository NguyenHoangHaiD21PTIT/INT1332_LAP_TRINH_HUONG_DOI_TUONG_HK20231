package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
public class DSA_P209_BAI_TOAN_SO_SANH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ke = new ArrayList<>();//ke.get(i) lưu danh sách kề đỉnh i
        int[] vao = new int[100005];//Bán bậc vào ủa đỉnh
        int dinh = 0; //số đỉnh đồ thị - số cái tên phân biệt
        HashMap<String, Integer> nameToNumber = new HashMap<>();
        int N = input.nextInt();
        for (int i = 0; i <= 100004; i++) {
            ke.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            String s1 = input.next(), s2 = input.next(), s3 = input.next();
            if (!nameToNumber.containsKey(s1)) {
                dinh++;
                nameToNumber.put(s1, dinh);
            }
            if (!nameToNumber.containsKey(s3)) {
                dinh++;
                nameToNumber.put(s3, dinh);
            }
            int numS1 = nameToNumber.get(s1), numS3 = nameToNumber.get(s3);
            if (s2.equals(">")) {
                ke.get(numS1).add(numS3);
                vao[numS3]++;
            } else {
                ke.get(numS3).add(numS1);
                vao[numS1]++;
            }
        }
        //Thực hiện thuật toán KAHN
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= dinh; i++) {
            if (vao[i] == 0) q.add(i);
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            cnt++;
            for (int i : ke.get(x)) {
                vao[i]--;
                if (vao[i] == 0) q.add(i);
            }
        }
        if (cnt == dinh) System.out.println("possible");
        else  System.out.println("impossible");
    }   
}
