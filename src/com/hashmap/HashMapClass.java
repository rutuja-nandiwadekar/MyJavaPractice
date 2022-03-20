package com.hashmap;

import java.util.HashMap;

public class HashMapClass {
	public static void main(String args[]) {
		HashMap<String, Integer> numbers = new HashMap<>();

		numbers.put("number1", 1);
		numbers.put("number2", 2);
		numbers.put("number3", 2);
		numbers.put("number4", null);

		System.out.println("hashmap values" + numbers);

		// to access specific value
		System.out.println(numbers.get("number2"));

		// all keys from hashMap
		System.out.println("Keys" + numbers.keySet());

		// all values from hashmap
		System.out.println("All values " + numbers.values());

		System.out.println("Entries " + numbers.entrySet());

		numbers.put("number2", 3);

		System.out.println("hashmap values" + numbers);

		// replacing values
		numbers.replace("number3", 30);
		System.out.println("hashmap values" + numbers);

		// removing
		numbers.remove("number3");
		System.out.println("hashmap values" + numbers);
	}
}