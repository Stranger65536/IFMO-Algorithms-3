/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

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
        BufferedReader in = new BufferedReader(new FileReader("lights.in"));
        PrintWriter out = new PrintWriter("lights.out");
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i < m; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            int temp1 = Integer.parseInt(_.nextToken()) - 1;
            int temp2 = Integer.parseInt(_.nextToken()) - 1;
            a[temp1]++;
            a[temp2]++;
        }
        for (int i = 0; i < n; i++) {
            out.print(a[i] + " ");
        }
        out.close();
    }

}
