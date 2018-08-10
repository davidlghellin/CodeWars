package es.david.kyu7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CountDigTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        testing(CountDig.nbDig(10, 1), 4);
        testing(CountDig.nbDig(25, 1), 11);

        testing(CountDig.nbDig(5750, 0), 4700);
        testing(CountDig.nbDig(11011, 2), 9481);
        testing(CountDig.nbDig(12224, 8), 7733);
        testing(CountDig.nbDig(11549, 1), 11905);
    }
}