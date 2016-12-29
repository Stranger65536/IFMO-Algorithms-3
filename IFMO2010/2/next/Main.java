/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package next;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
/**
 *
 * @author Made_By_Hacker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        PrintWriter out = null;
        try {
            Scanner in = new Scanner(new FileReader("next.in"));
            out = new PrintWriter("next.out");
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
if (n > 2)
{
            int k = n; k -= 2;
            while ((a[k]>a[k+1])&&(k !=-1))
            {
                k--;
                if (k == -1) break;
            }
            if (k != -1)
            {
                int max = a[k];
                int nmax = k;
                for (int i = k; i < n; i++)
                {                
                    if (a[i] > max)
                    {
                        max = a[i];
                        nmax = i;
                        break;
                    }
                }
                for (int i = nmax; i < n; i++)
                {
                    if ((a[i] > a[k]) && (a[i] < max))
                    {
                        max = a[i];
                        nmax = i;
                    }
                }
                int temp = a[nmax];
                a[nmax] = a[k];
                a[k] = temp;
                int count = n - k - 1;
                if (count == 2)
                {
                    if (a[k + 1] > a[k + 2])
                    {
                        temp = a[k + 1];
                        a[k + 1] = a[k + 2];
                        a[k + 2] = temp;
                    }
                }
                if (count > 2)
                {
                    Arrays.sort(a, k + 1, n);
                  //  int step = count / 2;
                  //  for (int i = k + 1; i < step; i++)
                  //  {
                  //      temp = a[i];
                  //      a[i] = a[n - i - 1];
                  //      a[n - i - 1] = temp;
                  //  }
                }
                for (int i = 0; i < n; i++)
                {
                    out.print(a[i]);
                    out.print(' ');
                }
            }
            else
                for (int i = 1; i <= n; i++)
                {
                    out.print(i);
                    out.print(' ');
                }
}
else
{
    if (n == 1) out.print("1");
    if (n == 2)
    {
        if (a[0] == 1)
        {
            out.print("2 1");
        }
        else
        {
            out.print("1 2");
        }
    }
}
            //out.println(n + k);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

}
