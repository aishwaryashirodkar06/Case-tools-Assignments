package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class fibonacciTest {
	fibonacci fb= new fibonacci();
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
	public void testfibonacci() {
		 int[] expected = {0, 1, 1, 2, 3};
	        assertArrayEquals(expected, fb.getFibSeries());
	}
	
	@Test
	public void testfibonacci2() {
		System.out.println("Aishwarya Shirodkar RBCA22113");
		 int[] expected = {0, 1, 1, 2};
	        assertArrayEquals(expected, fb.getFibSeries());
	}

}
