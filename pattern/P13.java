class P13{
 public static void main(String args[]){
	char ch = 'A';
	
	for(int i=1;i<=5;i++){
		
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print((char)(int)((ch)+i-1)+" ");
			//ch++;
		}System.out.println();
	} 
 }
}
/*C:\Users\saksh\Test>java P13
    A
   B B
  C C C
 D D D D
E E E E E
*/
