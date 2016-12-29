package Main;

import java.io.*;
import java.utils.*;

/**
 * Created by ololo.
 * User: Str@nger
 * Date: 14.05.12
 * Time: 17:45
 */
public class Main {

    public static void main(String[] args) throws IOException{
        int [][] a = new int[65539][17];
        int [][] b = new int[65539][17];
        Scanner in = new Scanner(new FileReader("vectors.in"));
        PrintWriter out = new PrintWriter("vectors.out");
        int n = in.nextInt();
        int k = 1; int res = 0; int l = 0; int p = 0;
        for (int i = 1; i <= n; i++)
            k *= 2;
        for (int i = 1; i <= k; i++) {
            for (int j = n; j >= 1; j++) {
                a[i][j] = p % 2;
                l /= 2;
                p = l;
            }
            l = i;
            p = l;
        }
        int m = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (a[i][j] == 1 && a[i][j + 1] == 1) {
                    m++;
                    break;
                }
            }
            if (m == 0) {
                res++;
                for (int l = 1; l <= n; l++)
                    b[res][l] = a[i][j];
            }
            m = 0;
        }
        out.println(res);
        for (int i = 1; i <= res; i++) {
            for (int j = 1; j <= n; j++)
                out.print(b[i][j]);
            out.println();
        }
    }

}
