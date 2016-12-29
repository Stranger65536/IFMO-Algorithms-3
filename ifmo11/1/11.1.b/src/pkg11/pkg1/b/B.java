/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.b;

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
        Scanner in = new Scanner(new FileReader("lights.in"));
        PrintWriter out = new PrintWriter("lights.out");
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = 0;
        for(int i = 0; i < m; i++) {
            int temp = in.nextInt();
            a[--temp]++;
            temp = in.nextInt();
            ++a[--temp];
        }  
        in.close();
        for (int i = 0; i < n; i++) 
            out.print(a[i] + " ");
        out.close();
    }
}
