package binary_search;

public class rotatedArray_33 {
    static void main() {
        int[] arr={1};
        int target=3;
        System.out.println(search(arr,target));

    }

    //a more refined way of doing it
    public static int search2(int[] nums, int target)
    {
        int start=0,end=nums.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            //left part sorted
            else if(nums[start]<=nums[mid])
            {
                if(target>=nums[start]&&target<=nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            //right part sorted
            else if(nums[end]>=nums[mid])
            {
                if(target>=nums[mid]&&target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }

        }
        return -1;
    }

    public static int search(int[] nums, int target) {

        int pivot= pivot(nums);
        if (pivot==-1){
            return bs(0, nums.length-1,nums,target);
        }

        if(target>=nums[0] && target<=nums[pivot]){
            return bs(0,pivot,nums,target);
        }
        else
            return bs(pivot+1,nums.length-1,nums,target);
    }

    static int pivot(int[] nums) {

        int start=0,end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if (mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }

            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }

            if(nums[mid]>nums[start]){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }

    static int bs(int start,int end,int[] nums,int target) {

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
}
