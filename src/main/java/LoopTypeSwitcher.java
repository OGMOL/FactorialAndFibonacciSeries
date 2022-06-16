public class LoopTypeSwitcher {

    public LoopTypeSwitcher(Algorithm alg) {
    }

    public long choiceLoopType(int loopType, int n, Algorithm alg) {
        switch (loopType) {
            case (1):
                return alg.loopWhile(n);
            case (2):
                return alg.loopDoWhile(n);
            case (3):
                return alg.loopFor(n);
        }
        return 0;
    }
}
