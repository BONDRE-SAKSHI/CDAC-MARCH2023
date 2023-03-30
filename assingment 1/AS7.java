//7. Write a Java Program to Print 1 To 10 Without Using LooP

import java.util.Scanner;

class AS7{
	public static void main(String [] args){
    printNum(10);

		
	}
	
	static void printNum(int num){
		if(num==0) return; 
	     printNum(num-1);
		 System.out.println(num);
	}
}