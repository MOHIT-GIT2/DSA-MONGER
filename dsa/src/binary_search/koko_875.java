package binary_search;

public class koko_875 {
    static void main() {
        int[] arr={312884470};
        int h=312884469;
        System.out.println(minEatingSpeed(arr,h));

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int big=piles[0];
        for(int i=0;i<=piles.length-1;i++){
            big= Math.max(piles[i], big);
        }
        int s=1,e=big;
        int ans=0;
        while(s<e){
            int mid=s+(e-s)/2;
            ans=0;
            for(int i=0;i<=piles.length-1;i++){
                int round=(int)Math.ceil((double) piles[i] /mid);
                ans=ans+round;
            }
            if(ans<=h){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;

    }
}
