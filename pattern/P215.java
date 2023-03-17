class P215{
	public static void main(String args[]){
		
		for(int i=1 ;i<=5;i++){
			for(int j=1;j<=i;j++){
				if((i==j)||(j==1)||(i==5))
				{
				 System.out.print("*");
				}
				else
				{
				 System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
/*
C:\Users\saksh\Test\pattern>java P215
*
**
* *
*  *
*****

*/