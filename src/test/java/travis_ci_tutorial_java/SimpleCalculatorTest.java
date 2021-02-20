package travis_ci_tutorial_java;

import java.util.*;
import java.lang.Integer;
import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	SimpleCalculator calc;

	@Before
	public void initialize() {
		calc = new SimpleCalculator();
	}
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		assertEquals(calc.sub(9, 7), 2);
	}
	@Test
	public void testMultiply() {
		assertEquals(calc.multiply(19, 17), 323);
	}	
	@Test
	public void testDivideByFactor() {
		assertEquals(calc.divide(323, 17), 19);
	}
	@Test
	public void testDivideByOne() {
		assertEquals(calc.divide(323, 1), 323);
	}
	@Test
	public void testDivideBySelf() {
		assertEquals(calc.divide(323, 323), 1);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero()
	{
	    calc.divide(42, 0);
	}
	@Test(expected = ArithmeticException.class)
	public void testMultiplyWithOverflow() {
		int n = calc.multiply(Integer.MAX_VALUE, 2);
		// Integral type narrowing in Java behaves by discarding 
		// all but the number of low order bits that will fit into the lvalue type.
		// We want our calculator to only return mathematically correct values.
		assertFalse(n == -2);
	}
}
