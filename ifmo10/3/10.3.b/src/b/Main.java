/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

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
        BufferedReader in = new BufferedReader(new FileReader("count.in"));
        String _n = in.readLine();
        int n = Integer.parseInt(_n);
        StringTokenizer tmp = new StringTokenizer(in.readLine());
        int [] count = new int[100001];
        PrintWriter out = new PrintWriter("count.out");
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(tmp.nextToken());
            count [temp]++;
        }
        for (int i = 0; i <= 100000; i++) {
            if (count[i] != 0)
                for (int j = 0; j < count[i]; j++)
                    out.print(i + " ");
        }
        out.close();
        in.close();
    }

}
