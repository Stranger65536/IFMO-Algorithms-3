/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package a;

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
        BufferedReader in = new BufferedReader(new FileReader("brackets.in"));
        PrintWriter out = new PrintWriter("brackets.out");
        ArrayList <Character>  stack = new  ArrayList <Character>();
        while (in.ready()) {
            char temp = (char) in.read();
            if (temp == '(') {stack.add(temp); continue; }
            if (temp == '[') {stack.add(temp); continue; }
            if (temp == '{') {stack.add(temp); continue; }
            //------------------------------------------------------------------
            if ((temp == ')') || (temp == '}') || (temp == ']')) {
                if (!stack.isEmpty()) {
                    if ((temp == ')')&&(stack.get(stack.size() - 1) != '(')) {
                        out.print("NO"); out.close(); System.exit(0);
                    }
                    if ((temp == ']')&&(stack.get(stack.size() - 1) != '[')) {
                        out.print("NO"); out.close(); System.exit(0);
                    }
                    if ((temp == '}')&&(stack.get(stack.size() - 1) != '{')) {
                        out.print("NO"); out.close(); System.exit(0);
                    }
                    stack.remove(stack.size() - 1);
                } else { out.print("NO"); out.close(); System.exit(0); }
            }
        }
        if ((stack.isEmpty())) out.print("YES"); else out.print("NO"); out.close();
    }

}
