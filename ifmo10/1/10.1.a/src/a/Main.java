/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package a;

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
        StringTokenizer _ab = new StringTokenizer(in.readLine());
        int [] maxbank = new int[2];
        maxbank[0] = Integer.parseInt(_ab.nextToken());
        maxbank[1] = Integer.parseInt(_ab.nextToken());
        StringTokenizer _n = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(_n.nextToken());
        int [] bank = new int[2];
        bank[0] = 0;
        bank[1] = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer temp = new StringTokenizer(in.readLine());
            String elem = temp.nextToken();
            if (elem.equals("fill")) {
                String targetS = temp.nextToken();
                int target = Integer.parseInt(targetS);
                bank[target - 1] = maxbank[target - 1];
            }
            if (elem.equals("unfill")) {
                String targetS = temp.nextToken();
                int target = Integer.parseInt(targetS);
                bank[target - 1] = 0;
            }
            if (elem.equals("1"))
                while((bank[0] > 0)&&(bank[1] < maxbank[1])) {
                    bank[0]--;
                    bank[1]++;
                }
            if (elem.equals("2"))
                while((bank[1] > 0)&&(bank[0] < maxbank[0])) {
                    bank[0]++;
                    bank[1]--;
                }
        }
        PrintWriter out = new PrintWriter("output.txt");
        out.print(bank[0] + " " + bank[1]);
        out.close();
        in.close();
    }

}
