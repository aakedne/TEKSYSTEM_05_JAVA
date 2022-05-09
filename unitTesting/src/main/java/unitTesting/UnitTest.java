package unitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
	// slide 9,11-14
	// All from Junit 5 framework
	// runs once before any other 
	//method in that class
	// method must be static
//	@BeforeAll
	
	// runs once after any 
	// other test methods in this class have.
	// method must be static
//	@AfterAll
	
	// runs before every test
//	@BeforeEach
		
	// runs after every test
//	@AfterEach
	@BeforeAll
	public static void setUpBefore() throws Exception{
		System.out.println("before class");
	}
	
	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("Run BeforeEach Test method????");
	}
	
	//The test method
	@Test
	public void testFindMax() {
		assertEquals(4, TestingSomething.findMax(new int [] {1,3,4,2}));
		assertEquals(-1, TestingSomething.findMax(new int [] {-12,-3,-4,2}));	
		System.out.println("testing find max");		
	}
	@Test
	public void testCubeMethod() {
		System.out.println("Test cubed method");
		assertEquals(27, TestingSomething.cube(3));
		
	}
	
	@Test
	public void reverseWordTest() {
		System.out.println("Test case for reverse word");
		assertEquals("olleh", TestingSomething.reverseString("hello"));
	}
	@AfterEach
	public void tearDown() throws Exception{
		System.out.println("After Tests");
	}
	@AfterAll
	public static void classTearDown() throws Exception{
		System.out.println("After the class");
	}
			
}
