package es.david.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedArrayDigitsTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ReversedArrayDigits.digitize(35231));
    }
}