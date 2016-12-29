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
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("merge.in"));
        PrintWriter out = new PrintWriter("merge.out");
        StringTokenizer _ = new StringTokenizer(in.readLine());
        long n = Long.parseLong(_.nextToken());
        long t = 1, i = 1, j = 1, a = 1, b = 1, ans = 1;
        while (t <= n) {
            if (a <= b) {
                ans = a;
                i++;
                a += (i * i * i) % 12345;
            } else {
                ans = b;
                j++;
                b += (j * j) % 123;
           }
           t++;
       }
       out.println(ans);
       out.close();
    }
}
