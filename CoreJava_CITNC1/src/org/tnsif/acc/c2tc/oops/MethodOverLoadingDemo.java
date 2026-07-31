package org.tnsif.acc.c2tc.oops;
class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
	int add(int a, int b ,int c)
	{
		return a+b+c;
	}
}

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("Two integers sum "+calc.add(1, 3));
		System.out.println("Three integres sum "+calc.add(3, 6,8));
		System.out.println("Two double datatype sum "+calc.add(3.5,5.6));
		
	}

}