public class twoDarr {
    public static void main(String[] args) {
        {
            int[][] myArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
            System.out.println("The 2D array in Matrix Form is:");
            displayMatrix(myArray);
        }
        public static void displayMatrix(int[][] arr)
         {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
            }
        }
}

/*
| **Line / Part**                                          | **Explanation**                                                                                                 |
| -------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `public class twoDarr {`                                 | Declares a public class named `twoDarr`. Every Java program must have at least one class.                       |
| `public static void main(String[] args) {`               | The main method — the entry point of the program where execution begins.                                        |
| `int[][] myArray = { {1,2,3}, {4,5,6}, {7,8,9} };`       | Declares and initializes a **2D integer array** (matrix) with 3 rows and 3 columns.                             |
| `System.out.println("The 2D array in Matrix Form is:");` | Prints a message to indicate that the matrix will be displayed.                                                 |
| `displayMatrix(myArray);`                                | Calls the method `displayMatrix()` and passes the 2D array `myArray` as an argument.                            |
| `public static void displayMatrix(int[][] arr)`          | Declares a **static method** named `displayMatrix` that takes a 2D integer array as a parameter.                |
| `for(int i=0;i<arr.length;i++)`                          | Outer loop — iterates through each **row** of the array.                                                        |
| `for(int j=0;j<arr[i].length;j++)`                       | Inner loop — iterates through each **column** of the current row.                                               |
| `System.out.print(arr[i][j] + " ");`                     | Prints each element in the same row separated by a space (should use `print`, not `println` for matrix format). |
| `System.out.println();`                                  | Moves to the next line after printing one row of the matrix.                                                    |
| `}`                                                      | Closes the loops and method definitions.                                                                        |
| `}`                                                      | Closes the main class.                                                                                          |
*/
    


