package recursion;

public class reverseNumber {
    static void main() {
        int number=12345;
        System.out.println(reverse(number));
    }

    private static int reverse(int number) {
        String n=""+number;
        int size=n.length()-1;
        return helper(number,size);
    }

    private static int helper(int number, int size) {
        if (size==0)
            return number;
        return (int) ((number%10)*Math.pow(10,size)+helper(number/10,--size));
    }
}
