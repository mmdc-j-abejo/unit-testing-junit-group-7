package samplejavaapp;

/**
 *
 * @author Armando III
 */
public class MyCalculator {
    private final int ZERO = 0;
    /**
     * Adds two integers.
     *
     * @param primaryAddend The first addend.
     * @param secondaryAddend The second addend.
     * @return The sum of the two integers.
     */
    public int AddFunction(int primaryAddend, int secondaryAddend){
        return primaryAddend + secondaryAddend;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param minuend The number from which to subtract.
     * @param subtrahend The number to subtract.
     * @return The difference between the two integers.
     */
    public int SubtractFunction(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    /**
     * Multiplies two integers.
     *
     * @param multiplicand The first number to multiply.
     * @param multiplier The second number to multiply.
     * @return The product of the two integers.
     */
    public int MultiplyFunction(int multiplicand, int multiplier){
        return multiplicand * multiplier;
    }

    /**
     * Divides one integer by another.
     *
     * @param dividend The number to be divided.
     * @param divisor The number by which to divide.
     * @return The quotient of the division operation.
     * @throws ArithmeticException If the divisor is zero.
     */
    public int DivideFunction(int dividend, int divisor){
        if (divisor == ZERO) {
            throw new ArithmeticException("Cannot divide by " + ZERO);
        }
        return dividend / divisor;
    }

    /**
     * Closes the entire class and makes it eligible for garbage collection.
     */
    public void close() {
        // Perform any necessary cleanup operations here
        // Remove any references to this class instance
    }
}
