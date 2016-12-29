/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package d;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author smart113
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int n = in.nextInt();
        int max = 0;
        int nmax = 0;
        boolean flag = false;
        for (int i = 1; i < n+1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if ((x+y)>max){
                max = x + y;
                nmax = i;
            }
            if ((x>6)||(x<1)||(y>6)||(y<1)) {
                out.println("-1 "+ i);
                flag = true;
                break;
            }
        }
        if (!flag){
            out.println(nmax);
        }
        out.close();
    }    

}
