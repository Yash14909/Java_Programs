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
    

