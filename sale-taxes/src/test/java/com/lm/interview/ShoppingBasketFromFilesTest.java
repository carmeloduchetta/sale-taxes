package com.lm.interview;

import org.junit.Test;

import com.lm.interview.util.TaxUtils;

public class ShoppingBasketFromFilesTest {

	@Test
	public void testFileEntry1() {
		TaxUtils.getFromFile("source/in1.txt",1);
	}

	@Test
	public void testFileEntry2() {
		TaxUtils.getFromFile("source/in2.txt",2);
	}

	@Test
	public void testFileEntry3() {
		TaxUtils.getFromFile("source/in3.txt",3);
	}

}
