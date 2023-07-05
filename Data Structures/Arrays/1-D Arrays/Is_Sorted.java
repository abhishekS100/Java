
import java.util.*;

class Test{

  static boolean isSorted(int[] arr){
    
    int n = arr.length;
    boolean check = true;
    
    for(int i = 1; i < n; i++){
       
       if(arr[i] < arr[i-1]){
          check = false;
          break;
        }
    }
    return check;
   }
  
  public static void main(String[] args){
    
     int[] arr = {1,2,3,5,6,7,8};
    
     System.out.println(isSorted(arr));
    
  }
}
