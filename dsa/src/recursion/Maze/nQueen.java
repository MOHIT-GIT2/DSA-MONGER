package recursion.Maze;

import java.util.Arrays;

public class nQueen {
    static void main() {
        int n=4;
        String[][] arr=new String[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]="";
            }
        }
        nqueen(arr,0);
    }

    private static void nqueen(String[][] arr, int row) {
        if (row== arr.length){
            display(arr);
            System.out.println();
            return;
        }
        for (int col = 0; col < arr[0].length; col++) {
            boolean left=checkLeft(arr, row, col);
            boolean up=checkUp(arr, row, col);
            boolean right=checkRight(arr, row, col);
            boolean isSafe=left && right && up;
            if (isSafe){
                arr[row][col]="Q";
                nqueen(arr,row+1);
                arr[row][col]="";
            }
        }

    }

    private static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals("Q")){
                    System.out.print("Q ");
                }
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    static boolean checkLeft(String[][] arr, int row, int col){
        while (row>=0 && col>=0){
            if (arr[row][col].equals("Q")){
                return false;
            }
            row--;
            col--;
        }
        return true;
    }
    static boolean checkUp(String[][] arr, int row, int col){
        while (row>=0){
            if (arr[row][col].equals("Q")){
                return false;
            }
            row--;
        }
        return true;
    }
    static boolean checkRight(String[][] arr, int row, int col){
        while (row>=0 && col< arr[0].length){
            if (arr[row][col].equals("Q")){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}
