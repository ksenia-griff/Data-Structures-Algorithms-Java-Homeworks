// GreatCircle.java: Takes four doubles x1, y1, x2, and y2 representing the
// latitude and longitude in degrees of two points on earth as command-line
// arguments and writes the great-circle distance d (in km) between them,
// calculated as d=111arccos(sin(x1)sin(x2)+cos(x1)cos(x2)cos(y1-y2)).
import edu.princeton.cs.algs4.StdOut;
public class GreatCircle {
    public static void main(String[] args) {
      double x1 = Double.parseDouble(args[0]);
      double y1 = Double.parseDouble(args[1]);
      double x2 = Double.parseDouble(args[2]);
      double y2 = Double.parseDouble(args[3]);
      x1 = Math.toRadians(x1);
      x2 = Math.toRadians(x2);
      y1 = Math.toRadians(y1);
      y2 = Math.toRadians(y2);
      double d;
      d = 111 * Math.toDegrees(Math.acos(Math.sin(x1) 
      * Math.sin(x2) + Math.cos(x1)* Math.cos(x2) 
      * Math.cos(y1-y2)));
      StdOut.println(d);
    }
}






