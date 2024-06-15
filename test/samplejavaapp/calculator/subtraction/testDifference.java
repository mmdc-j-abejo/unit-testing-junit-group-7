package samplejavaapp.calculator.subtraction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testDifference {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be 17";
    private int expectedResult;
    private int actualResult;
    private int minuend;
    private int subtrahend;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 17;
        minuend = 50;
        subtrahend = 33;
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

