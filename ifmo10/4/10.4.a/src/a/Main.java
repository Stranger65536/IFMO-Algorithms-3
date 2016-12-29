/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Str@nger
 */

public class Main {

    static PrintWriter out;

    static void hanoi (int k, int a, int b)  throws IOException {
        if (k == 1) {
            String s = ""; s = s + a;
            s = s + " "; s = s + b;
            out.println(s);
            //System.out.println(a + " " + b);
        } else {
            hanoi(k - 1, a, 6 - a - b);
            hanoi(1, a, b);
            hanoi(k - 1, 6 - a - b, b);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("hanoi.in"));
        out = new PrintWriter("hanoi.out");
        int n = Integer.parseInt(in.readLine());
        hanoi(n, 1, 2);
        out.close();
    }

}
