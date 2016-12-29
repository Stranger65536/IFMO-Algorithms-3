/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void mergeSort(int[] a, int low, int high) {
        if (low + 1 < high) {
            int mid = (low + high) >>> 1;
            mergeSort(a, low, mid);
            mergeSort(a, mid, high);
            int size = high - low;
            int[] b = new int[size];
            int i = low;
            int j = mid;
            for (int k = 0; k < size; k++) {
                if (j >= high || i < mid && a[i] < a[j]) {
                    b[k] = a[i++];
                } else {
                    b[k] = a[j++];
                }
            }
            System.arraycopy(b, 0, a, low, size);
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new  BufferedReader(new FileReader("sort.in"));
        PrintWriter out = new PrintWriter("sort.out");
        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        StringTokenizer _ = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(_.nextToken());
        }
        mergeSort(a, 0, n);
        for (int i = 0; i < n; i++) {
            out.print(a[i] + " ");
        }
        out.close();
    }

}
