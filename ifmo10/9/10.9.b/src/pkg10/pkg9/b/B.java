/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg9.b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class B {

    /**
     * @param args the command line arguments
     */
    
    static PrintWriter out;
    static int n;
    static ArrayList arr;
    
    static void func(int x, int n, int[] b, int[] a) {
        int i;
        if (x == n) {
            for (i = 0; i < n; i++)
                out.print(a[i] + " ");
            out.println();
        } else {
            for (i = 0; i < n; i++) {
                if (b[i] == 0) {
                    b[i] = 1;
                    a[x] = i + 1;
                    func(x + 1, n, b, a);
                    b[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("permutations.in"));
        out = new PrintWriter("permutations.out");
        n = in.nextInt();
        int[] b = new int[9];
        int[] a = new int[9];
        func(0, n, b, a);
        out.close();
    }
}
