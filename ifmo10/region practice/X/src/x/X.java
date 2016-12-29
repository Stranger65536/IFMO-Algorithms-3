/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package x;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("sum.in"));
        long a = in.nextLong(); long b = in.nextLong();
        in.close();
        PrintWriter out = new PrintWriter("sum.out");
        out.print(a + b);
        out.close();
    }
}
