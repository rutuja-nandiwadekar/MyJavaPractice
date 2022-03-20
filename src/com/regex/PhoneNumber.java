package com.regex;

import java.util.regex.Pattern;

public class PhoneNumber {
	public static void isValid() {
		String regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		boolean result = pattern.matches(regex, "91 8989778765");
		System.out.println(result);
	}

	public static void main(String[] args) {
		isValid();
	}
}
