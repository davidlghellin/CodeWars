package es.david.kyu7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CovfefeTest {
    @Test
    public void basicTest() {
        assertEquals("covfefe", Covfefe.covfefe("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
        assertEquals("double space  covfefe", Covfefe.covfefe("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
    }

}