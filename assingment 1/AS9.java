//9. Write a Java Program to print all the Factors of the Given number. 
 import java.util.*;


class AS9{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number to get factors");
		int num= sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(num%i==0)  System.out.print(i+" ");
		}
		
	}
}
