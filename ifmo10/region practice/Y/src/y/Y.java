/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package y;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Str@nger
 */
public class Y {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("sequence.in"));
        int n = Integer.parseInt(in.readLine());
        StringTokenizer _ = new StringTokenizer(in.readLine());
        Stack st = new Stack();
        PrintWriter out = new PrintWriter("sequence.out");
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(_.nextToken());
            st.push(temp);
        }
        for (int i = 0; i < n; i++) {
            out.print(st.pop() + " ");
        }
        out.close();
    }
}
