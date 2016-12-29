
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Change class name, cunstructor name and it's usage in main(String[] args).
 * @author Polyansky Vladilav
 */
public class Problem2011_03_11_C {

    private BufferedReader in = null;

    private PrintWriter out = null;

    private StringTokenizer tok = new StringTokenizer("");

    /**
     * Don't forget to change the name of the file.
     * @throws Exception
     */
    public Problem2011_03_11_C() throws Exception {
        init("floyd");
        start();
        in.close();
        out.close();
    }


    /**
     * The main part of the program.
     */
    public void start() throws Exception {
        int n = nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = nextInt();
            }
        }
//        int[][] d = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int i= 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] > a[i][k] + a[k][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }


    /**
     * Sets the file IO system.
     * @param name Name of the file without .in or .out
     */
    public void init(String name) throws FileNotFoundException {
        in = new BufferedReader(new FileReader(name + ".in"));
        out = new PrintWriter(name + ".out");
    }


    /**
     * Returns the next integer number of the input file or Integer.MIN_VALUE
     * if there are no more integers.
     * @return
     * @throws IOException
     */
    public int nextInt() throws IOException {
        String res = nextToken();
        int i;
        while (res != null) {
            try {
                i = new Integer(res);
                return i;
            } catch (NumberFormatException e) {
            }
            res = nextToken();
        }
        return Integer.MIN_VALUE;
    }


    public String nextToken() throws IOException {
        while (!tok.hasMoreTokens()) {
            String s = in.readLine();
            if (s == null) {
                return null;
            }
            tok = new StringTokenizer(s);
        }
        return tok.nextToken();
    }


    public static void swap(Object[] a, int i, int j) {
        Object t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public void TL() {
        while (true) {
        }
    }


    public void RT() {
        int a = 0;
        int b = 1 / a;
    }


    public static void main(String[] args) throws Exception {
        new Problem2011_03_11_C();
    }


}
            