package cyclicSort;

import java.util.Arrays;

public class cyclicSort {
    static void main() {
        int[] arr={3,1,2,5,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]-1!=i){
                swap(arr,i,arr[i]-1);
            }
        }
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
