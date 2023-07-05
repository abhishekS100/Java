

import java.util.*;

class Test{

  static int findMax(int[] arr){
    
    int n = arr.length;
    int ans = Integer.MIN_VALUE;
    
    for(int i = 0; i < n; i++){
        if(arr[i] > ans){
          ans = arr[i];  
        }
    }
    return ans;
  }
  
  static int secondLargest(int[] arr){
     
     int n = arr.length;
     int max = findMax(arr);
     
     for(int i = 0;i < n; i++){
         if(arr[i] == max){
             arr[i] = Integer.MIN_VALUE;
         }
     }
    
     int secondMax = findMax(arr);
     return secondMax;
  }
  
  public static void main(String[] args){
    
     int[] arr = {5,8,2,9,3,4,1};
    
     System.out.println(secondLargest(arr));
    
  }
}
