package com.lm.interview;

import org.junit.Test;

import com.lm.interview.util.TaxUtils;

public class ShoppingBasketFromFilesTest {

	@Test
	public void testFileEntry1() {
		TaxUtils.getFromFile("source/INPUT_1.txt",1);
	}

	@Test
	public void testFileEntry2() {
		TaxUtils.getFromFile("source/INPUT_2.txt",2);
	}

	@Test
	public void testFileEntry3() {
		TaxUtils.getFromFile("source/INPUT_3.txt",3);
	}
	
	@Test
	public void testFileEntry4() {
		TaxUtils.getFromFile("source/INPUT_4.txt",4);
	}

}
