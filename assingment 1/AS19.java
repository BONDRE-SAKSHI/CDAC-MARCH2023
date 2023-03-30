//19. To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....

import java.util.*;

class AS19{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of even series");
		int num= sc.nextInt(), count=0, i=1;
		
		while(count<num){
			
			if(i%2==0){
				System.out.print(i+" ");
					count++;
					
			}
		   i++;
		}
		
		
		
	}
	
}