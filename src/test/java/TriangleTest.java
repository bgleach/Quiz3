import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Triangle.Triangle;

public class TriangleTest {
	Triangle newTriangle = new Triangle(3, 3, 3, "white", true);
	

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
		assertEquals(newTriangle.getArea(), 3.89);
		assertEquals(newTriangle.getPerimeter(), 9);
	}
}
