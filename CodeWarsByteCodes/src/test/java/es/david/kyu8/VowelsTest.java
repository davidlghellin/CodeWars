package es.david.kyu8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class VowelsTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
}