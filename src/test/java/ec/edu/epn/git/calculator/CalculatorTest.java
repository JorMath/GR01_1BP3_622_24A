package ec.edu.epn.git.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void given_two_integers_when_addition_then_ok(){
        Calculator calc = new Calculator();
        assertEquals(6,calc.adicion(4,2));
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.subtract(10,5));
    }
}