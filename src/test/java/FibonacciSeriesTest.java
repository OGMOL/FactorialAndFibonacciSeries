import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSeriesTest {
    private FibonacciSeries fib;

    @Before
    public void setUp() throws Exception {
        fib = new FibonacciSeries();
    }

    @After
    public void tearDown() throws Exception {
        fib = null;
    }

    @Test
    public void loopWhile() {
        assertEquals(fib.loopWhile(7), 13);
    }

    @Test
    public void loopDoWhile() {
        assertEquals(fib.loopDoWhile(6),8);
    }

    @Test
    public void loopFor() {
        assertEquals(fib.loopFor(5), 5);
    }
}