package samplejavaapp.calculator.division;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testDivisionWithNegativeNumbers {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be 5.";
    private int expectedResult;
    private int actualResult;
    private int dividend;
    private int divisor;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 5;
        divisor = -5;
        dividend = -25;
        actualResult = myCalculator.DivideFunction(dividend,divisor);
    }

    @Test
    public void startTest() {
        assertEquals(
                message,expectedResult,actualResult
        );
    }

    @After
    public void tearDown() {
        this.myCalculator.close();
    }
}
