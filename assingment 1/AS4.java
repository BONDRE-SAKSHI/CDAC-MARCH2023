//4. Swap two numbers without using the third variable approach. 

import java.util.Scanner;

class AS4{
	public static void main(String args[]){
		
		Scanner s =new Scanner(System.in);
		
		System.out.print("Enter First number  = ");
		int a = s.nextInt();
		
		System.out.print("Enter Second number  = ");
		int b = s.nextInt();
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a = "+a);
		System.out.print("The value of b = "+b);
		
	}
}