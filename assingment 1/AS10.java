 //10. Write a Java Program to find the sum of the digits of a given number. 
 
import java.util.*;

class AS10{
	public static void main(String args[]){
		
	  System.out.print(" ENTER THE NUMBER = ");
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int r=0 ,SUM =0;
	  if(N >= 0){
	  
	  while(N != 0){
		  r = N % 10;
		  SUM=SUM+r;
		  System.out.print(r+" + ");
		  N = N / 10;
	  }
		System.out.println("SUM Of digits is = "+SUM);
	  }
	  else{System.out.println("Sum is "+SUM );
		  
	  }
	}
}