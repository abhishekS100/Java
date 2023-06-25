
// 2-D Arrays:

class Test {
   
  public static void main(String[] args) {
        
        int[][] arr = new int[3][4];

        arr[0][0] = 5;
        arr[0][1] = 1;
        arr[0][2] = 8;
        arr[0][3] = 3;
        arr[1][0] = 9;
        arr[1][1] = 7;
        arr[1][2] = 4;
        arr[1][3] = 2;
        arr[2][0] = 3;
        arr[2][1] = 1;
        arr[2][2] = 3;
        arr[2][3] = 9;
         
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();                         // Move to the next line after printing each row
        }
    }
}


class Test1 {
   
  public static void main(String[] args) {
        
      int[][] arr = {{5,1,8,3},{6,7,2,3},{8,2,4,5}};
         
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();                         // Move to the next line after printing each row
        }
    }
}

// Taking Input from User:


class ArrayInput {
  
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();

      System.out.print("Enter the number of columns: ");
      int columns = sc.nextInt();

      int[][] arr = new int[rows][columns];

      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

      System.out.println("Array elements:");
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

      sc.close();
    }
}









