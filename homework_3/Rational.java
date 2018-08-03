import edu.princeton.cs.algs4.StdOut;

// A data type representing a rational number.
public class Rational {
    private long x; // numerator
    private long y; // denominator
    private long gcd;
   
    // Construct a rational number whose numerator is x and denominator is 1.
    public Rational(long x) {
        this.x = x;
        this.y = 1;
        this.gcd = gcd(this.x, this.y); 
        this.x = this.x/this.gcd;
        this.y = this.y/this.gcd;
    }

    // Construct a rational number given its numerator and denominator.
    public Rational(long x, long y) {
        this.x = x;
        this.y = y;
        this.gcd = gcd(this.x, this.y); 
        this.x = this.x/this.gcd;
        this.y = this.y/this.gcd;
    }

    // The sum of this and that rational number.
    public Rational add(Rational that) {
        
        long gcdNum = gcd(this.x, that.x);       
        long gcdDenom = gcd(this.y, that.y); 
        
        return new Rational((this.x/gcdNum * that.y/gcdDenom 
          + that.x / gcdNum * this.y / gcdDenom), this.lcm(this.y, that.y));
        
    }

    // The product of this and that rational number.
    public Rational multiply(Rational that) {
        
           return new Rational(this.x * that.x, this.y * that.y);
    }

    // A string representation of the rational number.
    public String toString() {
        long a = x, b = y;
        if (a == 0 || b == 1) {
            return a + "";
        }
        if (b < 0) {
            a *= -1;
            b *= -1;
        }
        return a + "/" + b;
    }

    // gcd(p, q), computed using Euclid's algorithm.
    private static long gcd(long p, long q) {
        return q == 0 ? p : gcd(q, p % q);
    }
    // least common multiplev
    private static long lcm(long p, long q) {
        if (p < 0) p = -p;
        if (q < 0) q = -q;
        return p * (q / gcd(p, q));
    }
    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Rational total = new Rational(0);
        Rational term = new Rational(1);
        for (int i = 1; i <= n; i++) {
            total = total.add(term);
            term = term.multiply(new Rational(1, 2));
        }
        StdOut.println(total);
    }
}
