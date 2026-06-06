package cyclicSort;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */
public class missingNumber_268 {
    static void main() {
        int[] arr={3,0,1};
        int ans=missing(arr);
        System.out.println(ans);
    }

    private static int missing(int[] arr) {
        int size=arr.length;
        for (int i = 0; i < size; i++) {
                while (arr[i]!=i){
                    if (arr[i]==size)break;
                    swap(arr,i,arr[i]);
                }
            }
        for (int i = 0; i < size; i++) {
            if (arr[i]!=i){
                return i;
            }
        }
        return size;
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
