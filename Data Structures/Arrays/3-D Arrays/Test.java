
// 3-D Arrays:

class Test3 {
    public static void main(String[] args) {
        
     int[][][] arr = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();                      // Move to the next line after printing each 2D array
            }
            System.out.println();                          // Add an empty line between 2D arrays
        }
    }
}


// Taking input froim the User:

class ArrayInput {
  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of dimensions: ");
        int dimensions = sc.nextInt();

        System.out.print("Enter the size of each dimension: ");
        int[] sizes = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            sizes[i] = sc.nextInt();
        }

        int[][][] arr = new int[sizes[0]][sizes[1]][sizes[2]];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizes[0]; i++) {
            for (int j = 0; j < sizes[1]; j++) {
                for (int k = 0; k < sizes[2]; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Array elements:");
        for (int i = 0; i < sizes[0]; i++) {
            for (int j = 0; j < sizes[1]; j++) {
                for (int k = 0; k < sizes[2]; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

      sc.close();
    }
}

