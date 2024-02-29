/*import java.util.*;
class Pair<T1, T2>{
    private T1 first; 
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public T1 getFirst() {
        return first;
    }
    public T2 getSecond() {
        return second;
    }   
}
public class J08027_BIEN_DOI_S_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int s = sc.nextInt(), t = sc.nextInt();
            Queue<Pair<Integer, Integer>> q = new LinkedList<>();
            q.add(new Pair<>(s, 0));//Phần tử thứ nhất chỉ trạng thái của số s được biến đổi
            //Phần tử thứ 2 chỉ số bước biến đổi cần thực hiện ít nhất
            HashSet<Integer> si = new HashSet<>();
            //set để đánh dấu xem cái số mà sắp biến đổi ra đã từng biến đổi hay chưa
            si.add(s);
            while (true) {
                Pair<Integer, Integer> p = q.poll();
                if (p.getFirst() == t) {
                    System.out.println(p.getSecond());
                    break;
                }
                //Lớn hơn 1, và nếu trừ 1 đi ra 1 số ta chưa từng biến đổi
                if (p.getFirst() > 1 && !si.contains(p.getFirst() - 1)) {
                    q.add(new Pair<>(p.getFirst() - 1, p.getSecond() + 1));
                    si.add(p.getFirst()- 1);//đánh dấu là số này từng gặp qua rồi
                }
                if (p.getFirst() < t && !si.contains(p.getFirst() * 2)) {
                    q.add(new Pair<>(p.getFirst() * 2, p.getSecond() + 1));
                    si.add(p.getFirst() * 2);
                }
            }
        }
    }
}*/
