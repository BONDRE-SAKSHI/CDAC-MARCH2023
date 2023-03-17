class P9{
    public static void main(String args[]){
      char ch = 65;
	  
	  for(int i=0;i<=5;i++){
		  ch = 65;
		  for(int j=5;j>i;j--){
			  System.out.print(" ");
		  }
		  for(int k=0;k<=i;k++){
			  
			  System.out.print(ch+" ");  
			  ch++;
		  }
		   System.out.println();
/*
C:\Users\saksh\Test>java P9
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/   
	  }
 }
}