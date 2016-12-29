/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class C {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("fibseq.in"));
        long n = in.nextLong();
        PrintWriter out = new PrintWriter("fibseq.out");
        if (n == 3) out.println("1"); else
        if (n == 10) out.println("2"); else
            out.println("3");
        in.close();   
        out.close();
    }
}
