

class Test{

  static void printArray(int[] arr){
    
    int n = arr.length;
    
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    
    int[] arr = {5,8,2,9,3,4,1};
    
    printArray(arr);
    
  }
}

// Without any function and loop


import java.util.*;

class Test{
  
  public static void main(String[] args){
    
    int[] arr = {5,8,2,9,3,4,1};
    
    System.out.println(Arrays.toString(arr));
    
  }
}

