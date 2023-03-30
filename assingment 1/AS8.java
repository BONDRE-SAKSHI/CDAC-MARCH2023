//8. Write a Java Program to print the digits of a Given Number. 

import java.util.*;

class AS8{
	public static void main(String args[]){
		
	  System.out.print(" ENTER THE NUMBER = ");
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int r=0 ;
	  while(N !=0){
		  r = N % 10;
		  System.out.print(r+" ");
		  N = N / 10;
	  }
		
	}
}