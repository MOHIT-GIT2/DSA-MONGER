package binary_search;

public class rotatedSearchwithDuplicates {
    static void main() {
        int[] arr={1,2,2};
        System.out.println(findPivot(arr));
    }

    private static int findPivot(int[] arr) {
        int s=0,e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;

            if (mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>s && arr[mid-1]>arr[mid]){
                return mid-1;
            }

            if (arr[s]==arr[mid] && arr[mid]==arr[e]){
                //skip
                if (s<e && arr[s]>arr[s+1]){
                    return s;
                }
                s++;
                if (s<e && arr[e]<arr[e-1]){
                    return e-1;
                }
                e--;
            } else if (arr[s]<arr[mid] || (arr[s]==arr[mid] && arr[mid]>arr[e])) {
                s=mid+1;
            }
            else e=mid-1;
        }
        return -1;
    }
}
