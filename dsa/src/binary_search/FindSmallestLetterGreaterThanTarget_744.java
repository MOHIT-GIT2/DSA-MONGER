package binary_search;

/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 */

public class FindSmallestLetterGreaterThanTarget_744 {
    static void main() {
        String[] arr={"c","f","j"};
        char target='a';
        char ans=celing(arr,target);
        System.out.println(ans);
    }
    private static char celing(String[] arr,char target) {
        int s=0,e= arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid].charAt(0)==target)
                return target;
            if (arr[mid].charAt(0)<target){
                s=mid+1;
            }
            else e=mid-1;

        }
        return arr[s].charAt(0);
    }
}
