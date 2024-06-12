package samplejavaapp.calculator.division;

import org.junit.*;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testDivisionWithZeroDividend {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be zero.";
    private int expectedResult;
    private int actualResult;
    private int dividend;
    private int divisor;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 0;
        divisor = 5;
        dividend = 0;
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
