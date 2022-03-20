package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.forEach(i -> System.out.println(i));

		Set set = list.stream().map(i -> i + i).collect(Collectors.toSet());

		System.out.println(set);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Sssss", "String", "Sam");
		List<String> result = names.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());

		System.out.println(result);

	}
}
