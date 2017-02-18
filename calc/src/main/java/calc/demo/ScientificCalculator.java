package calc.demo;

import calc.demo.interfaces.IScientificCalculator;

public class ScientificCalculator extends BasicCalculator implements IScientificCalculator {


	public double square(double firstNumber) {
		// TODO Auto-generated method stub
		return (firstNumber*firstNumber);
	}

	public double squareroot(double firstNumber) {
		// TODO Auto-generated method stub
		return (Math.sqrt(firstNumber));
	}

	public double sin(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.sin(firstNumber);
	}

	public double exponential(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return (Math.pow(firstNumber, secondNumber));
	}
	
}