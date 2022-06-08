public class AlgorithmSwitcher {
    private Algorithm alg;

    public AlgorithmSwitcher() {
    }

    Algorithm fib = new FibonacciSeries();
    Algorithm fac = new Factorial();
    LoopTypeSwitcher sw = new LoopTypeSwitcher(alg);

    public long choiceAlgorithm(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case (1):
                return sw.choiceLoopType(loopType, n, fib);
            case (2):
                return sw.choiceLoopType(loopType, n, fac);
        }
        return 0;
    }

}
