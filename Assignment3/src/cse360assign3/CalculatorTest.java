package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculator = new Calculator();
		assertNotEquals(calculator, null);
	}

	@Test
	public void testGetTotal() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.getTotal(), 0);
	}
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		assertEquals(calculator.getTotal(), 5);
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.subtract(7);
		assertEquals(calculator.getTotal(), -7);
	}
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.multiply(4);
		assertEquals(calculator.getTotal(), 20);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.add(15);
		calculator.divide(5);
		assertEquals(calculator.getTotal(), 3);
	}
	
	@Test
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		calculator.add(15);
		calculator.divide(0);
		assertEquals(calculator.getTotal(), 0);
	}
	
	@Test
	public void getHistory() {
		Calculator calculator = new Calculator();
		calculator.add(6);
		calculator.subtract(2);
		calculator.multiply(3);
		calculator.divide(12);
		assertEquals(calculator.getHistory(), "0 + 6 - 2 * 3 / 12");
	}
}
