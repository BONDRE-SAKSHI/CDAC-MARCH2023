//2. Write a Java Program to find the Factorial of a given number.

import java.util.Scanner;

class AS2{
	public static void main(String args[]){
		
		int fact =1 , i =1;
		System.out.print("ENTER THE NUMBER = ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(i=1 ; i <=N ; i++){
			fact = fact*i ;
			
		}
		System.out.print("Factorial of the NUMBER "+ N +" = "+fact );
	}
}