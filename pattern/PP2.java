import java.util.*;

class PP2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}	
		for(int k=1;k<=i;k++){
			System.out.print(k+" ");
		}System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PP2
Enter the value of n = 9
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/