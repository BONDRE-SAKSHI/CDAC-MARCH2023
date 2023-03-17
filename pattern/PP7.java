import java.util.*;

class PP7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
		for(int j=2;j<=i;j++){
			System.out.print(" ");
		}	
		for(int k=n;k>=i;k--){
			System.out.print(i+" ");
		}
		System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PP7
Enter the value of n = 9
        9
       8 8
      7 7 7
     6 6 6 6
    5 5 5 5 5
   4 4 4 4 4 4
  3 3 3 3 3 3 3
 2 2 2 2 2 2 2 2
1 1 1 1 1 1 1 1 1

*/