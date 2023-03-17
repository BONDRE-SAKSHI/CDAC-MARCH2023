import java.util.*;

class PP4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
		for(int j=n;j>i;j--){
			System.out.print("  ");
		}	
		for(int k=1;k<=i;k++){
			System.out.print(k+" ");
		}
		for(int k=i-1;k>=1;k--){
			System.out.print(k+" ");
		}
		System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PP4
Enter the value of n = 9
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/