import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	
	@Test
	void testAdd() {
		Calculator clsCalc = new Calculator();
		if (clsCalc.add(2, 4) !=6)
		{
			fail("Not yet implemented");

		}
//automated testing that checks the method to see if it works, great to know!!		
	}
	@Test
	void testSubtract() {
		assertEquals(Calculator.Subtract(7,5),2);
		
		/*
		 * if (Calculator.Subtract(5, 3) !=2) { fail("Not yet implemented");
		 * 
		 * }
		 */
	}
	@Test
	void testMultiply() {
		assertEquals(Calculator.Multiply(3, 4),12);
	
	}

	@Test
	void testDivide() {
		assertEquals(Calculator.Divide(6, 3),2);
	}
//AssertEquals checks to see if the result is equal to the number put like
	//assertEquals(Calculator.subtract(7,5),6)
	//use this more often than the if statement
	//also assertNull()
	//asserNotNull
	//assertTrue
	//assertFalse
	//assertNotEquals
	//asserSame
	//assertNotSame 
	//these are other methods in Jupiter
	//
}
