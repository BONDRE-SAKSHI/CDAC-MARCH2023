class P10{
  public static void main(String args[]){
	  for( int i=5;i>0;i--){
		  int ch =65;
		  for(int j=1;j<i;j++){
			  System.out.print(" ");
		  
		  }
		  for(int k=i;k<=5;k++){
			  System.out.print((char)(ch+i-1)+" ");
			  ch++;
		  }System.out.println();
	  }
  }
}
/*
C:\Users\saksh\Test>java P10
    E
   D E
  C D E
 B C D E
A B C D E
*/