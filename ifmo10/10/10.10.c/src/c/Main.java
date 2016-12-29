/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author smart25
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("rain.in"));
        PrintWriter out = new PrintWriter("rain.out");
        int n = Integer.parseInt(in.readLine());
        int[][] a = new int[n][n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(_.nextToken());
            }
        }
        String s = in.readLine();
        StringTokenizer _ = new StringTokenizer(in.readLine());
        int count = 0;
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(_.nextToken());
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i][j] == a[j][i] && b[i] != b[j] && a[i][j] == 1)
                    count++;
            }
        }
        out.println(count);
        out.close();
    }

}

