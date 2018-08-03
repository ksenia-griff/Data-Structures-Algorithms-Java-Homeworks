// ThreeDice.java: Writes the sum of three random integers between 1 and 6, such
// as you might get when rolling three dice.
import  edu.princeton.cs.algs4.StdOut;
import  edu.princeton.cs.algs4.StdRandom;
public class ThreeDice {
    public static void main(String[] args) {
     int NUMROLLS = 3;
     int sum = 0;
     int dieresult = 0;
     for (int i = 0; i < NUMROLLS; i++) {
         dieresult = StdRandom.uniform(1, 7);
         sum += dieresult;
         //StdOut.println(dieresult);
        }
        StdOut.println(sum);
    }
}
