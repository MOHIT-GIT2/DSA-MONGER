package recursion;

public class arraySortedOrNot {
    static void main() {
        int[] arr={1,2,3,7,4,5,6};
        System.out.println(sorted(arr));
    }

    private static boolean sorted(int[] arr) {
        return helper2(arr,0);
    }

    private static boolean helper(int[] arr, int c) {
        if (c>= arr.length-1){
            return true;
        } else if (arr[c] < arr[c + 1]) {
            return helper(arr,c+1);
        }
        else return false;
    }
    private static boolean helper2(int[] arr, int c) {
        if (c>= arr.length-1){
            return true;
        }
        return (arr[c] < arr[c + 1]) && helper2(arr,c+1);
    }

}
