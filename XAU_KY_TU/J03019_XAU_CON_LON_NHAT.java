import java.util.Scanner;
public class J03019_XAU_CON_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0, end = 0;
        char max;
        while(start < s.length()){
            //Tìm min trong [start; end]
            max = s.charAt(start);
            for(int i = start; i<s.length();i++){
                if (s.charAt(i)>max) max = s.charAt(i);
            }
            //In ra các phần tử = max
            for(int i = start; i<s.length();i++){
                if (s.charAt(i)==max){ 
                    System.out.print(max);
                    end = i;
                }
            }
            //Vị trí end chính là vị trí kết thúc của xâu con (có thể không liên tiếp) dãy ký tự lớn nhất
            //Bây giờ, ta lại phải tìm tiếp từ end trở đi -> Reset lại start = end cũ + 1
            start = end + 1;
        }
    }
}
