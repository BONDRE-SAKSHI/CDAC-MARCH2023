//20. To print the following series ODD number Series 1 3 5 7 9 11 13..
import java.util.*;

class AS20{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of odd series");
		int num= sc.nextInt(), count=0, i=1;
		
		while(count<num){
			
			if(i%2!=0){
				System.out.print(i+" ");
					count++;
					
			}
		   i++;
		}
	}	
}
