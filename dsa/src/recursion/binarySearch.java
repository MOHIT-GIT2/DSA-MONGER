package recursion;

public class binarySearch {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=3;
        int ans=bs(arr,target);
        System.out.println(ans);
    }

    private static int bs(int[] arr, int target) {
        return helper(arr,target,0,arr.length-1);
    }

    private static int helper(int[] arr, int target, int start, int end) {
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        } else if (arr[mid] > target) {
            return helper(arr, target, start, mid-1);
        }
        else return helper(arr, target, mid+1, end);
    }
}
