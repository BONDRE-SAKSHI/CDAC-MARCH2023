import java.util.Scanner;
class P27{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for (int k=1;k<=n/2*i-1;k++){
				System.out.print("*");
			}System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			
			for (int k=1;k<=n/2*i-1;k++){
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
/*
C:\Users\saksh\Test\pattern>java P27
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/