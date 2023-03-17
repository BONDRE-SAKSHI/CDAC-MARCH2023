import java.util.*;

class PP1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}	
		for(int k=1;k<=i;k++){
			System.out.print(i+" ");
		}System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PP1
Enter the value of n = 9
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/