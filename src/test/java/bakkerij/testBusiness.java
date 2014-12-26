package bakkerij;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testBusiness {

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
	public final void test() {
		System.out.println("test run method being run , test pushing to Remote repo");
		Assert.assertTrue(true);

	//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void test2() {
		System.out.println("test run method being run , test pushing to Remote repo");
		Assert.assertTrue(false);

	//fail("Not yet implemented"); // TODO
	}

	
}
