package link.vadzimk.math.test;

import link.vadzimk.math.NumberTheory;
import org.junit.Test;

import static link.vadzimk.math.NumberTheory.gcd;
import static org.junit.Assert.assertEquals;

public class GCDTest {
    @Test
    public void reflexive() {
        assertEquals(1, gcd(1, 1));
        assertEquals(2, gcd(2,2));
        assertEquals(1, gcd(-1, -1));

    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, gcd(2,3));
        assertEquals(1, gcd(4,7));
        assertEquals(1, gcd(-2,-3));
    }

    @Test
    public void oneMultipleOfOther() {
        assertEquals(3, gcd(3,9));
    }

    @Test
    public void commonFactor() {
        assertEquals(2, gcd(6,8));
    }

    @Test
    public void zero() {
        assertEquals(1, gcd(1, 0));
        assertEquals(5, gcd(0, 5));
        assertEquals(0, gcd(0, 0));
    }
}


