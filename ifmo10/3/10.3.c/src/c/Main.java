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
import java.util.Collections;
import java.util.StringTokenizer;

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
        BufferedReader in = new BufferedReader(new FileReader("sort.in"));
        PrintWriter out = new PrintWriter("sort.out");
        String _n = in.readLine();
        int n = Integer.parseInt(_n);
        StringTokenizer tmp = new StringTokenizer(in.readLine());
        ArrayList _0 = new ArrayList();
        ArrayList _1 = new ArrayList();
        ArrayList _2 = new ArrayList();
        ArrayList _3 = new ArrayList();
        ArrayList _4 = new ArrayList();
        ArrayList _5 = new ArrayList();
        ArrayList _6 = new ArrayList();
        ArrayList _7 = new ArrayList();
        ArrayList _8 = new ArrayList();
        ArrayList _9 = new ArrayList();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(tmp.nextToken());
            int ok = temp % 10;
            if (ok == 0) _0.add(temp);
            if (ok == 1) _1.add(temp);
            if (ok == 2) _2.add(temp);
            if (ok == 3) _3.add(temp);
            if (ok == 4) _4.add(temp);
            if (ok == 5) _5.add(temp);
            if (ok == 6) _6.add(temp);
            if (ok == 7) _7.add(temp);
            if (ok == 8) _8.add(temp);
            if (ok == 9) _9.add(temp);
        }
        if (_0.size() > 1) Collections.sort(_0);
        if (_1.size() > 1) Collections.sort(_1);
        if (_2.size() > 1) Collections.sort(_2);
        if (_3.size() > 1) Collections.sort(_3);
        if (_4.size() > 1) Collections.sort(_4);
        if (_5.size() > 1) Collections.sort(_5);
        if (_6.size() > 1) Collections.sort(_6);
        if (_7.size() > 1) Collections.sort(_7);
        if (_8.size() > 1) Collections.sort(_8);
        if (_9.size() > 1) Collections.sort(_9);
        
        if (_0.size() > 0) for (int i = 0; i < _0.size(); i++) out.print(_0.get(i) + " ");
        if (_1.size() > 0) for (int i = 0; i < _1.size(); i++) out.print(_1.get(i) + " ");
        if (_2.size() > 0) for (int i = 0; i < _2.size(); i++) out.print(_2.get(i) + " ");
        if (_3.size() > 0) for (int i = 0; i < _3.size(); i++) out.print(_3.get(i) + " ");
        if (_4.size() > 0) for (int i = 0; i < _4.size(); i++) out.print(_4.get(i) + " ");
        if (_5.size() > 0) for (int i = 0; i < _5.size(); i++) out.print(_5.get(i) + " ");
        if (_6.size() > 0) for (int i = 0; i < _6.size(); i++) out.print(_6.get(i) + " ");
        if (_7.size() > 0) for (int i = 0; i < _7.size(); i++) out.print(_7.get(i) + " ");
        if (_8.size() > 0) for (int i = 0; i < _8.size(); i++) out.print(_8.get(i) + " ");
        if (_9.size() > 0) for (int i = 0; i < _9.size(); i++) out.print(_9.get(i) + " ");
        out.close();
    }

}
