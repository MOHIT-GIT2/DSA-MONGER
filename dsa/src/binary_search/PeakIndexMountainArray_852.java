package binary_search;

/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
Example 1:
Input: arr = [0,1,0]
Output: 1
Example 2:
Input: arr = [0,2,1,0]
Output: 1
 */
public class PeakIndexMountainArray_852 {
    static void main() {
        int[] arr={0,1,3,2};
        int ans=peak(arr);
        System.out.println(ans+" index");
    }

    private static int peak(int[] arr) {
        int start=0,end=arr.length-1;
        int ans=0;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid+1]<arr[mid])
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }

}
