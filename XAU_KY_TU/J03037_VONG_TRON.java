import java.util.*;
class ChuCai{
    private char c;
    private int firstpos, lastpos;
    public ChuCai(char c, int firstpos, int lastpos) {
        this.c = c;
        this.firstpos = firstpos;
        this.lastpos = lastpos;
    }   
    public char getC() {
        return c;
    }
    public int getFirstpos() {
        return firstpos;
    }
    public int getLastpos() {
        return lastpos;
    }
    
}
public class J03037_VONG_TRON {
    private static boolean doIntersect(int a, int b, int c, int d) { 
        return (a < c && c < b && b < d) || (c < a && a < d && d < b);
    }
    //Đoạn 1 từ [a; b]. Đoạn 2 từ [c; d]. Ta xem chồng lấn lên nhau không.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<ChuCai>a = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            int x = s.indexOf(c);
            int y = s.lastIndexOf(c);
            a.add(new ChuCai(c, x, y));
        }
        int res = 0;
        for(int i = 0;i<25;i++){
            for(int j = i + 1;j<26;j++){
                int x = a.get(i).getFirstpos(); int y = a.get(i).getLastpos();
                int z = a.get(j).getFirstpos(); int t = a.get(j).getLastpos();
                if(doIntersect(x, y, z, t)) res++;
            }
        }
        System.out.println(res);
    }
}
