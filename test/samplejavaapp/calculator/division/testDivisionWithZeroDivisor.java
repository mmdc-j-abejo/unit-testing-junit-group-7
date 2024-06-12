package samplejavaapp.calculator.division;

import org.junit.*;
import samplejavaapp.MyCalculator;

public class testDivisionWithZeroDivisor {
    private MyCalculator myCalculator;
    private int dividend;
    private int divisor;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        dividend = 5;
        divisor = 0;
    }

    @Test(expected = RuntimeException.class)
    public void startTest() {
        myCalculator.DivideFunction(dividend, divisor);
    }

    @After
    public void tearDown() {
        this.myCalculator.close();
    }
}
