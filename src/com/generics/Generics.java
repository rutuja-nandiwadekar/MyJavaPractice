package com.generics;

import java.util.ArrayList;

class GenericsDemo<T, E extends Number, U extends String> {

	T value;
	E value1;
	U value2;

	public void setvalue(T v) {
		value = v;
	}

	public T getValue() {
		return value;
	}

	public void displayValue() {
		System.out.println(value.getClass().getName());
		System.out.println(value1.getClass().getName());
		System.out.println(value2.getClass().getName());
	}

	public void show(ArrayList<T> arraylist) {

	}
}

public class Generics {
	public static void main(String args[]) {
		int number = 7;

		GenericsDemo<Integer, Float, String> demo = new GenericsDemo();
		demo.value = 10;
		demo.value1 = 11.1f;
		demo.value2 = "200.4";

		demo.displayValue();

	}
}
