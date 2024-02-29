package VAO_RA_FILE;
import java.util.*;
import java.io.*;
public class J07071_TEN_VIET_TAT {
    public static String change1(String s) { //Hàm tạo tên viết tắt các GV
        String res = "";
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) res += a[i].charAt(0);
        return res;
    }
    public static String change2(String s) {//Hàm tạo tên mới của từ cần truy vấn vứt dấu "." đi
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') res += s.charAt(i);
        }
        return res;
    }
    public static int check(String a, String b){//Xâu a là xâu GV, xâu b là xâu truy vấn đã vứt "." đi
        if (a.length()!=b.length()) return 0;
        int index = b .indexOf("*");
        for(int i = 0;i<a.length();i++){
            if(i!=index)if(a.charAt(i)!=b.charAt(i)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> tenchuan = new ArrayList<>();
        while (n-- > 0) {
            String s = sc.nextLine();
            tenchuan.add(s);
        }
        Collections.sort(tenchuan, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] x1 = s1.trim().split("\\s+");
                String[] x2 = s2.trim().split("\\s+");
                if (!x1[x1.length - 1].equals(x2[x2.length - 1])) return x1[x1.length - 1].compareTo(x2[x2.length - 1]);
                return x1[0].compareTo(x2[0]);
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String ask = sc.next();
            sc.nextLine();
            String ques = change2(ask); //Xâu truy vấn đã vứt dấu "." đi 
            ArrayList<String> a = new ArrayList<>();
            for (String s : tenchuan) { 
                if (check(change1(s), ques)==1) a.add(s);
            }
            for (String x : a) System.out.println(x);
        }
    }
}