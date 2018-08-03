// PrimeCounter.java: takes an integer N as a command-line argument and writes
// the number of primes <= N.

import edu.princeton.cs.algs4.StdOut;


public class PrimeCounter {
    // Returns true if x is prime, and false otherwise.
    private static boolean isPrime(int p) { 
        
         for (int i = 2; i <= Math.sqrt(p); i++) {    
             if (p % i == 0)
                return false;      
         }    
         return true;           
    }

    // Returns the number of primes <= N.
    private static int primes(int N) {
        //count of primes
         int count = 0;
         for (int j = 2; j <= N; j++) {
             if (isPrime(j))
                count++;     
         }
         return count; 
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(primes(N));
    }
}

   
 
  

       
        
