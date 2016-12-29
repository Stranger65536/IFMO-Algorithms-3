/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c;

import java.io.*;
import java.util.*;

/**
 *
 * @author Str@nger
 */
public class Main {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader
                (new FileReader("input.txt"));
        StringTokenizer _n = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(_n.nextToken());
        StringTokenizer _input = new StringTokenizer(in.readLine());
        int [] perest = new int[n + 1];
        boolean [] a = new boolean[n + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            perest[i] = Integer.parseInt(_input.nextToken());
            if (perest[i]> max) max = perest[i];
        }
        PrintWriter out = new PrintWriter("output.txt");
        if (n == 1){
            if (perest[1]==1) {
                out.println("2");
                out.println("1");
            }
            else {
                out.println("1");
                out.println("1");
            }
        }
        else {
            int p = max + 1;
            out.println(p);
            for (int i = 1; i <= n; i++) {
                if (perest[i] == 0) {
                    int temp = p;
                    if (!a[temp]) {
                        a[temp] = true;
                    }
                    else {
                         while (a[temp])
                            temp += p;
                         a[temp] = true;
                    }
                    out.print(temp + " ");
                } else {
                     int temp = perest[i];
                     while (a[temp])
                         temp += p;
                     a[temp] = true;
                     out.print(temp + " ");
                }
            }
        }
        out.close();
    }

}
