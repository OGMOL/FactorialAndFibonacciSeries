public class FibonacciSeries extends Algorithm {

    public FibonacciSeries() {
    }

    @Override
    public long loopWhile(int n) {
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

    @Override
    public long loopDoWhile(int n) {
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

    @Override
    public long loopFor(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    @Override
    public String toString() {
        return "FibonacciSeries{}";
    }
}
