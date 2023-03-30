//5. How to check whether the given number is Positive or Negative in Java? 
import java.util.Scanner;

class AS5{
	public static void main(String args[]) {
	
	System.out.print("ENTER THE NUMBER = ");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	
	String s = (i>0)?"POSITIVE":(i<0)?"NEGATIVE":"INVALID INPUT" ;
	
	System.out.println(s);	
  }	
}
 /*  APPROAVH 2


if(n>0){
		System.out.print("    NUMBER  is POSITVE !! ");
	}
	else if(n<0)
	{
		System.out.print("    NUMBER  is NEGATIVE !! ");
	}
	else {
		System.out.println("    NUMBER  is INVALID !! ");
	}
	*/
	//APPROACH 3
	
	/*switch(n){
		case (n>0) : System.out.print("    NUMBER  is POSITIVE!! ");
	                 break;
	
		
		case (n<0) : System.out.print("    NUMBER  is NEGATIVE !! ");
		             break;
		
        default  : System.out.print("    NUMBER  is INVALID !! ");
		             break;		
	}*/