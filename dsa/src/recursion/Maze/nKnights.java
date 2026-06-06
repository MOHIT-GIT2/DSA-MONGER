package recursion.Maze;

public class nKnights {
    static void main() {
        int n=4;
        String[][] arr=new String[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]="";
            }
        }
        int numberOfPostion=nKnight(arr,0,0,n);
        System.out.println(numberOfPostion);
    }

    private static int nKnight(String[][] arr, int row, int col, int knights) {
        if (knights==0){
            display(arr);
            System.out.println();
            return 1;
        }
        if (row== arr.length){
            return 0;
        }
        if (col== arr[0].length){
            return nKnight(arr, row+1, 0, knights);
        }
        int count=0;
        if (isSafe(arr, row, col)){
            arr[row][col]="K";
            count+=nKnight(arr, row, col+1, knights-1);
            arr[row][col]="";
        }
        count+=nKnight(arr, row, col+1, knights);
        return count;
    }
    private static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals("K")){
                    System.out.print("K ");
                }
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(String[][] arr,int row,int col){
        if (row - 2 >= 0 && col - 1 >= 0) {
            if (arr[row - 2][col - 1].equals("K")) return false;
        }
        if (row - 2 >= 0 && col + 1 < arr[0].length) {
            if (arr[row - 2][col + 1].equals("K")) return false;
        }
        if (row - 1 >= 0 && col + 2 < arr[0].length) {
            if (arr[row - 1][col + 2].equals("K")) return false;
        }
        if (row - 1 >= 0 && col - 2 >= 0) {
            if (arr[row - 1][col - 2].equals("K")) return false;
        }
        return true;
    }
}
