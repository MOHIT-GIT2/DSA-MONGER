package cyclicSort;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
 */

import java.util.ArrayList;
import java.util.List;

public class allNumberDisappear_448 {
    static void main() {
        int[] arr={1,1};
        List<Integer> list=missingNumber(arr);
        System.out.println(list);
    }

    private static List<Integer> missingNumber(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-1!=i && arr[i]!=arr[arr[i]-1]){
                swap(arr,arr[i]-1,i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1!=i)
                list.add(i+1);
        }
        return list;
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
