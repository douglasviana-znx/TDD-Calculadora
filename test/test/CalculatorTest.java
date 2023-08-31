package test;
import app.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testMedia() {
        Calculator calculator = new Calculator();
        double[] numeros = {1,2,3,4,5};
        double result = calculator.calcMedia(numeros);
        assertEquals(3, result);
    }
    
    @Test
    public void testPow() {
    	Calculator calcTest = new Calculator();
    	assertEquals(8, calcTest.pow(2, 3));
    	assertEquals(0.25, calcTest.pow(2, -2));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.subtraction(13, 7));
    }
}