package Core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveTest {

	@Before
	public void before() {
		System.out.println("@Before");

	}

	@After
	public void after() {
		System.out.println("@After");

	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");

	}

	@Test
	public void getSumOfElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(15, massive.getSumOfElements(mas));
	}

	@Test
	public void testNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive);

	}

	@Test
	public void massiveReverseOrder() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		int[] expectedResult = { 5, 4, 3, 2, 1 };
		Assert.assertArrayEquals(expectedResult, massive.massiveReverseOrder(mas));
	}

	@Test(timeout = 2000)
	public void multiplyBy3() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		int[] expectedResult = { 3, 6, 9, 12, 15 };
		Assert.assertArrayEquals(expectedResult, massive.multiplyBy3(mas));
	}

	@Test
	public void getMultiplyElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(120, massive.getMultiplyElements(mas));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void massiveException() {
		Massive massive = new Massive();
		massive.massiveException();
	}

	@Test(expected = ArithmeticException.class)
	public void divisionBy0() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		massive.divisionBy0(mas);
	}

	@Ignore
	@Test
	public void getMultiplyElements1() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(120, massive.getMultiplyElements(mas));
	}

	@Ignore
	@Test
	public void testNotNull1() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive);

	}

	@Test
	public void testFail() {
		fail("I have not yet invented");
	}

}
