import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 5000;
		int b = 1000;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 4000;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMulitple() {
		//fail("Not yet implemented");
		int a = 2000;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 4000;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testDivide() {
		int a = 1000;
		int b = 2;
		
//		if(b == 0) {
//			String output = ("Error. Cannot have 0 denominator");
//		}
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 500;
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testDivideWith0Denominator() {
		int a = 1000;
	    int b = 0;
	    
	    try {
	      Calculator cal = new Calculator();
	      cal.divide(a, b);
	      fail("Expected an IllegalArgumentException to be thrown");
	    }catch (IllegalArgumentException e) {
	      assertEquals("Division by zero is not allowed", e.getMessage());
	    }catch (Throwable t) {
	      assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
	    }
	}
	
	
		
}










