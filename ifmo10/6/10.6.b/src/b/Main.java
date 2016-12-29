/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

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

    static ArrayList<Integer> h = new ArrayList<Integer>();

    static void add(int node) {
        h.add(node);
        moveUp(h.size() - 1);
    }

    static void moveUp(int pos) {
        while (pos > 0) {
            int parent = (pos - 1) / 2;
            if (h.get(pos).compareTo(h.get(parent)) <= 0) {
                break;
            }
            Collections.swap(h, pos, parent);
            pos = parent;
        }
    }

    static int removeElement() {
        int removedNode = h.get(0);
        int lastNode = h.remove(h.size() - 1);
        if (!h.isEmpty()) {
            h.set(0, lastNode);
            moveDown(0);
        }
        return removedNode;
    }

    static void moveDown(int pos) {
        while (pos < h.size() / 2) {
            int child = 2 * pos + 1;
            if (child < h.size() - 1 && h.get(child).compareTo(h.get(child + 1)) <= 0) {
                ++child;
            }
            if (h.get(pos).compareTo(h.get(child)) >= 0) {
                break;
            }
            Collections.swap(h, pos, child);
            pos = child;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        BufferedReader in = new BufferedReader(new FileReader("heap.in"));
        int n = Integer.parseInt(in.readLine());
        PrintWriter out = new PrintWriter("heap.out");
        for (int i = 0; i < n; i++){
            StringTokenizer _ = new StringTokenizer(in.readLine());
            String op = _.nextToken();
            if (op.equals("0")) {
                add(Integer.parseInt(_.nextToken()));
            }
            if (op.equals("1")) {
                out.println(removeElement());
            }
        }
        out.close();
    }

}
