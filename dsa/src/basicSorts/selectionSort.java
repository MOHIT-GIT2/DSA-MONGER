package basicSorts;

import java.util.Arrays;

public class selectionSort {
    static void main() {
        int[] arr={5,3,1,4,2,-1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex=findMax(arr,arr.length-i-1);
            swap(arr,maxIndex,arr.length-i-1);
        }
    }

    private static int findMax(int[] arr, int end) {
        int max=0;
        for (int i = 0; i <= end; i++) {
            max=arr[max]>arr[i]?max:i;
        }
        return max;
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
