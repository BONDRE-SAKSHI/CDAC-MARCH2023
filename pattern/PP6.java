class PP6{
	public static void main(String args[]){
		int n=9;
		for(int i=1;i<=n;i++){
			for(int j=2;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}	
/*
C:\Users\saksh\Test\pattern>java PP6
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/