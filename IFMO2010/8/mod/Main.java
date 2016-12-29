/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mod;

import java.io.*;
import java.math.BigInteger;
import java.math.BigInteger.*;
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
          Scanner in = new Scanner(new FileReader("mod.in"));
          PrintWriter out = new PrintWriter("mod.out");
          BigInteger n = BigInteger.valueOf(in.nextInt());
          int b = new Integer(in.nextInt());
          BigInteger p = BigInteger.valueOf(10);
          BigInteger t = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
          p = p.modPow(BigInteger.valueOf(b),t);
          out.println(n.modPow(n,p));
          out.close();
          in.close();
    }

}