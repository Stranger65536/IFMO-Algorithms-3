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

    static int inf = 20000000;
    static int[] d;
    static int res = 0;

    public static void merge(int l,int m,int r) {
	int n1 = m - l + 3;
        int n2 = r - m + 2;
	int[] a = new int[n1];
        int[] b = new int[n2];
	for (int i = l;i <= m;i++)
            a[i - l + 1] = d[i];
	for (int i = m + 1;i <= r;i++)
            b[i - m] = d[i];
	
	a[n1-1]=inf; b[n2-1]=inf; 
	int x=1; int y=1; int c=l;
	
	while (true) {
            if (a[x] == b[y] && a[x] == inf) break;
            if (a[x] <= b[y]) {
                d[c] = a[x];
                x++;
                c++;
            }
            else {
                res += n1 - x - 1;
                d[c] = b[y];
                c++;
                y++;
            }
	}
    }

    public static void msort(int l,int r) {
	if (l<r)
	{
		int m=(l+r)/2;
		msort(l,m); msort(m+1,r);
		merge(l,m,r);
	}
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("inverse.in"));
        int n = Integer.parseInt(in.readLine());
        d = new int[n + 1];
        StringTokenizer _ = new StringTokenizer(in.readLine());
        for (int i = 1; i <= n; i++) {
            d[i] = Integer.parseInt(_.nextToken());
        }
        msort(1,n);
        PrintWriter out = new PrintWriter("inverse.out");
        out.println(res);
        out.close();
    }

}
