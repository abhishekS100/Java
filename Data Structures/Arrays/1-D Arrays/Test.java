// 1-D Arrays:

class Test {
    
  public static void main(String[] args) {
        
        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 3;
        arr[4] = 1;
         
        for(int i = 0; i < arr.length; i++){
              System.out.print(arr[i] + " ");
        }
 
    }
}

class Test1 {
   
  public static void main(String[] args) {
        
        int[] arr = {4,8,6,2,1};
       
        for(int i = 0; i < arr.length; i++){
              System.out.print(arr[i] + " ");
        }
 
    }
}


class Test2 {
   
  public static void main(String[] args) {
        
        int[] arr = {4,8,6,2,1};
       
        for(int num : arr){
              System.out.print(num + " ");
        }
 
    }
}

// Taking Input from User:

class ArrayInput {
  
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();

      int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

