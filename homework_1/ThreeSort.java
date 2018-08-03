// ThreeSort.java: Takes three integers as command-line arguments and writes
// them in ascending order, separated by spaces.

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.List;


public class ThreeSort {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int [] array1;
        array1 = new int[3];
        array1[0] = a;
        array1[1] = b;
        array1[2] = c;
        
        //initial value of max
        int max = Math.max(a, b);
        
        //initial value of min
        int min = Math.min(a, b);
        //find min
        for (int i = 0; i < array1.length; i++) {
          //comparing each array element to initial max and updating max
          max = Math.max(array1[i], max);
          //comparing each array element to initial min and updating min
          min = Math.min(array1[i], min);
        }
        //System.out.printf(max+" "+min);
        
        //finding 3d element from array that is not min or max
        
        //making array from min and max
        List minmax = new ArrayList();
        minmax.add(min);
        minmax.add(max);
        
        //making array from input: unsorted list
        
        //it is a list of integers
        List list1 = new ArrayList();
        list1.add(array1[0]);
        list1.add(array1[1]);
        list1.add(array1[2]);
        
        //finding difference between lists
        
        list1.removeAll(minmax);
        
      
       
      //Printing all 3 elements in an ascending order
      StdOut.println(min + " " + list1.get(0) + " " + max);         
    }
   }




