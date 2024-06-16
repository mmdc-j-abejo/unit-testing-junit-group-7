package samplejavaapp.calculator.addition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testAdditionWithZeroAndPositiveNumber {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be -12";
    private int expectedResult;
    private int actualResult;
    private int primaryAddend;
    private int secondaryAddend;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = -12;
        primaryAddend = -12;
        secondaryAddend = 0;
        actualResult = myCalculator.AddFunction(primaryAddend, secondaryAddend);;
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
