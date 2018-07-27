package com.lm.interview;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lm.interview.util.ItemParser;
import com.lm.interview.util.ShoppingBasket;

public class ShoppingBasketTest {

	@Test
	public void testInput() {
		ShoppingBasket sc = new ShoppingBasket();
		sc.put(ItemParser.parser("1 book at 12.49"), ItemParser.count("1 book at 12.49"));
		sc.put(ItemParser.parser("1 music CD at 14.99"), ItemParser.count("1 music CD at 14.99"));
		sc.put(ItemParser.parser("1 chocolate bar at 0.85"), ItemParser.count("1 chocolate bar at 0.85"));
		sc.printOrderInput(1);
		sc.printOrderResults(1);
		assertTrue(Math.abs((sc.getTaxtotal() - 1.50)) < 0.001);
		assertTrue(Math.abs((sc.getTotal() - 29.83)) < 0.001);
	}

	@Test
	public void testInputMultipleItems() {
		ShoppingBasket sc = new ShoppingBasket();
		sc.put(ItemParser.parser("2 book at 12.49"), ItemParser.count("2 book at 12.49"));
		sc.put(ItemParser.parser("2 music CD at 14.99"), ItemParser.count("2 music CD at 14.99"));
		sc.put(ItemParser.parser("2 chocolate bar at 0.85"), ItemParser.count("2 chocolate bar at 0.85"));
		sc.printOrderInput(2);
		sc.printOrderResults(2);
	}

	@Test
	public void testDoubleEntry() {
		ShoppingBasket sc = new ShoppingBasket();
		sc.put(ItemParser.parser("2 book at 10.00"), ItemParser.count("2 book at 10.00"));
		sc.put(ItemParser.parser("2 book at 100.00"), ItemParser.count("2 book at 100.00"));
		sc.printOrderInput(3);
		sc.printOrderResults(3);
		assertTrue(sc.getItems().size() == 2);
	}

	@Test
	public void testDoubEntry() {
		ShoppingBasket sc = new ShoppingBasket();
		sc.put(ItemParser.parser("2 book at 10.00"), ItemParser.count("2 book at 10.00"));
		sc.put(ItemParser.parser("2 book at 10.00"), ItemParser.count("2 book at 10.00"));
		sc.printOrderInput(4);
		sc.printOrderResults(4);
		assertTrue(sc.getItems().size() == 1);
	}
}
