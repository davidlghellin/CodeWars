package es.david.kyu6.maths;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class SimpsonIntegrationTest {
    private static void assertFuzzyEquals(double act, double exp) {
        boolean inrange = Math.abs(act - exp) <= 1e-10;
        if (inrange == false) {
            DecimalFormat df = new DecimalFormat("#.0000000000");
            System.out.println("At 1e-10: Expected must be " + df.format(exp) + ", but got " + df.format(act));
        }
        assertEquals(true, inrange);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: simpson");
        assertFuzzyEquals(SimpsonIntegration.simpson(290), 1.9999999986);
        assertFuzzyEquals(SimpsonIntegration.simpson(72), 1.9999996367);
        assertFuzzyEquals(SimpsonIntegration.simpson(252), 1.9999999975);
        assertFuzzyEquals(SimpsonIntegration.simpson(40), 1.9999961668);
    }
}