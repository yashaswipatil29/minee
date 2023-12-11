package day11;

public class MathCalculatorMain {
//program that makes use of lambda expression for method which accepts parameter
	public static void main(String[] args) {
	//
		MathCalculator adder = (a,b)->a+b;

		MathCalculator subtractor = (int p,int q)->{
			return p-q;
		};
		
		int addition=adder.doCalculate(10,20);
		int substraction = subtractor.doCalculate(100, 200);
		
		System.out.println(addition);
		System.out.println(substraction);
	}

}
