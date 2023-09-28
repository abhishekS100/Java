

// Inplace | Unstable Sort
// Time Complexity : O(n^2)

class Test {
    
    static void selectionSort(int[] arr){
        
        int n = arr.length;
        
        for(int  i = 0; i < n-1; i++){
            
            int min_idx = i;
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                   min_idx = j;
                }
            }
            
            if(min_idx != i){
               int temp = arr[i];
               arr[i] = arr[min_idx];
               arr[min_idx] = temp;  
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Selection Sort!");
        
        int arr[] = {5,7,2,9,4,3,1,8}; 
        
        selectionSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
