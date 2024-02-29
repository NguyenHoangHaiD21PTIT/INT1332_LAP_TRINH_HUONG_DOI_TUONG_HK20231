package UNG_DUNG_JAVA_COLLECTIONS;
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
public class SO_BUOC_DI_CHUYEN_IT_NHAT {
    public static int minSteps(int n, int m, int[][] a) {
        int[][] d = new int[n][m];
        int[][] visited = new int [n][m];
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        visited[0][0] = 1;
        while (!q.isEmpty()) {
            Pair <Integer, Integer>p = q.poll();
            int i = p.getFirst(), j = p.getSecond();
            if(i==n-1 && j==m-1) return d[n - 1][m - 1];
            for (int k = 0; k < 3; k++) {
                int i1 = i, j1 = j, step = 0;
                if (k == 0 && j + 1< m){
                    step = Math.abs(a[i][j] - a[i][j + 1]);
                    i1 = i; j1 = j + step;
                } else if (k == 1 && i + 1< n){
                    step = Math.abs(a[i][j] - a[i + 1][j]);
                    i1 = i + step; j1 = j;
                } else if (k == 2 && i + 1< n  && j + 1 < m){
                    step = Math.abs(a[i][j] - a[i + 1][j + 1]);
                    i1 = i + step; j1 = j + step;
                }
                if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && visited[i1][j1] == 0) {
                    q.add(new Pair(i1, j1));
                    d[i1][j1] = d[i][j] + 1;
                    visited[i1][j1] = 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            }
            int result = minSteps(n, m, a);
            System.out.println(result);
        }
    }
}
