

// Some methods of Arrays:

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

    int[] arr = {5,7,3,9,2,1};
    int[] arr2 = {3,7,4,1,2,5};

    int key = 5;
  
    arr2 = arr;                                                 // Shallow Copy
    
    // Array Methods:
      
    arr.length();
    arr.clone();                                                // Deep Copy
      
    // Arrays class methods:
      
    Arrays.sort(arr);

    Arrays.parallelSort(arr);
      
    Arrays.copyOF(arr,length);                                   // Deep Copy

    Aarrays.copyOfRange(originalArray, fromIndex, endIndex);     // Deep Copy
      
    Arrays.compare(arr, arr2);
      
    Arrays.equals(arr, arr2);
      
    Arrays.toString(arr);
      
    Arrays.fill(arr, key);
      
    Arrays.binarySearch(arr, 5);
      
    Arrays.hashCode(arr);
      
    Arrays.mismatch(arr,arr2) 

    Arrays.spliterator(arr);

    Arrays.stream(arr); 

      
    }
}
