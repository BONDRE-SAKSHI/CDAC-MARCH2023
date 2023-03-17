import java.util.*;

class PP5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
		for(int j=i-1;j>=0;j--){
			System.out.print("  ");
		}	
		for(int k=i;k<=n;k++){
			System.out.print(k+" ");
		}
		for(int j=n-1;j>=i;j--){
			System.out.print(j+" ");
		}
		System.out.println();	
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java PP5
Enter the value of n = 9
                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
  
*/