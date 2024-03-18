package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class animalbreedTest {
	Dog dg=new Dog("Moti", "German Shepard");
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
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testnamedog1() {
		System.out.println("Aishwarya Shirodkar RBCA22113");
		String r=dg.getName();
		assertEquals("Moti",r);
	}

}
