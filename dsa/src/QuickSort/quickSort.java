package QuickSort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        // Initial call: low is 0, high is the last index
        quick(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] nums, int low, int high) {
        // Base condition: If the boundary shrinks to 1 element or becomes invalid, stop
        if (low >= high) {
            return;
        }

        // Maintain low and high as fixed anchors for recursion boundaries
        // Use start and end as the active workers to move and swap
        int start = low;
        int end = high;

        // Calculate the middle index and pick the middle element as pivot
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        // This loop puts the pivot at its correct index
        while (start <= end) {

            // Move start forward if elements on the left are already smaller than pivot
            while (nums[start] < pivot) {
                start++;
            }

            // Move end backward if elements on the right are already greater than pivot
            while (nums[end] > pivot) {
                end--;
            }

            // If start and end haven't completely crossed, swap the violations
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                // Manually push them past each other after swapping
                start++;
                end--;
            }
        }

        // After pointers cross, low and end bound the left half
        quick(nums, low, end);

        // After pointers cross, start and high bound the right half
        quick(nums, start, high);
    }
}
