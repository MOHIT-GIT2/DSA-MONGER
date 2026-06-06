package recursion.Maze;

public class sudokuSolver {
    static void main() {
        int[][] sudokuBoard = {
                {5, 3, 0,  0, 7, 0,  0, 0, 0},
                {6, 0, 0,  1, 9, 5,  0, 0, 0},
                {0, 9, 8,  0, 0, 0,  0, 6, 0},

                {8, 0, 0,  0, 6, 0,  0, 0, 3},
                {4, 0, 0,  8, 0, 3,  0, 0, 1},
                {7, 0, 0,  0, 2, 0,  0, 0, 6},

                {0, 6, 0,  0, 0, 0,  2, 8, 0},
                {0, 0, 0,  4, 1, 9,  0, 0, 5},
                {0, 0, 0,  0, 8, 0,  0, 7, 9}
        };
        solve(sudokuBoard,0,0);
    }

    private static void solve(int[][] sudokuBoard, int row, int col) {
        if (col==sudokuBoard[0].length){
            solve(sudokuBoard,row+1,0);
            return;
        }
        if (row==sudokuBoard.length){
            display(sudokuBoard);
            return;
        }
        if (sudokuBoard[row][col]==0){
            for (int i = 1; i <=9; i++) {
                if(isSafe(sudokuBoard,row,col,i)){
                    sudokuBoard[row][col]=i;
                    solve(sudokuBoard,row,col+1);
                    sudokuBoard[row][col]=0;
                }
            }
        }
        else solve(sudokuBoard, row, col+1);

    }

    private static boolean isSafe(int[][] sudokuBoard, int row, int col, int number) {
        //left
        for (int iCol = 0; iCol <9; iCol++) {
            if (sudokuBoard[row][iCol]==number)
                return false;

        }
        for (int iRow = 0; iRow <9; iRow++) {
            if (sudokuBoard[iRow][col]==number)
                return false;

        }
        //box check
        int tempRow=row-(row%3);
        int tempCol=col-(col%3);
        for (int i = tempRow; i <tempRow+3; i++) {
            for (int j = tempCol; j <tempCol+3; j++) {
                if (sudokuBoard[i][j]==number)
                    return false;
            }
        }
        return true;
    }
    private static void display(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
