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
import java.util.ArrayList;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("postfix.in"));
        PrintWriter out = new PrintWriter("postfix.out");
        ArrayList <Integer> stack = new ArrayList <Integer> ();
        while (in.ready()) {
            char c = (char)in.read();
            if ((c != ' ') && (c != '+') && (c != '-') && (c != '*')) {
                int chis = (int) c - (int) '0';
                stack.add(chis);
            }
            if (c == '+') {
                int first = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int second = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int res = first + second;
                stack.add(res);
            }
            if (c == '-') {
                int first = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int second = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int res = second - first;
                stack.add(res);
            }
            if (c == '*') {
                int first = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int second = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                int res = first * second;
                stack.add(res);
            }
        }
        out.print(stack.get(0));
        out.close();
    }

}
