/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg8.b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("catalan.in"));
        PrintWriter out = new PrintWriter("catalan.out");
        int n = in.nextInt();
        int[] a = new int[501];
        a[0] = a[1] = 1;
        if (n == 0 || n == 1) {
            out.println("1");
        } else {
            for (int j = 2; j <= n; j++) {
                for (int i = 0; i < j; i++) {
                    a[j] = (a[j] + a[i] * a[j - 1 - i]) % 1234;
                }
            }
            out.println(a[n]);
        }
        out.close();
    }
}
