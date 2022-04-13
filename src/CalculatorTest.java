import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		
	    Calculator calc = new Calculator();
	    assertEquals(6, calc.addition(4, 2));
	    assertEquals(-5, calc.addition(-3, -2));
	    assertEquals(1729, calc.addition(1700, 0035));
	    assertEquals(0, calc.addition(-99, 99));
	}

	@Test
	public void testSubtraction() {
	    Calculator calc = new Calculator();
	    assertEquals(2, calc.subtraction(4, 2));
	    assertEquals(-1, calc.subtraction(-3, -2));
	    assertEquals(1671, calc.subtraction(1700, 0035));
	    assertEquals(-198, calc.subtraction(-99, 99));
	}

	@Test
	public void testMultiplication() {
	    Calculator calc = new Calculator();
	    assertEquals(8, calc.multiplication(4, 2));
	    assertEquals(6, calc.multiplication(-3, -2));
	    assertEquals(800, calc.multiplication(400, 2));
	    assertEquals(-100, calc.multiplication(-10, 10));
	}

	@Test
	public void testDivision() {
	    Calculator calc = new Calculator();
	    assertEquals(2, calc.division(4, 2));
	    assertEquals(4, calc.division(-8, -2));
	    assertEquals(200, calc.division(1400, 007));
	    assertEquals(-1, calc.division(-99, 99));
	}
}
