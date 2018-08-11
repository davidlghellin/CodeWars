package es.david.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyFromYearJavaTest {
    @Test
    public void FixedTests() {
        assertEquals(18, CenturyFromYearJava.century(1705));
        assertEquals(19, CenturyFromYearJava.century(1900));
        assertEquals(17, CenturyFromYearJava.century(1601));
        assertEquals(20, CenturyFromYearJava.century(2000));
        assertEquals(1, CenturyFromYearJava.century(89));
    }
}