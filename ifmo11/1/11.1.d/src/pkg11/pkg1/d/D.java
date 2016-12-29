/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.d;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("m2e.in"));
        PrintWriter out = new PrintWriter("m2e.out");
        int n = in.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                a[i][j] = in.nextInt();
        } 
        if (n == 1) {
            out.println();
            out.close();
        } 
        else {
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i][j] == 1) {
                        int i1 = i + 1;
                        int j1 = j + 1;
                        out.println(i1 + " " + j1);
                    }
                }
            }
            out.close();
        }
    }
}
