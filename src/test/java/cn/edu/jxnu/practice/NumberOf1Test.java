package cn.edu.jxnu.practice;

import org.junit.Assert;
import org.junit.Test;

public class NumberOf1Test {

	@Test
	public void testNumberOf1_1() {
		Assert.assertEquals(0, new NumberOf1().NumberOf1_1(0));
		Assert.assertEquals(1, new NumberOf1().NumberOf1_1(1));
		Assert.assertEquals(2, new NumberOf1().NumberOf1_1(5));
		Assert.assertEquals(5, new NumberOf1().NumberOf1_1(31));
	}

	@Test
	public void NumberOf1_2() {
		Assert.assertEquals(0, new NumberOf1().NumberOf1_2(0));
		Assert.assertEquals(1, new NumberOf1().NumberOf1_2(1));
		Assert.assertEquals(5, new NumberOf1().NumberOf1_2(31));
	}

	@Test
	public void NumberOf1_2_low() {
		Assert.assertEquals(0, new NumberOf1().NumberOf1_2_low(0));
		Assert.assertEquals(1, new NumberOf1().NumberOf1_2_low(1));
		Assert.assertEquals(2, new NumberOf1().NumberOf1_2_low(5));
		Assert.assertEquals(5, new NumberOf1().NumberOf1_2_low(31));
	}
}
