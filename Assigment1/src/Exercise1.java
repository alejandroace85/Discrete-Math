package Assigment1.src;

public class Exercise1 {
//1. Let A = {1,2} B = {x|x^3 - 6x^2 + 11x = 6} Write a program to determine whether A subsets B.
    public static void main(String[] args) {
          
        //declaring variable arrays to determine A subsets B
        int [] A = {1,2};
        int [] B = {1,2,3};  // x|x^3 - 6x^2 + 11x = 6 calculating using factor
        int [] Subsets = new int [A.length + B.length]; //declaring subsets for addition a + b array 
    
        //im using nested loops for finding subsets
        System.out.print("The Subset for A or B is ");
        for (int i = 0; i < A.length; i++) {
    
          for (int j = 0; j < B.length; j++) {
    
              //Using if statement for the result.
              if (A [i] == B [j]) {
                  Subsets[i] = B[i];
                  //Print the subets betweem A and B  
                  System.out.print(Subsets[i] + " ");
                  
              } 
            }
        }
       } // end class
    } //end program
