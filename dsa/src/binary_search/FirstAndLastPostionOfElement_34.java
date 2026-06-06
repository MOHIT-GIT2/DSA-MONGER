package binary_search;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */

import java.util.Arrays;

public class FirstAndLastPostionOfElement_34 {
    static void main() {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int startIndex=index(arr,target,true);
        if (startIndex==-1){
            System.out.println("-1,-1");
            return;
        }
        int endIndex=index(arr,target,false);
        int[] num={startIndex,endIndex};
        System.out.println(Arrays.toString(num));

    }

    private static int index(int[] arr, int target, boolean b) {
        int s=0,e=arr.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                ans=mid;
                if (b){
                    e=mid-1;
                }
                else s=mid+1;
            }
            if (target>arr[mid]){
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}
