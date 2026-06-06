package cyclicSort;
/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */

public class firstMisingPositive_41 {
    static void main() {
        int[] arr={7,8,9,11,12};
        System.out.println(missing(arr));
    }
    private static int missing(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0 && arr[i]-1!=i  && arr[i]<= arr.length && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1!=i)
                return i+1;
        }
        return arr[arr.length-1]+1;
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
