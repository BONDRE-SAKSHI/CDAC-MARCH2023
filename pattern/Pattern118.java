import java.util.*;

class Pattern118{
    public static void main(String args[]){
	System.out.println("HOMWEORK DONE BY SBPS.......!!! ");
		System.out.print("Enter your choice = ");
		Scanner sc =new Scanner(System.in);
		
		int choice =sc.nextInt();
		
		switch(choice){
			case 1 : for(int i=1;i<=5;i++){
		                 for(int j=1;j<=i;j++){
		                     System.out.print(j+" ");
		                     }System.out.println();
	                        }
                      break;
			case 2  : 	for(int i=1;i<=5;i++){
	                       char ch='A';
                         for(int j=1;j<=i;j++){	
		                  System.out.print(ch+" ");
		                      ch++;
		                   }System.out.println();
	                       ch++;
	                    }
			          
					  break;
			case 3  : for(int i=1;i<=5;i++){
			             for(int j=1;j<=i;j++){
		     	         	System.out.print("*");
			         }System.out.println();
		}
			
			         break;		  
			case 4  :for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
		System.out.print(i+" ");
    }System.out.println();
	}
			
			
			          break;		  
			case 5  :char c='A';
                        for(int i=1;i<=5;i++){
		
	 for(int j=1;j<=i;j++){
		System.out.print(c+" ");
		
		}System.out.println();
	 c++;
	}
 
			           break;		  
			case 6  :for(int i=1;i<=5;i++){
			for(int j=1;j<=4-i;j++)
			{System.out.print(" ");}
		   
		    for(int k=1;k<=i;k++)
			{ System.out.print("*");}
		System.out.println();
		}
			           break;		  
			case 7  :for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
			         break;		  
			case 8  :for (int i=5;i>=1;i--){
		  for(int j=1;j<i;j++){
			  System.out.print(" ");
		  }
		  for(int k=i;k<=5;k++){
			  System.out.print(k+" ");
		  }System.out.println();
	  }
			         break;		  
			case 9  :char ch = 65;
	                 for(int i=0;i<=5;i++){
		  ch = 65;
		  for(int j=5;j>i;j--){
			  System.out.print(" ");
		  }
		  for(int k=0;k<=i;k++){
			  
			  System.out.print(ch+" ");  
			  ch++;
		  }
	  System.out.println();}
		            	break;		  
			case 10 :for( int i=5;i>0;i--){
		             int a =65;
		  for(int j=1;j<i;j++){
			  System.out.print(" ");
		  
		  }
		  for(int k=i;k<=5;k++){
			  System.out.print((char)(a+i-1)+" ");
			  a++;
		  }System.out.println();
	  }
		              	break;		  
			case 11 :for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++){
				System.out.print("*"+" ");
			}System.out.println();
		}
			         break;		  
			case 12 :for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(i+" ");
				
			}System.out.println();
		}
			         break;		  
			case 13 :char b = 'A';
	                for(int i=1;i<=5;i++){
		
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print((char)(int)((b)+i-1)+" ");
			
		}System.out.println();
	} 
			          break;		  
			case 14 :for(int i=5;i>=1;i--){
			         for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}System.out.println();
		}
	            		break;		  
			case 15 :for(int i=1;i<=5;i++){
			           for(int j=5;j>=i;j--){
				System.out.print(j+" ");
			}System.out.println();
		}
			         break;		  
			case 16 :for(int i=5;i>=1;i--){
		                for(int j=5;j>=i;j--){
			   System.out.print(j+" ");
		   }System.out.println();
	   }
		           	break;		  
			case 17 :int d = 1;
		             for(int i=1;i<=5;i++){
			 for(int j=1;j<=i;j++){
				System.out.print(d+" ");
				d++;
			}System.out.println();
			
		}
			         break;		  
			case 18 :for(int i=5;i>=1;i--){
			int e=65;
			for(int j=1;j<=i;j++){
				System.out.print((char)(e+j-1)+" ");
			}System.out.println();
		}
			          break;		  
					  
            default : System.out.println("Invalid input");
				  
		}
	}
}