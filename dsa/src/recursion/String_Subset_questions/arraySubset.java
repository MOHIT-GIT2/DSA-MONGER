package recursion.String_Subset_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraySubset {
    static void main() {
        int[] arr={1,2,2};
        List<List<Integer>> list=subsetIterationDuplicate(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> subset(int[] arr, int i,ArrayList<Integer> list) {
        if (i== arr.length){
            //exit
            List<List<Integer>> list1=new ArrayList<>();
            list1.add(new ArrayList<>(list));
            return list1;
        }
        list.add(arr[i]);
        List<List<Integer>> left=subset(arr, i+1, list);

        list.removeLast();//p.remove(p.size() - 1); where p is list
        List<List<Integer>> right=subset(arr, i+1, list);

        left.addAll(right);
        return left;
    }
    static List<List<Integer>> subsetIteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // Step 1: Start with an empty list inside the outer list
        outer.add(new ArrayList<>());

        // Step 2: Loop through every number in the input array
        for (int num : arr) {
            // Find out how many subsets we have created so far
            int n = outer.size();

            // Step 3: Loop through existing subsets and create new ones
            for (int i = 0; i < n; i++) {
                // Take a copy of the existing subset at index i
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // Add the current number to it
                internal.add(num);

                // Push it back into our main list
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetIterationDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for (int i=0;i<arr.length;i++) {
            start=0;
            if (i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
