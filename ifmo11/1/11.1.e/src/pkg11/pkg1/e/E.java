/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.e;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static void dfs(int u, int n, int[][] a, boolean[] used) {
        used[u] = true;
        for (int i = 0; i < n; i++) {
            if ((!used[i]) && (a[u][i] == 1)) dfs(i, n, a, used);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("matrix.in"));
        PrintWriter out = new PrintWriter("matrix.out");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) count++;
            }
        }
        in.close();
        if (n == 1) {
            out.println("1");
            out.close();            
        }
        else {
            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) used[i] = false;
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    dfs(i, n, a, used);
                    res++;
                }
            }
            out.println(res);
            out.close();
        }
    }
}
