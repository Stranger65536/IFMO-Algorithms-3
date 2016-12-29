/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import java.util.*;
import java.io.*;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("coeff.in"));
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < m; i++)
            a[0][i] = 1;
        for (int i = 0; i < n; i++)
            a[i][0] = 1;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                a[i][j] = a[i - 1][j] + a[i][j - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        PrintWriter out = new PrintWriter("coeff.out");
        out.println(a[n-1][m-1]);
        out.close();
    }

}
