public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {
        // create a variable to keep track of the total
        int total = 0;

        // check to see if the given row variable is valid.
        // If the row is less than 0 or is greater than
        // the number of rows it is not valid. Return -1 if not valid.
        if (row < 0 || row >= arr.length) {
            return -1;
        }else{

            // if row is valid, create a loop to calculate the sum. hint:
            // elements in a 2D array are found like
            // this arr[row][column]. If you are finding the sum of a row,
            // the [row] number will not change
            // only the [column] part will.
            for (int n = 0; n <= arr[row].length - 1; n++) {
                total += arr[row][n];
            }
    }
        // return the total
        return total;
    }

    public static int columnSum(int[][] arr, int col) {
        // create a variable to keep track of the total
        int total=0;

        // check to see if the given col variable is valid.
        // If col is less than 0 or is greater than
        // the number of columns (the length of one array) it is not valid.
        // Return -1 if not valid.
        if(col<0||col>=arr[0].length){
            return -1;
        }else{

            // if col is valid, create a loop to calculate the sum. hint:
            // elements in a 2D array are found like
            // this arr[row][column]. If you are finding the sum of a col,
            // the [column] number will not change
            // only the [row] part will.
            for (int i = 0; i <= arr.length - 1; i++) {
                total += arr[i][col];
            }
        }
        // return the total
        return total;

    }
    public static int diagonalSum(int[][] arr, int direction) {
        if(direction==1){

            int total=0;

            for(int i=arr.length-1;i>=0;i--){
                total+=arr[i][Math.abs(i-(arr.length-1))];
            }
            return total;
        }

        else if(direction==0){
            int total=0;
            for(int i=0;i<=arr.length-1;i++){
                total+=arr[i][i];
            }
            return total;
        }else{
            return -1;

        }
    }


}