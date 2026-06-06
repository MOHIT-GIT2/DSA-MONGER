package recursion;

public class factorial {
    static void main() {
        int number=5;
        System.out.println(fact(number));
    }

    private static int fact(int number) {
        if (number==1)
            return 1;
        return number*fact(number-1);
    }
}
