package com.regex;

import java.util.regex.Pattern;

public class ZipCode {
	public static void isValid() {
		String regex = "^[1-9]{1}[0-9]{2}[ ]?[0-9]{3}$";
		Pattern pattern = Pattern.compile(regex);
		boolean result = pattern.matches(regex, "924 765");
		System.out.println(result);
	}

	public static void main(String[] args) {
		isValid();
	}
}
