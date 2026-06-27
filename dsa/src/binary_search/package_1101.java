package binary_search;

public class package_1101 {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(arr,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int sum=0,max=weights[0];
        for(int x:weights){
            max=Math.max(max,x);
            sum+=x;
        }
        int start=max,end=sum;
        while(start<end){
            int mid=start+(end-start)/2;
            int miniDay=1;
            int add=0;
            for(int x:weights){
                if(add+x<=mid){
                    add+=x;
                }
                else{
                    add=x;
                    miniDay++;
                }
            }
            if(miniDay<=days){
                end=mid;
            }
            else start=mid+1;
        }
        return start;
    }
}
