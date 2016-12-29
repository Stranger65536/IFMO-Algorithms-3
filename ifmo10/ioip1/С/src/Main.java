
import java.io.*;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("interview.in"));
        StringTokenizer _ = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(_.nextToken());
        int m = Integer.parseInt(_.nextToken());
        StringTokenizer __ = new StringTokenizer(in.readLine());
        StringTokenizer ___ = new StringTokenizer(in.readLine());
        int[] a = new int[n + 1]; int[] b = new int[m + 1];
        for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(__.nextToken());
        for (int i = 1; i <= m; i++) b[i] = Integer.parseInt(___.nextToken());
        int[][] lcs = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) lcs[i][j] = 0;
                else {
                    if (a[i] == b[j]) lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    else lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        PrintWriter out = new PrintWriter("interview.out");
        out.print(lcs[n][m]); 
        out.close();
    }
}
