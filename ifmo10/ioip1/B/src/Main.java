
import java.io.*;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("sqfree.in"));
        StringTokenizer _ = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(_.nextToken());
        StringTokenizer __ = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(__.nextToken());
        int b = Integer.parseInt(__.nextToken());
        int [] sqr = new int[10000001];
        int count = 0;
        int res = 0;
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) != (int)Math.sqrt(i)) {
                count++;
                if (count == k) {
                    res = i;
                    break;
                }
            }
        }
        PrintWriter out = new PrintWriter("sqfree.out");
        out.print(res);
        out.close();
    }
}
