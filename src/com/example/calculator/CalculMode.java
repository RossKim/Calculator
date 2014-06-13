package com.example.calculator;

public enum CalculMode {
	CAL_ADD, CAL_SUB, CAL_MUL, CAL_DIV, CAL_EQUAL, CAL_INIT;
	public static Integer calculate(Integer n1, Integer n2, CalculMode mode) {
		Integer result = 0;
		switch (mode) {
		case CAL_ADD:
			result = n1 + n2;
			break;
		case CAL_SUB:
			result = n1 - n2;
			break;
		case CAL_MUL:
			result = n1 * n2;
			break;
		case CAL_DIV:
			result = (n2 != 0) ? n1 / n2 : n1;
			break;
		case CAL_INIT:
			result = n2;
			break;
		case CAL_EQUAL:
			result = n1;
			break;
		}
		return result;
	}
}
