// Transpose.java: reads a square matrix of doubles from standard input, and
// the computes and writes its transpose.

import edu.princeton.cs.algs4.StdArrayIO;

public class Transpose {
    // Transposes the square matrix x in place.
    
    private static void transpose(double[][] x) {
           
      for (int i = 0; i < x.length; i++) {
          for (int j = i; j < x[i].length; j++) {
              //number that we need
              double temp = x[i][j];
              //in its place we put the number of reverse i and j-s.
              x[i][j] = x[j][i];
              //here the original number goes into position of reverse i     and j-s
              x[j][i] = temp;
            }
      }
    }
   
    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        double[][] x = StdArrayIO.readDouble2D();
        transpose(x);
        StdArrayIO.print(x);
    }
}
