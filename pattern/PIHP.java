import java.util.*;

class PIHP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
		for(int j=i;j>=1;j--){
			System.out.print("* ");
		}	
		System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PIHP
Enter the value of n = 6
* * * * *
* * * *
* * *
* *
*

*/