package es.david.kyu8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StringRepeatTest {

    @org.junit.Test
    public void repeatStr() {
        assertEquals("hhhhhh", StringRepeat.repeatStr(6, "h"));
        assertEquals("holahola", StringRepeat.repeatStr(2, "hola"));
    }

    @Test
    public void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }

    @Test
    public void testNegativeRepeat() {
        assertEquals("", StringRepeat.repeatStr(-10, "kata"));
    }
}