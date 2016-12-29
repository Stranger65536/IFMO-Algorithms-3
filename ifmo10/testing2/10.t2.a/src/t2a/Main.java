/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t2a;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    static int check(int a, int b, int c, int d, int e) {
        int i = 0;
        if (a == 1) i++;
        if (b == 2) i++;
        if (c == 3) i++;
        if (d == 4) i++;
        if (e == 5) i++;
        return i;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        PrintWriter out = new PrintWriter("output.txt");
        for (int first = 1; first <= 5; first ++) {
            for (int second = 1; second <= 5; second ++) {
                for (int third = 1; third <= 5; third ++) {
                    for (int fourth = 1; fourth <= 5; fourth++) {
                        for (int fifth = 1; fifth <= 5; fifth++) {
                            if ((first != second)&&(first != third)&&(first != fourth)&&(first != fifth)
                            && (second != third) && (second != fourth) && (second != fifth)
                            && (third != fourth) && (third != fifth)
                            && (fourth != fifth)){
                                if (check(first,second,third,fourth,fifth) == 3) {
                                    out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);
                                }
                    }
                        }
                    }
                }
            }
        }
        out.close();
    }

}
