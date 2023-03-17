class P18{
	public static void main(String args[]){
		for(int i=5;i>=1;i--){
			int ch=65;
			for(int j=1;j<=i;j++){
				System.out.print((char)(ch+j-1)+" ");
			}System.out.println();
		}
	}
}

/*
C:\Users\saksh\Test\pattern>java P18
A B C D E
A B C D
A B C
A B
A
*/