/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import java.io.*;
import java.util.*;

/**
 *
 * @author stranger
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static int P(long x) {
        int temp1 = (int) ((x * x) % 1743);
        temp1 = (int) ((temp1 * x) % 1743);
        temp1 = (temp1 * 132) % 1743;
        int temp2 = (int) ((x * x) % 1743);
        temp2 = (temp2 * 77) % 1743;
        int temp3 = (int) ((1345 * x) % 1743);
        return (temp1 + temp2 + temp3 + 1577) % 1743;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        long before = System.currentTimeMillis();
        BufferedReader in = new BufferedReader(new FileReader("kth.in"));
        StringTokenizer _ = new StringTokenizer(in.readLine());
        long n = Long.parseLong(_.nextToken());
        long k = Long.parseLong(_.nextToken());
        int[] a = new int[1743];
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                a[P(i)]++;
            }
        }
        long count = 0;
        int res;
        for (int i = 1; i <= 1742; i++) {
            int temp = a[i];
            if (temp != 0) {
                count += temp;
                if (count >= k) {
                    PrintWriter out = new PrintWriter("kth.out");
                    out.println(i);
                    out.close();
                    return;
                }
            }
        }
    }
}
