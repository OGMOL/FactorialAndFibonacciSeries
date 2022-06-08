public class Factorial extends Algorithm {

    public Factorial() {
    }

    @Override
    public long loopWhile(int n) {
        long mult = 1;
        if (n == 1 || n == 0) {
            return 1;
        } else {
            while (n > 0) {
                mult *= n;
                n--;
            }
            return mult;
        }
    }

    @Override
    public long loopDoWhile(int n) {
        long mult = 1;
        if (n == 1 || n == 0) {
            return 1;
        } else {
            do {
                mult *= n;
                n--;
            } while (n > 0);
            return mult;
        }
    }

    @Override
    public long loopFor(int n) {
        long mult = 1;
        if (n == 1 || n == 0) {
            return 1;
        } else {
            for (int i = n; i > 0; i--) {
                mult *= i;
            }
            return mult;
        }
    }
}
