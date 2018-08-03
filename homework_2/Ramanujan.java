// Ramanujan.java: Prints the integers <= N (command-line argument) that
// can be expressed as the sum of two distinct cubes.

import edu.princeton.cs.algs4.StdOut;

public class Ramanujan {

    private static void sumOfCubes(int N) {
    //int [] numbers = new int [N];
    int a = 1;
    int b = 1; 
    int c = 1;
    int d = 1;
    //for each number between 0 and N including N.  
     for (a = 1; a * a * a <= N; a++) {
      for (b = a + 1; a < b  && b * b * b <= N - a * a * a; b++) {
        for (c = a + 1; a < c  && c * c * c <= N; c++) {
          for (d = c + 1; c < d && d * d * d <= N - c * c * c; d++) {
             if (a * a * a + b * b * b == c * c * c + d * d * d)
                StdOut.println(a * a * a + b * b * b +" = "
                               + a + "^3 + " + b +"^3 = " + c + "^3 + " 
                               + d + "^3");             
        }             
       }
      }
     }  
 }    
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        sumOfCubes(N);
    }
}
