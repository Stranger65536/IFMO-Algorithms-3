/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.f;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author Str@nger
 */
public class F {

     static void dfs(int u, int n, int[][] a, boolean[] used) {
        used[u] = true;
        for (int i = 0; i < n; i++) {
            if ((!used[i]) && (a[u][i] == 1)) dfs(i, n, a, used);
        }
     }
     public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("tree.in"));
        PrintWriter out = new PrintWriter("tree.out");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) count++;
            }
        }
        in.close(); count/=2;
        if (n == 1) {
            out.println("YES");
            out.close();            
        }
        else {
            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) used[i] = false;
            dfs(0, n, a, used);
            boolean flag = true;
            for (int i = 0; i < n; i++)
                if (!used[i]) flag = false;
            if (!flag|n-count!=1) out.println("NO");
                else out.println("YES"); 
            out.close();
        }
    }
}
