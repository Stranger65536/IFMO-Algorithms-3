
import java.io.*;
import java.util.*;

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
    
    public static class okr {
        int x;
        int y;
        int r;
        double s;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("circles.in"));
        StringTokenizer __ = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(__.nextToken());
        double sum = 0;
        ArrayList <okr> arr = new ArrayList(100000);
        ArrayList <okr> del = new ArrayList(100000);
        for (int i = 0; i < n; i++) {
            StringTokenizer _ = new StringTokenizer(in.readLine());
            okr temp = new okr();
            temp.x = Integer.parseInt(_.nextToken());
            temp.y = Integer.parseInt(_.nextToken());
            temp.r = Integer.parseInt(_.nextToken());
            temp.s = Math.PI * temp.r * temp.r;
            arr.add(temp);
        }
        for (int i = 0; i < n; i++) {
            okr origin = arr.get(i);
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    okr view = arr.get(j);
                    double temp = Math.hypot(Math.abs(origin.x - view.x), Math.abs(origin.y - view.y));
                    if (temp + view.r <= origin.r) del.add(view);
                }
            }
        }
        arr.removeAll(del);
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).s;
        }
        PrintWriter out = new PrintWriter("circles.out");
        out.println(sum);
        out.close();
    }
}
