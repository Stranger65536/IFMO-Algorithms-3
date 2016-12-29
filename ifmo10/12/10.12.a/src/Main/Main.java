package Main;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by ololo.
 * User: Str@nger
 * Date: 30.03.12
 * Time: 21:30
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("bfs.in"));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        boolean[] used = new boolean[n + 1];
        int v;
        int[][] m = new int[n + 1][n + 1];
        int[] a = new int[1000000];
        int[] d = new int[1000000];
        for (int i = 1; i <= n; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            for (int j = 1; j <= n; j++) {
                m[i][j] = Integer.parseInt(_.nextToken());
            }
        }
        a[1] = s; used[s] = true; int head = 1; int tail = 1; d[s] = 0;
        while (head <= tail) {
            v = a[head];
            head++;
            for (int i = 1; i <= n; i++) {
                if (m[v][i] == 1 && !used[i]) {
                    used[i] = true;
                    tail++;
                    a[tail] = i;
                    d[i] = d[v] + 1;
                }
            }
        }
        PrintWriter out = new PrintWriter("bfs.out");
        out.println(d[f]);
        out.close();
    }
}
