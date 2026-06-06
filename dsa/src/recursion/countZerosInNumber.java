package recursion;

public class countZerosInNumber {
    static void main() {
        int number=30204;
        System.out.println(count(number));
    }

    private static int count(int number) {
        //return helper(number);
        return helper2(number,0);

    }

    private static int helper2(int number, int c) {
        if (number==0)
            return c;
        if (number%10==0)
            c++;
        return helper2(number/10,c);
    }

    private static int helper(int number) {
        if (number==0)
            return 0;
        if (number%10==0)
            return helper(number/10)+1;
        return helper(number/10);
    }

}
