import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

/**
 * Created by veronicacrowe on 5/20/16.
 */

    public class CalculatorSpec {
        @Test
        public void addTest() {
            int expectedValue = 4;
            int actualValue = Calculator.add(2, 2);
            assertEquals("Adding two numbers together the value should be 4", expectedValue, actualValue);

        }

        @Test
        public void differenceTest() {
            int expectedValue = 4;
            int actualValue = Calculator.subtract(6, 2);
            assertEquals("Subtracting two numbers and the value should be 4", expectedValue, actualValue);

        }

        @Test
        public void productTest() {
            int expectedValue = 4;
            int actualValue = Calculator.multiply(2, 2);
            assertEquals("Multiplying two numbers together the value should be 4", expectedValue, actualValue);
        }

        @Test
        public void divideTest() throws DivisionByZeroException {
            int expectedValue = 3;
            int actualValue = Calculator.divide(6,2);
            assertEquals("Dividing two numbers together the value should be 3", expectedValue, actualValue);
        }

        @Test(expected = DivisionByZeroException.class)
        public void TestForDivideByZeroException() throws DivisionByZeroException {
            int actualValue = Calculator.divide(6, 0);
        }

        @Test(expected = ComplexNumberException.class)
        public void TestForComplexNumberException() throws ComplexNumberException {
            double actualValue = Calculator.squareRoot(-5);


        }
    }


