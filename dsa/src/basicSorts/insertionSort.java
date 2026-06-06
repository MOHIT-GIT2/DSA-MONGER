package basicSorts;

import java.util.Arrays;

public class insertionSort {
    static void main() {
        int[] arr={4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            int j=i+1;
            while (j>0){
                boolean b=false;
                if (arr[j-1]>arr[j]){
                    b=true;
                    swap(arr,j-1,j);
                }
                if (!b){
                    break;
                }
                j--;
            }

        }
    }
    /*
    // This single line replaces your while loop condition, the boolean variable, and the break statement!
while (j > 0 && arr[j - 1] > arr[j]) {
    swap(arr, j - 1, j);
    j--;
}
     */
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
