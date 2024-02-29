import java.util.*;
import java.io.*;
public class J07078_TIM_VI_TRI_XAU_CON {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("STRING.in")); 
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- > 0){
                String s1 = sc.next(), s2 = sc.next();
                int cnt = 0;//Đây là biến lưu vị trí bắt đầu tìm xâu con
                while (s1.indexOf(s2) != -1) {
                    int idex = s1.indexOf(s2); //Chỉ số đầu tiên tìm thấy xâu con
                    System.out.print((idex + cnt + 1) + " "); //Chỉ số ấy có được là do đã vứt đi cnt ký tự xâu nên chỉ số thực phải cộng bù vào
                    s1 = s1.substring(idex + 1); //Ví dụ, tìm thấy ở vị trí 4 thì phải vứt cả 4 ký tự đầu để không xét lại nữa
                    cnt += idex + 1; //Ví dụ như tìm thấy ở vị trí 4 thì phải xét từ 5
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
