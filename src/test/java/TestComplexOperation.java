package test.java;

import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestComplexOperation {

    Complex firstComplexNum;
    Complex secondComplexNum;

    @BeforeEach
    void setUp() {
        firstComplexNum = new Complex(1, 1);
        secondComplexNum = new Complex(2, 2);
    }

    @Test
    void testPlusOperation() {
        Complex result = firstComplexNum.plus(secondComplexNum);
        assertEquals(new Complex(3, 3), result);
    }

    @Test
    void testMinusOperation() {
        Complex result = firstComplexNum.minus(secondComplexNum);
        assertEquals(new Complex(-1, -1), result);
    }

    @Test
    void testDivideOperation() {
        Complex result = firstComplexNum.divide(secondComplexNum);
        assertEquals(new Complex(0.5, 0), result);
    }

    @Test
    void testTimesOperation() {
        Complex result = firstComplexNum.times(secondComplexNum);
        assertEquals(new Complex(0, 4), result);
    }

    @Test
    void testDivideByZero() {
        Complex zeroComplex = new Complex(0, 0);
        assertThrows(ArithmeticException.class, () -> firstComplexNum.divide(zeroComplex));
    }
}