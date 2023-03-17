import java.util.*;
class P6{
  public static void main(String args[]){
 Scanner s = new Scanner(System.in);
		System.out.println("ENTER VALU OF N = ");
		int N = s.nextInt();
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i;j++)
			{System.out.print(" ");}
		   
		    for(int k=1;k<=i;k++)
			{ System.out.print("*");}
		System.out.println();
		}
	}
	}
/*
C:\Users\saksh\Test\pattern>java P6
ENTER VALU OF N =
5
    *
   **
  ***
 ****
*****

*/	