package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class digit_cTest {
	digit_c dg= new digit_c(674534);
	digit_c dg1= new digit_c(63);

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
	public void testcount() {
		assertEquals( 6,dg.getCount());
	}

	
	@Test
	public void testcount1() {
		System.out.println("Aishwarya Shirodkar RBCA22113");
		assertEquals( 2,dg1.getCount());
	}

}
