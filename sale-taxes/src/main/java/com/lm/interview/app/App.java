package com.lm.interview.app;

import com.lm.interview.util.TaxUtils;

/**
 * Hello world!
 *
 */
public class App {
	ClassLoader classLoader = getClass().getClassLoader();

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			TaxUtils.getFromFile(args[i],i);
		}

	}

}
