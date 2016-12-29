package Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Created by ololo.
 * User: Str@nger
 * Date: 30.03.12
 * Time: 21:13
 */

public class Main {
    static class Node {
        public Vector<Node> childs;
        public int color;
        public Node prev;
        private int id;
        private int length;

        public Node(int id,int max) {
            this.id=id;
            this.childs=new Vector<Node>();
            this.length=0;
            this.color=0;
        }

        public void contain(Node v) {
            length++;
            this.childs.add(v);
        }
    }

    static StringTokenizer st;
    static BufferedReader in;
    static BufferedWriter out;
    static Node graph[];
    static Vector<Node> cycle;
    static int[] color;
    static int[] prev;
    static Node cycle_start=null;
    static Node cycle_end=null;

    static String nextToken() {
        while (st==null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(in.readLine());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(nextToken());
    }

    static boolean dfs(Node v) {
        v.color=1;
        for (int i=0;i<v.length;++i) {
            if (v.childs.get(i).color==0) {
                v.childs.get(i).prev=v;
                if (dfs(v.childs.get(i))) return true;
            } else
            if (v.childs.get(i).color==1) {
                v.childs.get(i).prev=v;
                cycle_start=v;
                cycle_end=v.childs.get(i);
                return true;
            }
        }
        v.color=2;
        return false;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader("cycle.in"));
        out = new BufferedWriter(new FileWriter("cycle.out"));
        int n = nextInt();
        int m = nextInt();
        graph = new Node[n];
        cycle = new Vector<Node>();
        for (int i = 0; i < n; i++) {
            graph[i]=new Node(i,n);
        }
        for (int i=0;i<m;i++) {
            int v1=nextInt()-1;
            int v2=nextInt()-1;
            graph[v1].contain(graph[v2]);
        }
        for (int i = 0; i < graph.length; ++i) {
            if(dfs(graph[i])) break;
        }
        if (cycle_start!=null)  {
            out.write("YES\n");
            Node v = cycle_start;
            cycle.add(v);
            while (v != cycle_end) {
                v = v.prev;
                cycle.add(v);
            }
            for (int i = cycle.size() - 1; i >= 0; --i) {
                out.write((cycle.get(i).id+1)+" ");
            }
        } else {
            out.write("NO");
        }
        in.close();
        out.close();
    }
}
