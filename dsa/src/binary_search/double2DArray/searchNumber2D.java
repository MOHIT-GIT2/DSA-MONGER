package binary_search.double2DArray;

import java.util.Arrays;

/*
you are give a 2d array in which numbers in both row and column are increasing find target in it

 */
public class searchNumber2D {
    static void main() {
        int[][] arr={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
        int target=80;
        int[] ans=find(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] find(int[][] arr, int target) {

        int row=0;
        int col=arr[0].length-1;

        while (row<=arr.length && col>=0){

            if (target==arr[row][col]){
                return new int[]{row,col};
            } else if (target > arr[row][col]) {
                row++;
            }
            else col--;
        }
        return new int[]{-1,-1};
    }
}
