package com.ProblemStatement2.OverrideCalculation;

public class OverrideSum extends OverrideCalculations{
	
	  int multiply(int num1, int num2)
	   { 
		   int result;
	       System.out.println("Interger Value Addition" + super.multiply(num1, num2));
	       result = num1+num2;
	       System.out.println("num1 + num2 = " +result);
	       return result;
	       
	   }
	
	  public float multiply(float num1, float num2)
	   { 
		   float result;
	       System.out.println("Interger Value Addition" + super.multiply(num1, num2));
	       result = num1 + num2;
	       System.out.println("num1 + num2 = " +result);
	       return result;
	       
	   }
}
