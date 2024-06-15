package samplejavaapp.calculator.addition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testAdditionWithNegativeNumbers {
    private MyCalculator myCalculator;
    private final String message = "Expected result should be -15";
    private int expectedResult;
    private int actualResult;
    private int primaryAddend;
    private int secondaryAddend;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = -15;
        primaryAddend = 5;
        secondaryAddend = -20;
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


