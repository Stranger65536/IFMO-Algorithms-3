/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Str@nger
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("haircut.in"));
        StringTokenizer _ = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(_.nextToken());
        int k = Integer.parseInt(_.nextToken());
        int z[] = new int[n + 1]; int k2 = n % k; int k1 = k - k2; int m = n/k;
        int l = 2; for (int i = 1; i <= k; i++) {
            if (k1 > 0) {
                if (n - l + 1 < m) {
                    z[1] = i;
		    for (int j=l; j<=n; j++) z[j] = i;
		    break;
                }
                for (int j=l; j<l+m; j++) z[j] = i;
		l = l + m; k1--;
		continue;
            }
            if (k2 > 0) {
                if (n - l + 1 < m + 1) {
                    z[1] = i;
		    for (int j=l; j<=n; j++) z[j] = i;
		    break;
                }
                for (int j=l; j<=l+m; j++) z[j] = i;
		l = l + m + 1; k2--;
		continue;
            }
        }
        PrintWriter out = new PrintWriter("haircut.out");
        for (int i = 1; i <= n; i++) out.print(z[i] + " "); out.close();
    }
}
