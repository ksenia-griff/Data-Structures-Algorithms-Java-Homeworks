import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;
import java.util.NoSuchElementException;

// An immutable data type to systematically iterate over length-n binary
// strings.
public class BinaryStrings implements Iterable<String> {
    
    private final int n; // need all binary strings of length n

    // Construct an iterable BinaryStrings object given the length of binary 
    // strings needed.
    
    public BinaryStrings(int n) {
        
        // number of bits/places
        this.n = n;

        
        }
    

    // A BinaryStringsIterator object.
    
    public Iterator<String> iterator() {
        //instantiate an iterator
       
        return new BinaryStringsIterator();     
    }
    
    // Binary strings iterator.
    
    private class BinaryStringsIterator 
    
                 implements Iterator<String> {
        
        private int count = 0; // number of binary strings returned
        
        private int p = 0;     // current number

        private int binaryOptions = (int) Math.pow(2, n);
 
        // Are there anymore length-n binary strings left to be
        //iterated?           
        public boolean hasNext() { 
            
                  return (count != binaryOptions); 
                           
        }

        // The next length-n binary string.
        public String next() {
            
            if (!hasNext()) { 
                throw new  NoSuchElementException();
            }
            
            
            //constructing each number: 1 of binaryOptions size.
            //String [] s = new String [binaryOptions];
            String s = " "; 
            
            if (p < binaryOptions) {                   
            
                //making each individual number
                s = binary(p);
                count++;
                p++;
  
            }
            
    
            return s;
        }
         
        
        
        // Remove is not supported.
        public void remove() {
            
            // nothing to do
            
        }
        
        //representation of each number
        // The n-bit representation of x.
        private String binary(int x) {
            //where x = number to represent
            //s - string of 1's only
            //Ex: 2^3 = 8; 8 is s;
            //3 - is the new n for BinaryString object with 1's only.
            String s = Integer.toBinaryString(x);

         
            int padding = n - s.length();
            //001 - 2^1
            //010 - 2^2
            //011 - 2^2 + 1
            //100 - 2^3 
            //101 - 2^3+1
            //110 - 2^3+2
            
            for (int i = 1; i <= padding; i++) {   
                s = "0" + s;
            }
            return s;
        }
    
    }
    // Test client. [DO NOt EDIT]
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        
        for (String s : new BinaryStrings(n)) {
             
            StdOut.println(s);
        }
    }
}
