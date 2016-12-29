/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg8.c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("next.in"));
        PrintWriter out = new PrintWriter("next.out");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = in.nextInt();
        if (n > 2) {
            int k = n; k -= 2;
            while ((a[k]>a[k+1])&&(k !=-1)) {
                k--;
                if (k == -1) break;
            }
            if (k != -1) {
                int max = a[k];
                int nmax = k;
                for (int i = k; i < n; i++) {                
                    if (a[i] > max) {
                        max = a[i];
                        nmax = i;
                        break;
                    }
                }
                for (int i = nmax; i < n; i++) {
                    if ((a[i] > a[k]) && (a[i] < max)) {
                        max = a[i];
                        nmax = i;
                    }
                }
                int temp = a[nmax];
                a[nmax] = a[k];
                a[k] = temp;
                int count = n - k - 1;
                if (count == 2) {
                    if (a[k + 1] > a[k + 2]) {
                        temp = a[k + 1];
                        a[k + 1] = a[k + 2];
                        a[k + 2] = temp;
                    }
                }
                if (count > 2) {
                    Arrays.sort(a, k + 1, n);
                }
                for (int i = 0; i < n; i++) {
                    out.print(a[i]);
                    out.print(' ');
                }
            }
            else
                for (int i = 1; i <= n; i++) {
                    out.print(i);
                    out.print(' ');
                }
        } else {
            if (n == 1) out.print("1");
            if (n == 2) {
                if (a[0] == 1) {
                    out.print("2 1");
                } else {
                    out.print("1 2");
                }
            }
        }
        out.close();
    }

}
