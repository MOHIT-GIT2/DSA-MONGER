package MergeSort;

import java.util.Arrays;

public class mergeSort {
    static void main() {
        int[] arr={5,4,3,2,1};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr,int start,int end) {
        if (end-start==0){
            return;
        }
        int mid=start+(end-start)/2;
        merge(arr, start, mid);
        merge(arr, mid+1, end);
        mergeArray(arr,start,mid,end);
    }

    private static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] mix=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from the left half
        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right half
        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
