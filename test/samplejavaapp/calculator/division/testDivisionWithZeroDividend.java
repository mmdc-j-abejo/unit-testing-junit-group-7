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

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 0;
        divisor = 5;
        dividend = 0;
        actualResult = myCalculator.DivideFunction(dividend,divisor);
    }

    @Test
    public void test() {
        assertEquals(
                message,expectedResult,actualResult
        );
    }

    @After
    public void tearDown() {
    }

    @AfterClass
    public static void afterClass() {
    }

}
