public class Factorial {
    public static void main(String[] args) {
        System.out.println("Recursion " + factorialCounterRec(10));
        System.out.println("Loop for " + factorialCounterFor(10));
        System.out.println("Loop while " + factorialCounterWhile(10));
        System.out.println("Loop do while " + factorialCounterDoWhile(10));
    }

    public static long factorialCounterRec(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorialCounterRec(n - 1);
        }
    }

    public static long factorialCounterFor(int n) {
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

    public static long factorialCounterWhile(int n) {
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

    public static long factorialCounterDoWhile(int n) {
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

}
