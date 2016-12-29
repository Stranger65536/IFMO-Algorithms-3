/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t2d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(in.readLine());
        StringTokenizer _ = new StringTokenizer(in.readLine());
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(_.nextToken());
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] > a[j]) c++;
            }
        }
        PrintWriter out = new PrintWriter("output.txt");
        out.print(c); out.close();
    }

}
