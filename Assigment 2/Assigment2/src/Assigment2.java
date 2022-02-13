import java.util.Scanner; //Libary input Scanner or you can use import java.util.*;
public class Assigment2 {

    public static void main(String[] args) {
		
		//create a input with declaring input
		Scanner s = new Scanner(System.in);
			
        //Declaring size array values for A 
		System.out.print("Enter the Array size of Array1: ");
		int size1=s.nextInt();

        //Declaring size array values for B 
		System.out.print("Enter the Array size of Array2: ");
		int size2=s.nextInt();

		//Declaring size array values for C 
		System.out.print("Enter the Array size of Array3: ");
		int size3=s.nextInt();

		//Declaring Array values A, B, and C with size that you want to set the number
		int A[]= new int [size1];

		int B[]= new int [size2];

		int C[]= new int [size3];

		//declaring a loop for arrsy size 1 
		System.out.println("Enter the Array A: ");
		for(int i=0; i < size1; i++) {
			A[i]=s.nextInt();
		}
          
		//declaring a loop for arrsy size 2 
		System.out.println("Enter the Array B:");
		for(int i=0; i < size2; i++) {
			B[i]=s.nextInt();
		}
		//declaring a loop for arrsy size 3 
		System.out.println("Enter the Array C:");
		for(int i=0; i < size3; i++) {
			C[i]=s.nextInt();
		}

		//Start intersection A N C using nested loop with boolean flag for condition 
		System.out.println();
		 //boolean flag for conditions as a final result
         boolean inersect1 = false;
		System.out.print("The A intersection C is ");
		for(int i = 0; i<size1; i++)  {
		  for(int j = 0; j<size3; j++) {
     //is equal print the value for two number using C array for A
		       if(A[i]==C[j]) {
				   //creating flag for condition final results
				inersect1 = true;
			System.out.print(C[j] +" ");
			}
		  }  
	  }//end nested loop for A N C 
		
		//Second part intersections for B N C using nested loop with boolean flag			
		 System.out.println();
		 //boolean flag for conditions as a final result
		 boolean inersect2 = false;
		 System.out.print("The B intersection C is ");
			for(int i = 0; i<size2; i++)  {
			 for(int j = 0; j<size3; j++) {
		//is equal print the value for two number using C array for B
				     if(B[i]==C[j]) {
					inersect2 = true;
					System.out.print(C[j] +" ");				
			         }
			  }
       }//end nested loop for B N C 
					
		//Creating another loop the union
		 System.out.println();
	
		 boolean flag1= false;			
		System.out.print("A Union C: "); 
		//Declaring a Loop for elminitate duplicate 
			for(int i=0;i<size1;i++) {
			System.out.print(A[i]+" ");
			}
             //Declarinf nested for loop 
			for(int i = 0; i < size3; i++) {
				for(int j = 0; j < size1; j++) {
              //the if statement using flag to move another index to prevent same number 
				if(C[i] != A[j]) {
			     	flag1 = true;
				}
				//else number if the number is not equal putting break
				else {
		    	flag1 = false;
				break;
				}				
			}//end for loop j
			//create a of statement to prevent duplicates the number to get a good order with declaring C Array
	        if(flag1 == true) {
	             System.out.print(C[i]+" ");
		}//end control flow
	}//End union A U C	

		
		System.out.println();

        //Another union B N C using nested loop and boolean flag to duplicate the number  
	     boolean flag2= false;	
	 	//declaring singel loop for B union	
		System.out.print("B union C: "); 
		for(int i=0;i<size1;i++) {
			System.out.print(B[i]+" ");
			}
			//creating nested loop for merge the C values array sizes
		for(int i = 0; i < size3; i++) {
			for(int j = 0; j < size1; j++) {
				//create if statement the if the not equal declaring a flag to prevent logic error
		     		if(C[i] != B[j]) {
					flag2 = true;
				 }
				 //the else statement set flag false will create break to prevent repetitive number using manipulation array 
				   else {
					flag2 = false;
					break;
				}
				// the if statemnt another one out of nested if will print C value only  
				}
				if(flag2 == true) {
				System.out.print(C[i]+" ");
        	}
	    }//End union B U C

	//creating space
	System.out.println();


	//(A N C = B N C) AND (A U C = B U C) As a final results is equal number or not equal
	if (inersect1 == inersect2 && flag1 == flag2) {

	System.out.println("(A N C = B N C) AND (A U C = B U C) " + "Yields --> " + "A = B");
	}
	//else statement will put error depend the range algebra boolean AND is not equal 
	else {

		System.out.println("Error!");
	}//end if final results 
 }// end class
}//end program

