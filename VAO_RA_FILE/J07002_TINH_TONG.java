package VAO_RA_FILE;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J07002_TINH_TONG {
    public static int check1(String s) { // Kiểm tra xem xâu có là số 10 chữ số không
        if (s.length() > 10) return 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return 0;
        }
        return 1;
    }

    public static long check(String s) { // Kiểm tra xem xâu có là số kiểu int không
        if (check1(s) == 0) return 0;
        long x = Long.parseLong(s);
        if (x > Integer.MAX_VALUE) return 0;
        else return x;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in")); // Đọc từ file DATA.in
            long tong = 0;
            while (sc.hasNext()) {
                String s = sc.next();
                tong += check(s);
            }
            System.out.println(tong);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
