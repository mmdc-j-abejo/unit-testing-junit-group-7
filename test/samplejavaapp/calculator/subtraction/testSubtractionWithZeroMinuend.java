package samplejavaapp.calculator.subtraction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testSubtractionWithZeroMinuend {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be -30";
    private int expectedResult;
    private int actualResult;
    private int minuend;
    private int subtrahend;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = -30;
        minuend = 0;
        subtrahend = 30;
        actualResult = myCalculator.SubtractFunction(minuend, subtrahend);;
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
