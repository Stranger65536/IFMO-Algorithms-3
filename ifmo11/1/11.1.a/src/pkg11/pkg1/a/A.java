/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("cities.in"));
        PrintWriter out = new PrintWriter("cities.out");
        int count = 0;
        int n = in.nextInt();
        for (int i = 0; i < n * n; i++) {
            int temp = in.nextInt();
            if (temp == 1) count++;
        }
        int res = count / 2;
        out.println(res);
        out.close();
    }
}
