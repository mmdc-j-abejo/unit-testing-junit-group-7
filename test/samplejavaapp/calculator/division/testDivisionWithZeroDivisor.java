package samplejavaapp.calculator.division;

import org.junit.*;
import samplejavaapp.MyCalculator;

import static org.junit.Assert.assertEquals;

public class testDivisionWithZeroDivisor {
    private MyCalculator myCalculator;
    private final String message = "Cannot divide by 0";
    private int expectedResult;
    private int actualResult;
    private int dividend;
    private int divisor;

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        expectedResult = 0;
        divisor = 0;
        dividend = 5;
        actualResult = myCalculator.DivideFunction(dividend,divisor);
    }

    @Test
    public void testDivision() {
        assertEquals(
                message,expectedResult,actualResult
        );
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
    }

}
