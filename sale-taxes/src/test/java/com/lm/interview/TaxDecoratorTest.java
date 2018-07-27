package com.lm.interview;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lm.interview.decorator.Item;
import com.lm.interview.decorator.WorkingItem;
import com.lm.interview.decorator.impl.ImportTaxDecorator;
import com.lm.interview.decorator.impl.SalesTaxDecorator;

public class TaxDecoratorTest {

	@Test
	public void testGetPrice() {
		Item item = new WorkingItem("Test", 100.00);
		assertEquals(item.getName(), "Test");
		System.out.println(item.getPrice());
		assertTrue(Math.abs((item.getPrice() - 100.00)) < 0.001);

		item = new ImportTaxDecorator(item);
		System.out.println(item.getPrice());
		assertTrue(Math.abs((item.getPrice() - 105.00)) < 0.001);

		item = new SalesTaxDecorator(item);
		System.out.println(item.getPrice());
		assertTrue(Math.abs((item.getPrice() - 115.00)) < 0.001);

		System.out.println(item.getInitPrice());
		assertTrue(Math.abs((item.getInitPrice() - 100.00)) < 0.001);
	}

}
