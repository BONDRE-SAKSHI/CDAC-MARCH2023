import java.util.*;

class HIHP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
		for(int j=n;j>=1;j--){
			
			if((j == n) || (i == n) ||(j== (n-i+1)))
			  {System.out.print("* ");}
		    else
			  {System.out.print("  ");}		
		}	
		System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java S1
Enter the value of n = 6
* * * * * *
*       *
*     *
*   *
* *
*
*/