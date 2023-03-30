//13. Write a java program to Reverse a given number. 

import java.util.*;

class AS13{
		public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter  number and get reversed number");
		int num= sc.nextInt(), reversed=0;
	

		while(num!=0){
			int digit=num%10;
			reversed=reversed*10+digit;
			
			num=num/10;
		}
		
		
		System.out.println(reversed);
		
	}
}