package com.simplilearn.assignment1;

public class Utility {

	public static void main(String[] args) {
		int result1,result2,result3,result4,result5,result6; double result7;
		Calculator calc = new Calculator();
		result1 = calc.Add(10, 2);
		result2 = calc.Sub(10, 2);
		result3 = calc.Mul(10, 2);
		result4 = calc.Div(10, 2);
		result5 = calc.Mod(10, 2);
		result6 = calc.Percent(25);
		result7 = calc.sqrt(100);
		
		
		
		Printresult data = new Printresult();
		System.out.println("addition");
		data.output(result1);
		System.out.println("subtraction");
		data.output(result2);
		System.out.println("multiplication");
		data.output(result3);
		System.out.println("division");
		data.output(result4);
		System.out.println("modulo");
		data.output(result5);
		System.out.println("percentage");
		data.output(result6);
		System.out.println("square root");
		data.output(result7);
	}

}
