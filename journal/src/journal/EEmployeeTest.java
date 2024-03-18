package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EEmployeeTest {
	double basicSalary1 = 5000;
    employee e1 = new employee(basicSalary1);

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
		System.out.println("Aishwarya Shirodkar RBCA22113");
    assertEquals(500, e1.da, 0.01);
}
}