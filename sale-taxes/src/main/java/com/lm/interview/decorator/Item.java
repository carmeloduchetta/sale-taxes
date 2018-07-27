package com.lm.interview.decorator;

public interface Item {

	String getName();

	double getInitPrice();

	boolean isImported();

	boolean isExempt();

	double getPrice();

}