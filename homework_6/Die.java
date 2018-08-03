import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

// A data type representing a six-sided die.
public class Die implements Comparable<Die> {
    private int value; // face value

    // Roll the die.
    public void roll() {
     value = StdRandom.uniform(1, 7); 
    }

    // Face value of the die.
    public int value() {
        return value;
    }

    // Does the die have the same face value as that?
    public boolean equals(Die that) {
        if (this.value == that.value) {
        return true;
        }
        return false;
    }

    // A negative integer, zero, or positive integer depending on whether this
    // die's value is less than, equal to, or greater than the that die's value.
    public int compareTo(Die that) {
        if (this.value == that.value) {
            return 0;
        }
        else if (this.value > that.value) {
                return this.value - that.value;
        }
        else  {
               return that.value - this.value;
        }
    }

    // A string representation of the die giving the current face value.
    public String toString() {
        String result;
        result = "";
        int rows = 3;
        
          for (int i = 1; i <= rows; i++) {  
                if ((i == 2) || ((value == 1) && (i == 1))) {
                    result += "\n";
                }
                
                if ((i == 2) && (value == 2 || value == 4 || value == 6)) {
                  result += "     \n";
                }
                
                if ((value == 2 || value == 3) && (i == 1)) {
                    result += "*";
                }
                
                if ((value == 2 || value == 3) && (i == 3)) {
                    result += "    *";
                }
                
                if ((value == 4 || value == 5) && ((i == 1) || (i == 3))) {
                    result += "*   *";
                }
                
                if (value == 6 && ((i == 1) || (i == 3))) {
                    result += "* * *"; 
                }
                if ((value == 1 || value == 3 || value == 5) && (i == 2)) {
                    result += "  *  \n";
                
                }
            }
    return result;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        Die a = new Die();
        a.roll();
        while (a.value() != x) {
            a.roll();
        }
        Die b = new Die();        
        b.roll();
        while (b.value() != y) {
            b.roll();
        }
        Die c = new Die();        
        c.roll();
        while (c.value() != z) {
            c.roll();
        }
        StdOut.println(a);
        StdOut.println(a.equals(b));
        StdOut.println(b.equals(c));        
        StdOut.println(a.compareTo(b));
        StdOut.println(b.compareTo(c));        
    }
}
