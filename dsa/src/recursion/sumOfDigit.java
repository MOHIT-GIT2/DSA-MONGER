package recursion;

public class sumOfDigit {
    static void main() {
        int number=1342;
        System.out.println(sum(number));
    }

    private static int sum(int number) {
        if (number==0)
            return 0;
        return number%10+sum(number/10);
    }
}
