/**
 * Bruce
 * This class creates a grid object and checks that the sum of each row, column and diagonal is the same
 * 2020/4/10
 */
public class MagicSquare {
    private int[][] grid;
    /**
     * start the object
     * @param g 2d square array object
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }
    //Find the sum of all integers in grid row
    public int rowSum(int row) {
        int sum = 0;
        for(int i = 0; i < grid[row].length; i++){
            sum += grid[row][i];
        }
        return sum;
    }
    /**
     * Sum of all integers in column
     * @param row and find value of
     * @return sum of the row given
     */
    public int colSum(int col) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            sum += grid[i][col];
        }
        return sum;
    }
    /**
     * Sum of integers in diagonal
     * @param col given column
     * @return sum of the given column
     */
    public int upDiagSum() {
        int sum = 0;
        int row = grid.length - 1;
        int col = 0;
        while(col < grid[0].length){
            sum += grid[row][col];
            row--;col++;
        }
        return sum;
    }
    /**
     * Sum of integers in diagonal
     * @return the sum of given diagonal
     */
    public int downDiagSum() {
        int sum = 0;
        int row = 0;
        int col = 0;
        while(row < grid.length){
            sum += grid[row][col];
            row++;col++;
        }
        return sum;
    }
    /**
     * check the magic square
     * @return boolean is a sqaure or not
     */
    public boolean isMagicSquare() {
        boolean ims = true;
        int val=rowSum(0);
        int up=upDiagSum();
        int down=downDiagSum();
        for(int i = 0; i < grid.length; i++){
            int row = rowSum(i);
            int col = colSum(i);
            if(val != row||val != col||val != up||val != down){
                ims = false;
            }
        }
        return ims;
    }

    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}
