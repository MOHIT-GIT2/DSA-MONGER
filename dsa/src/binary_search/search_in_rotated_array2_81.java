package binary_search;

public class search_in_rotated_array2_81 {
    static void main() {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr,2));
    }
    public static boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //check for which is sorted
            if(target==nums[mid]){
                return true;
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            //left is sorted
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            //right half is sorted
            else{
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
        }
        return false;

    }
}
