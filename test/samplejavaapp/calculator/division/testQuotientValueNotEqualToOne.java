package samplejavaapp.calculator.division;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testQuotientValueNotEqualToOne {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be 1";
    private int unexpectedResult;
    private int actualResult;
    private int dividend;
    private int divisor;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        unexpectedResult = 100;
        divisor = 64;
        dividend = 64;
        actualResult = myCalculator.DivideFunction(dividend,divisor);
    }

    @Test
    public void testQuotient() {
        assertNotEquals(unexpectedResult,actualResult);
    }

    @After
    public void tearDown() {
        this.myCalculator.close();
    }
}
