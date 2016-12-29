/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg8.d;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class D {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws FileNotFoundException {
            // TODO code application logic here
            Scanner in = new Scanner(new FileReader("stipend.in"));
            PrintWriter out = new PrintWriter("stipend.out");
            int n = in.nextInt();
            int k = in.nextInt();
            int i, j;
            int iTrRow = n + 1;
            int [][] t_pask;
            t_pask = new int[iTrRow][];
            t_pask[0] = new int[1];
            t_pask[1] = new int[2];
            t_pask[0][0] = 1;
            t_pask[1][0] = 1;
            t_pask[1][1] = 1;
            for (i = 2; i < iTrRow; i++) {
                t_pask[i]=new int[i+1];
                for (j = 0;j < i + 1; j++) {
                    if(j==0 || j==i) { 
                        t_pask[i][j]=1;
                    } else {
                        t_pask[i][j]= ((t_pask[i-1][j-1]) % 9929 + (t_pask[i-1][j]) % 9929) % 9929;
                    }
                }
            }
            out.print(t_pask[n][k]);
            out.close();
        }
}