package binary_search;

/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.
Example 1:
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
 */

public class splitArrayLargestSum_410 {
    static void main() {
        int[] arr={7,2,5,10,8};
        int k=2;
        System.out.println(split(arr,k));
    }

    private static int split(int[] arr, int k) {

        int totalSum=0;
        int max=0;
        for (int n:arr){
            totalSum+=n;
            max=Math.max(max,n);
        }
        int start=max,end=totalSum;
        while (start<end){
            int mid=(start+end)/2;
            int tempAdd=0,part=1;
            for (int j : arr) {
                if (tempAdd + j > mid) {
                    part++;
                    tempAdd = 0;
                }
                tempAdd += j;
            }
            if (part<=k){
                end=mid;
            }
            else start=mid+1;
        }
        return start;
    }
}
