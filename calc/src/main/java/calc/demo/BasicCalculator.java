package calc.demo;

import calc.demo.interfaces.IBasicCalculator;

public class BasicCalculator implements IBasicCalculator{

	public int addition(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber+secondNumber;
	}

	public int multiply(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber*secondNumber;
	}

	public int division(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber/secondNumber;
	}

	public int subtraction(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber-secondNumber;
	}

	public int substraction(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

}