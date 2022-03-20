package com.polymorphism;

class MyClass {

	int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	double addition(double a, double b) {
		double c = a + b;
		return c;
	}

	double addiition(double a, double b, double c) {
		double d = a + b + c;
		return d;
	}

	int addition(int a, int b, int c, int d) {
		int e = a + b + c + d;
		return e;
	}
}

public class MethodOverloading {

	public static void main(String args[]) {

		MyClass myClass = new MyClass();

		double result = myClass.addition(133.4, 277.8);
		System.out.println("result " + result);

		int result1 = myClass.addition(1, 2, 3, 4);
		System.out.println("result of 4 number addition " + result1);
	}
}
