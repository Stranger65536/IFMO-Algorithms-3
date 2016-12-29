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
import java.util.StringTokenizer;

/**
 *
 * @author smart25
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("cities.in"));
        PrintWriter out = new PrintWriter("cities.out");
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(_.nextToken());
                if (temp == 1) count++;
            }
        }
        out.println(count / 2);
        out.close();
    }

}
