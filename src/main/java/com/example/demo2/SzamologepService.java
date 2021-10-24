package com.example.demo2;

public class SzamologepService {

	public double szamol (int a, int b, String operator) {
		if ("+".equals(operator)) {
			return a + b;
		}
		if ("-".equals(operator)) {
			return a - b;
		}
		if ("*".equals(operator)) {
			return a * b;
		}
		if ("/".equals(operator)) {
			return a / b;
		}
		return 0;
	}
}
