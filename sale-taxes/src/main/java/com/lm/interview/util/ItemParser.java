package com.lm.interview.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lm.interview.decorator.Item;
import com.lm.interview.decorator.WorkingItem;

public class ItemParser {

	private static final String ITEM_DESCRIPTION_REGEX = "(\\d+)\\s((\\w+\\s)+)at\\s(\\d+.\\d+)";

	public static Item parser(String order) {
		Matcher m = parse(order);
		String name = m.group(2).trim();
		WorkingItem item = new WorkingItem(name, Double.valueOf(m.group(4)));
		if (name.contains("imported"))
			item.setImported(true);
		if (TaxUtils.isExempt(name))
			item.setExempt(true);
		return item;
	}

	public static int count(String order) {
		return Integer.valueOf(parse(order).group(1));
	}

	public static Matcher parse(String description) {
		Pattern pattern = Pattern.compile(ITEM_DESCRIPTION_REGEX);
		Matcher matcher = pattern.matcher(description);
		matcher.find();
		return matcher;
	}

	public static boolean matches(String description) {
		return Pattern.matches(ITEM_DESCRIPTION_REGEX, description);
	}
}
