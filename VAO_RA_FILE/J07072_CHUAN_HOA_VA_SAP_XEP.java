import java.io.*;
import java.util.*;
public class J07072_CHUAN_HOA_VA_SAP_XEP {
    public static String chuanhoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            String res = "";
            for (String x : tmp) res += chuanhoa(x) + " ";
            a.add(res);
        }
        Collections.sort(a, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] x1 = s1.trim().split("\\s+");
                String[] x2 = s2.trim().split("\\s+");
                if (!x1[x1.length - 1].equals(x2[x2.length - 1])) return x1[x1.length - 1].compareTo(x2[x2.length - 1]);
                else if (!x1[0].equals(x2[0])) return x1[0].compareTo(x2[0]);
                return x1[1].compareTo(x2[1]);
            }
        });
        for (String x : a) System.out.println(x);
    }
}
