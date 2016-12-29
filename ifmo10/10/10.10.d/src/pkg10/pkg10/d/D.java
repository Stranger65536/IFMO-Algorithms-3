/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg10.d;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Str@nger
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("m2e.in"));
        int n = Integer.parseInt(in.readLine());
        PrintWriter out = new PrintWriter("m2e.out");
        for (int i = 0; i < n; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            int temp;
            for (int j = 0; j <= i; j++) {
                temp = Integer.parseInt(_.nextToken());
                if (temp == 1) {
                   out.println( (j + 1) + " " + (i + 1) );
                }
            }
        }
        out.close();
    }
}
