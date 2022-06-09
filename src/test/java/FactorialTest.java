import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial = null;
    }

    @Test
    public void loopWhile() {
        assertEquals(factorial.loopWhile(7), 5040);
    }

    @Test
    public void loopDoWhile() {
        assertEquals(factorial.loopDoWhile(6), 720);
    }

    @Test
    public void loopFor() {
        assertEquals(factorial.loopFor(5), 120);
    }
}