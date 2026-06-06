package basicSorts;

import java.util.Arrays;

public class bubbleSort {
    static void main() {
        int[] arr={5,3,1,4,2,-1,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        boolean b;
        for (int i = 0; i < arr.length; i++) {
            b=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    b=true;
                    swap(arr,j,j+1);
                }
            }
            if (!b){
                return;
            }
        }

    }

    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
