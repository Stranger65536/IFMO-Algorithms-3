/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Str@nger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("input.txt"));
        int a = in.nextByte();
        int b = in.nextByte();
        PrintWriter out = new PrintWriter("output.txt");
        if (a - b < b) {
            out.print("Valya"); out.close();
        }
        else if (a - b > b) {
            out.print("Inna"); out.close();
        }
        else {
            out.print("None"); out.close();
        }
    }
}
