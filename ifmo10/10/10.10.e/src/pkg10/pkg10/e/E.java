/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg10.e;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Str@nger
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("e2m.in"));
        PrintWriter out = new PrintWriter("e2m.out");
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][n];
        for (int i = 0; i < m; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            int temp1 = Integer.parseInt(_.nextToken());
            int temp2 = Integer.parseInt(_.nextToken());
            a[temp1 - 1][temp2 - 1] = 1;
            a[temp2 - 1][temp1 - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
        out.close();
    }
}
