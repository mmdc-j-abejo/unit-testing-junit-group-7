package samplejavaapp.calculator.division;

import org.junit.*;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testQuotientValueEqualToOne {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be 1";
    private int expectedResult;
    private int actualResult;
    private int dividend;
    private int divisor;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 1;
        divisor = 64;
        dividend = 64;
        actualResult = myCalculator.DivideFunction(dividend,divisor);
    }

    @Test
    public void testQuotient() {
        assertEquals(message,expectedResult,actualResult);
    }

    @After
    public void tearDown() {
        this.myCalculator.close();
    }
}
