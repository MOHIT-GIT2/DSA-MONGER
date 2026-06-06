package recursion;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    static void main() {
        int[] arr={1,2,3,7,7,4,5,6};
        int target=7;
        //System.out.println(search(arr,target));
        System.out.println(searchAll(arr,target));
    }

    private static ArrayList<Integer> searchAll(int[] arr, int target) {
        return helper2(arr,target,0);
    }

    private static int search(int[] arr,int t) {
        return helper(arr,t,0);
    }

    private static int helper(int[] arr,int target, int i) {
        if (i>= arr.length)
            return -1;
        else if (arr[i]==target) {
            return i;
        }
        else return helper(arr, target, i+1);
    }

    private static ArrayList<Integer> helper2(int[] arr,int target, int i) {
        ArrayList<Integer> list=new ArrayList<>();
        if (i>= arr.length)
            return list;
        else if (arr[i]==target) {
            list.add(i);
        }
        ArrayList<Integer> list2=helper2(arr,target,i+1);
        list.addAll(list2);
        return list;
    }
}
