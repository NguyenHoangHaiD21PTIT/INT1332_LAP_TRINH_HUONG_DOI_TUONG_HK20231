/*package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
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
public class J08029_QUAN_MA {
    static int s, t, u, v;
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[][] visited = new int[10][10];
    static int[][] d = new int[10][10]; //số bước đẻ đến được ô (i, j)
    public static int BFS() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                visited[i][j] = 0;
                d[i][j] = 0;
            }
        }
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair(s, t));
        visited[s][t] = 1;
        while (!q.isEmpty()) {
            Pair<Integer, Integer> p = q.poll();
            int i = p.getFirst(), j = p.getSecond();
            if (i == u && j == v) return d[u][v];
            for (int k = 0; k < 8; k++) {
                int i1 = i + dx[k];
                int j1 = j + dy[k];
                if (i1 >= 0 && i1 <= 7 && j1 >= 0 && j1 <= 7 && visited[i1][j1] == 0) {
                    q.add(new Pair<>(i1, j1));
                    visited[i1][j1] = 1;
                    d[i1][j1] = d[i][j] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            t = s1.charAt(0) - 'a';
            s = s1.charAt(1) - '0' - 1;
            v = s2.charAt(0) - 'a';
            u = s2.charAt(1) - '0' - 1;
            System.out.println(BFS());
        }
    }

}*/







