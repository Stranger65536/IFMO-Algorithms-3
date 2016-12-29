/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("e2m.in"));
        PrintWriter out = new PrintWriter("e2m.out");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mas = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            mas[a - 1][b - 1] = 1;
            mas[b - 1][a - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                out.print(mas[i][j] + " ");
            out.println();
        }
        in.close();
        out.close();
    }
}
