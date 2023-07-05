

import java.util.*;

class Test{

  static int largestElement(int[] arr){
    
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    
    for(int i = 0; i < n; i++){
        if(arr[i] > max){
          max = arr[i];  
        }
    }
    return max;
  }
  
  public static void main(String[] args){
    
     int[] arr = {5,8,2,9,3,4,1};
    
    System.out.println(largestElement(arr));
    
  }
}
