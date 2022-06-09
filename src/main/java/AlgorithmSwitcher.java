import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlgorithmSwitcher that = (AlgorithmSwitcher) o;
        return Objects.equals(alg, that.alg) && Objects.equals(fib, that.fib) && Objects.equals(fac, that.fac) && Objects.equals(sw, that.sw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alg, fib, fac, sw);
    }

    @Override
    public String toString() {
        return "AlgorithmSwitcher{" +
                "alg=" + alg +
                ", fib=" + fib +
                ", fac=" + fac +
                ", sw=" + sw +
                '}';
    }
}
