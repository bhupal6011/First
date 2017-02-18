package calc.test;

import calc.demo.BasicCalculator;
import calc.demo.ScientificCalculator;
import calc.demo.interfaces.IBasicCalculator;
import calc.demo.interfaces.IScientificCalculator;

public class CalcTest {
public static void main(String args[]){
	IBasicCalculator calc=new BasicCalculator();
	System.out.println("addition " +calc.addition(10, 11));
	System.out.println("multiply " +calc.multiply(10, 11));
	System.out.println("division " +calc.division(10, 11));
	System.out.println("subtraction " +calc.substraction(10, 11));
	
	IScientificCalculator scicalc=new ScientificCalculator();
	System.out.println("square" + scicalc.square(11));
	System.out.println("squareroot" + scicalc.squareroot(11));
	System.out.println("sin" + scicalc.sin(11));
	System.out.println("exponential" + scicalc.exponential(2,3));
	
	
}
	
}