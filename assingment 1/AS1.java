//1. Check if the given number is EVEN or ODD.

import java.util.Scanner;

class AS1{
	public static void main(String args[]) {
	
	System.out.print("ENTER THE NUMBER = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if(n % 2 == 0){
		System.out.print("    NUMBER  is EVEN !! ");
	}
	else{
		System.out.print("    NUMBER  is ODD !! ");
	}
		
}	

}