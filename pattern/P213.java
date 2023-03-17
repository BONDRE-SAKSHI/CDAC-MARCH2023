class P213{
	public static void main(String args[]){
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=2;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
/*
C:\Users\saksh\Test\pattern>java P213
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
*/