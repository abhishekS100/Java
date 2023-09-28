
// Inplace | Stable   
// Time Complexiety = O(n^2)

                                                                                      
class BubbleSort {
    
    public static void main(String[] args) {
       
        BubbleSort sort = new BubbleSort();
        int[] arr = {6,1,5,9,3,4,2};
        sort.bubbleSort(arr);
        sort.printArray(arr);
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n-1-i; j++){
               if( arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               } 
            }
        }
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


