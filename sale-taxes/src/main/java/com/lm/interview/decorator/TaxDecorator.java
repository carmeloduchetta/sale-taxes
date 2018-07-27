package com.lm.interview.decorator;

import com.lm.interview.util.TaxUtils;

public abstract class TaxDecorator implements Item {

	protected Item item;

	double rate;

	protected abstract double getRate();

	public TaxDecorator(Item item) {
		this.item = item;
	}

	public double getPrice() {
		double salesTax = TaxUtils.nearest5Percent(this.item.getInitPrice() * this.getRate());
		return TaxUtils.roundPrice(this.item.getPrice() + salesTax);
	}

}