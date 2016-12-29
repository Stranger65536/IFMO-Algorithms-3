/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package multiply;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author starlight
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
          Scanner in = new Scanner(new FileReader("multiply.in"));
          PrintWriter out = new PrintWriter("multiply.out");
          BigInteger a = new BigInteger(in.nextLine());
          BigInteger b = new BigInteger(in.nextLine());
          out.println(a.multiply(b));
          out.close();
          in.close();
    }

}
