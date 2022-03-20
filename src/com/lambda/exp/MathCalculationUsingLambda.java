package com.lambda.exp;

interface Calculation {
	public void cal(int a, int b);
}

public class MathCalculationUsingLambda {
	public static void main(String[] args) {

		Calculation addition = (a, b) -> {
			int sum = a + b;
			System.out.println("sum= " + sum);
		};
		addition.cal(2, 4);

		Calculation subtraction = (a, b) -> {
			int sub = a - b;
			System.out.println("sub= " + sub);
		};
		subtraction.cal(2, 4);

		Calculation division = (a, b) -> {
			int div = a / b;
			System.out.println("div= " + div);
		};
		division.cal(2, 4);

		Calculation multiplication = (a, b) -> {
			int multi = a * b;
			System.out.println("multi= " + multi);
		};
		multiplication.cal(2, 4);
	}
}