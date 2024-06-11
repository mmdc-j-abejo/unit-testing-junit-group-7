/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package samplejavaapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Armando III
 */
public class MyCalculatorTest {
    
    public MyCalculatorTest() {
    }

    @Test
    public void testAddFunction() {
        MyCalculator test = new MyCalculator();
        
        int expected = 5;   // Set the expected result
        int actual;         // Create a variable for the actual result
        
        actual = test.AddFunction(3, 2);
        
        assertEquals(expected, actual);
    }
    
}
