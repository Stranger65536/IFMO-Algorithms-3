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
        BufferedReader in = new BufferedReader(new FileReader("sequence.in"));
        PrintWriter out = new PrintWriter("sequence.out");
        int n = Integer.parseInt(in.readLine());
        int [] arr = new int[n + 1];
        StringTokenizer tmp = new StringTokenizer(in.readLine());
        for (int i = 1; i <= n ; i++)
            arr[i] = Integer.parseInt(tmp.nextToken());
        if (n % 2 == 0)
            for (int i = 1; i <= (n / 2); i++)
                out.print(arr[i] + " " + arr[n - i + 1] + " ");
        else {
            for (int i = 1; i <= (n / 2); i++)
                out.print(arr[i] + " " + arr[n - i + 1] + " ");
            out.print(arr [ n / 2 + 1 ] + " ");
        }
        out.close(); in.close(); 
    }

}
