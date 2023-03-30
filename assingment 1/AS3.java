//3. Find the Factorial of a number using Recursion.

import java.util.*;

class AS3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to get factorial");
		int num= sc.nextInt();
		
		int fact= factorial(num);
		System.out.println("factorial of "+num+" is "+fact);
		
	}
	static int factorial(int n){
		if(n==1)  return 1;
		else  return n*factorial(n-1);
	}
	
}