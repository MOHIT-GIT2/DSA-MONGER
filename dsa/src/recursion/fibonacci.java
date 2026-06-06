package recursion;

public class fibonacci {
    static void main() {
        int number=4;
        int ans=fibo(number);
        System.out.println(ans);
    }

    private static int fibo(int number) {
        if (number==1)
            return 1;
        if (number==0)
            return 0;
        return fibo(number-1)+fibo(number-2);
    }
}
