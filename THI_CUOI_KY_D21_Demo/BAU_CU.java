package THI_CUOI_KY_D21_Demo;
import java.util.*;
class Pair implements Comparable<Pair> {
    private int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public int compareTo(Pair o) {
        if (this.second != o.second) return this.second - o.second; // Sắp xếp theo second tăng dần
        return this.first - o.first; // Nếu second bằng nhau thì sắp xếp theo first tăng dần
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
}

public class BAU_CU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], cnt = new int[1000]; 
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        ArrayList<Pair> count = new ArrayList<>();
        for (int x : a) {
            if (cnt[x] > 0) {
                count.add(new Pair(x, cnt[x]));
                cnt[x] = 0;
            }
        }
        Collections.sort(count);
        int result = -1;
        for (int i = count.size() - 2; i >= 0; --i) {
            if (count.get(i).getSecond() < count.get(count.size() - 1).getSecond()) {
                result = count.get(i).getFirst();
                break;
            }
        }
        if (result == -1) System.out.println("NONE");
        else System.out.println(result);
    }
}
