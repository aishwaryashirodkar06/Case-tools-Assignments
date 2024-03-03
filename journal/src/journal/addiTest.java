package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addiTest {
	addi ad=new addi(5,7);

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
	public void testadd() {
		double result=ad.add();
		assertEquals(12,result,0.01);
	}
	
	@Test
	public void testadd2() {
		double result=ad.add();
		assertEquals(15,result,0.01);
	}
}
