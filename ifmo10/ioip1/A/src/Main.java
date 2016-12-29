
import java.util.*;
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int count(int elem) {
        int c = 1;
        if (elem < 10) return 1;
        else {
            while (elem > 9) {
                elem /= 10;
                c++;
            }
            return c;
        }
    }
    
    public static int compare(int[] a, int[] b) {
        if (a.length < b.length) return -1;
        if (a.length > b.length) return 1;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > b[i]) return 1;
                if (a[i] < b[i]) return -1;
            }
        }
        return 0;
    }
    
    public static void swap(int[] a, int[] b, int pos) {
        int temp = a[pos];
        a[pos] = b[pos];
        b[pos] = temp;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("candies.in"));
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        PrintWriter out = new PrintWriter("candies.out");
        if (a > b) {
            out.println("0");
            out.print("0");
            out.close();
            return;
        }
        if (count(a) < count(b) || a == b) {
            out.print("Bad luck");
            out.close();
            return;
        }
        if (count(a) == count(b)) {
            int count = 0;
            FileReader inn = new FileReader("candies.in");
            int[] as = new int[count(a)];
            int[] bs = new int[count(b)];
            String s = "";
            for (int i = 0; i < count(a); i++) {
                as[i] = inn.read() - 48;
            }
            inn.read();inn.read();
            for (int i = 0; i < count(b); i++) {
                bs[i] = inn.read() - 48;
            }
            for (int i = 0; i < count(a); i++) {
                swap(as, bs, i); count++; s += Integer.toString(i + 1); s += " ";
                if (compare(as, bs) == 1) {
                    break;
                }
            }
            out.println(count);
            out.println(s);
            out.close();
        }
    }
}
