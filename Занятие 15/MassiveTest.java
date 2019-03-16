package example;

import org.testng.annotations.Test;

import Core.Massive;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MassiveTest {
	@Test
	public void f() {
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

	@Test
	public void getSumOfElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getSumOfElements(mas), 15);
	}

	@Test
	public void getSumOfElements1() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotEquals(massive.getSumOfElements(mas), 10);
	}

	@Test
	public void getSumOfElements2() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotNull(massive.getSumOfElements(mas));
	}

	@Test
	public void getAverageOfElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getAverageOfElements(mas), 3.0);
	}

	@Test
	public void getAverageOfElements1() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotEquals(massive.getAverageOfElements(mas), 5.0);
	}

	@Test
	public void getMaxOfElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getMaxOfElements(mas), 5);
	}

	@Test
	public void getMaxOfElements1() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotEquals(massive.getMaxOfElements(mas), 6);
	}

	@Test
	public void getMaxOfElements2() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotNull(massive.getMaxOfElements(mas));
	}

	@Test
	public void getMinOfElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getMinOfElements(mas), 1);
	}

	@Test
	public void getMinOfElements2() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotEquals(massive.getMinOfElements(mas), 5);
	}

	@Test
	public void divisionBy2() {
		Massive massive = new Massive();
		Integer[] mas = { 6, 4, 6, 4, 6 };
		Integer[] expectedResult = { 3, 2, 3, 2, 3 };
		Assert.assertEqualsNoOrder(massive.divisionBy2(mas), expectedResult);
	}

	@Test
	public void testNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive);

	}

	@Test
	public void massiveReverseOrder() {
		Massive massive = new Massive();
		Integer[] mas = { 1, 2, 3, 4, 5 };
		Integer[] expectedResult = { 5, 4, 3, 2, 1 };
		Assert.assertEqualsNoOrder(massive.massiveReverseOrder(mas), expectedResult);
	}

	@Test
	public void massiveReverseOrder1() {
		Massive massive = new Massive();
		Integer[] mas = { 1, 2, 3, 4, 5 };
		Integer[] expectedResult = { 5, 4, 3, 2, 1 };
		Assert.assertNotNull(massive.massiveReverseOrder(mas));
	}

	@Test(timeOut = 2000)
	public void multiplyBy3() {
		Massive massive = new Massive();
		Integer[] mas = { 1, 2, 3, 4, 5 };
		Integer[] expectedResult = { 3, 6, 9, 12, 15 };
		Assert.assertEqualsNoOrder(massive.multiplyBy3(mas), expectedResult);
	}

	@Test
	public void getMultiplyElements() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getMultiplyElements(mas), 120);
	}

	@Test
	public void getMultiplyElements2() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertNotEquals(massive.getMultiplyElements(mas), 100);
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void massiveException() {
		Massive massive = new Massive();
		massive.massiveException();
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionBy0() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		massive.divisionBy0(mas);
	}

	@Test(enabled = false)
	public void getMinOfElements1() {
		Massive massive = new Massive();
		int[] mas = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(massive.getMinOfElements(mas), 1);
	}

	@Test(enabled = false)
	public void divisionBy21() {
		Massive massive = new Massive();
		int[] mas = { 6, 4, 6, 4, 6 };
		int[] expectedResult = { 3, 2, 3, 2, 3 };
		Assert.assertEquals(massive.getMinOfElements(mas), expectedResult);
	}

	@Test
	public void testFail() {
		Assert.fail("I have not yet invented");
	}
}
