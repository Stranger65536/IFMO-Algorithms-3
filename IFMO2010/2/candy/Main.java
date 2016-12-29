/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Made_By_Hacker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n)
    {
        int ret = 1;
        for (int i = 1; i <= n; ++i)
        {
            ret = ((ret % 12345) * (i % 12345)) % 12345;
        }
        return ret;
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
        PrintWriter out = null;
        try {
            Scanner in = new Scanner(new FileReader("candy.in"));
            out = new PrintWriter("candy.out");
            int n = in.nextInt();
            int k = in.nextInt();
            int i,j;
            int iTrRow = n + 1;
            int [][] t_pask;
if (n != 0 && k != 0)
{
            t_pask=new int[iTrRow][];
            t_pask[0]=new int[1];
            t_pask[1]=new int[2];
            t_pask[0][0]=1;
            t_pask[1][0]=1;
            t_pask[1][1]=1;
            for (i = 2; i < iTrRow; i++)
            {
                t_pask[i]=new int[i+1];
                for (j = 0;j < i + 1; j++)
                {
                    if(j==0 || j==i) t_pask[i][j]=1;
                    else
                        t_pask[i][j]= ((t_pask[i-1][j-1]) % 12345 + (t_pask[i-1][j]) % 12345) % 12345;
                }
            }
            out.print((t_pask[n][k] * factorial(k)) % 12345);
}
            else out.println('1');
            //out.println(n + k);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

}
