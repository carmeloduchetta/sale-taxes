package com.lm.interview;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lm.interview.util.TaxUtils;

public class TaxUtilsTest {

	@Test
	public void testNearest5Percent() {
		assertTrue(Math.abs((TaxUtils.nearest5Percent(1.03)) - 1.05) < 0.0001);
	}

	@Test
	public void testRoundPrice() {
		assertTrue(Math.abs((TaxUtils.roundPrice(10.125456) - 10.12)) > 0.008);
	}

	@Test
	public void testIsExempt() {
		assertTrue(TaxUtils.isExempt("chocolate bar"));
	}

}
