package binary_search;

public class celling_number {
    static void main() {
        int[] arr={2,5,9,13,17,21};
        int n=15;
        int ans=celing(arr,n);
        System.out.println(ans+" index");
    }

    private static int celing(int[] arr,int n) {
        int s=0,e= arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==n)
                return mid;
            if (arr[mid]<n){
                s=mid+1;
            }
            else e=mid-1;

        }
        return s;
    }
}
