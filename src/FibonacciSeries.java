import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        long[] memoization = new long[n + 1];
        Arrays.fill(memoization, -1);
        System.out.println("Recursion and memoization " + findFibonacciSeriesElementRecMem(n, memoization));
        System.out.println("Loop for " + findFibonacciSeriesElementFor(10));
        System.out.println("Loop while " + findFibonacciSeriesElementWhile(10));
        System.out.println("Loop do while " + findFibonacciSeriesElementDoWhile(10));
    }

    public static long findFibonacciSeriesElementRecMem(int n, long[] memoization) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memoization[n] != -1) return memoization[n];

        long result = findFibonacciSeriesElementRecMem(n - 1, memoization) + findFibonacciSeriesElementRecMem(n - 2, memoization);
        memoization[n] = result;
        return result;
    }

    public static long findFibonacciSeriesElementFor(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    public static long findFibonacciSeriesElementWhile(int n) {
        int i = 2;
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        while (i <= n) {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        }
        return array[n];
    }

    public static long findFibonacciSeriesElementDoWhile(int n) {

        int i = 2;
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        do {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        } while (i <= n);
        return array[n];
    }
}
