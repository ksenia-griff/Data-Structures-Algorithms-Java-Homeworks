// Distance.java: reads two position vectors from standard input, and then
// computes and writes the Euclidean distance between the two.

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Distance {
    // Returns the Euclidean distance between the position vectors x and y.
    private static double distance(double[] x, double[] y) {
        //for the length of the x or y array.
        //Both arrays are the same length because 
        //they correspond to x and y coordinates
        //of points.
        int i;
        //sum of differences between Y and X coordinates of 1 point.
        double sumOfDiffs = 0;
        double euclideanDist = 0;
        
        for (i = 0; i < x.length; i++) {
            //accumulate differences for all the points
            sumOfDiffs += (y[i]-x[i]) * (y[i]-x[i]);
            }                        
        euclideanDist = Math.sqrt(sumOfDiffs);
        return euclideanDist;
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        double[] x = StdArrayIO.readDouble1D();
        double[] y = StdArrayIO.readDouble1D();
        StdOut.println(distance(x, y));
    }
}
