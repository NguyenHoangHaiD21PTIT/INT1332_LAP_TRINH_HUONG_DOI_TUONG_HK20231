package XAU_KY_TU;
import java.io.*;
import java.util.*;
public class J03036_XOAY_VONG_KY_TU {
    //Hàm tính số bước để xoay xâu A thành xâu B (B giữ nguyên).
    //A: Mỗi lần ta sẽ lấy kí tự đầu đưa xuống cuối
    public static int rotate(String a, String b){
        if(a.length()!=b.length()) return -1;//Không bao giờ bằng nhau được
        String s = a;
        for(int i = 0;i<=a.length();i++){ 
            if(s.compareTo(b)==0) return i;
            s = s.substring(1) + s.charAt(0);
        }
        return -1;
    }
    public static int soBuoc(ArrayList<String>a){ 
        int ans = 1000000;
        for(String x: a){ 
            int cnt = 0;
            //Mỗi bước chọn 1 xâu, bắt các xâu còn lại xoay theo xâu này xem cả mảng xâu cần mấy bước
            for(String y: a){ 
                int tmp = rotate(x, y);
                if(tmp ==-1) return -1;
                cnt+=rotate(y, x);
            }
            //Ta đã có số bước để xoay cả mảng xâu theo xâu x được chọn
            ans = Math.min(ans, cnt);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String>a = new ArrayList<>();
        while(t-- >0) a.add(sc.nextLine());
        System.out.println(soBuoc(a));
    }
}
/*
xzzwo
zwoxz
zzwox
xzzwo
*/
