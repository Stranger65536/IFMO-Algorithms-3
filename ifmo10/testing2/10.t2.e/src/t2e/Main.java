/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t2e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void sdvig(char[] a, int k) {
        for (int i = 0; i < k; i++) {
            char temp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        String s = in.readLine();
        char[] a = new char[s.length()];
        a = s.toCharArray();
        int k = Integer.parseInt(in.readLine());
        sdvig(a,k);
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1])
                c++;
        }
        PrintWriter out = new PrintWriter("output.txt");
        out.println(c); out.close();
    }

}
