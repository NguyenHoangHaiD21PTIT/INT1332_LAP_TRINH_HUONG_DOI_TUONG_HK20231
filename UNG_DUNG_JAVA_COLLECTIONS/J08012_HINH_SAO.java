import java.util.*;

public class J08012_HINH_SAO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinh = sc.nextInt();
        // Khởi tạo mảng lưu các vector ds kề
        Vector<Integer>[] ke = new Vector[dinh + 1];
        for (int i = 1; i <= dinh; i++) {
            ke[i] = new Vector<>();
        }
        // Đọc thông tin đỉnh và cạnh
        for (int i = 1; i <= dinh - 1; i++) {
            int dau = sc.nextInt(), cuoi = sc.nextInt();
            ke[dau].add(cuoi);
            ke[cuoi].add(dau);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= dinh; i++) a.add(ke[i].size());
        int check = 1;
        Collections.sort(a);
        if (a.get(a.size() - 1) != dinh - 1) check = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) != 1) {
                check = 0;
                break;
            }
        }
        if (check == 1) System.out.println("Yes");  
        else System.out.println("No");
    }
}
