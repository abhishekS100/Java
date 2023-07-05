
class Test{
    
    static int sum(int[] arr){
        
        int sum = 0;
        
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        
        return sum;
    }
  
    public static void main(String[] args){
      
        int[] arr = {1,5,3,7,8,2};
      
        System.out.println(sum(arr));
    }
}


