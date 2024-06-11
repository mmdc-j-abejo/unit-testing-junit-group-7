/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package samplejavaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Armando III
 */
public class TwoMyCalculatorTest {
    
    public
    TwoMyCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AddFunction method, of class MyCalculator.
     */
    @Test
    public void testDivideFunction() {
        System.out.println("DivideFunction");
        int numerator = 5;
        int denominator = 0;
        MyCalculator instance = new MyCalculator();
        int expResult = 0;
        int result = instance.DivideFunction(numerator, denominator);
        String displayExpected = "The result should be zero";
        assertNotEquals(displayExpected ,expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testAddFunction() {

    }
}
