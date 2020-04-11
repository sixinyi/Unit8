/**
 * Bruce
 * This class creates a grid object and checks that the sum of each row, column and diagonal is the same
 * 2020/4/10
 */
public class MagicSquare {
    private int[][] grid;
    //start
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
    //Sum of all integers in column
    public int colSum(int col) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            sum += grid[i][col];
        }
        return sum;
    }
    //Sum of integers in diagonal
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
    //Sum of integers in diagonal
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
    //check the magic square
    public boolean isMagicSquare() {
        boolean ms = true;
        int row = 0;
        int col = 0;
        for(int i = 0; i < grid.length; i++){
            row += rowSum(i);
            col += colSum(i);
        }
        row /= grid.length;
        col /= grid.length;
        return row == col && col == downDiagSum() && downDiagSum() == upDiagSum();
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
