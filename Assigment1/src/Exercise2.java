package Assigment1.src;

public class Exercise2 {
//If A = {1,2,3} and B = {2,3,4,5} Find A difference B 

public static void main(String[] args) {

    //declaring variables arrays
    int A[] = {1, 2, 3};
    int B[] = {2, 3, 4, 5};
    //adding temp the array between A and B 
    int temp[] = new int [A.length + B.length];
 
    int counter = 0;

    //1rst nested loop using for loop condition double points
    for (int i : A) {
        //declaring boolean flag
        boolean flag= false;
        for (int j : B) {
            if (i == j) {
                flag = true;
                //break to cancelled the same elements to find different
                break;
            }
        }
        //condition flag boolean to count element to avoid logic error 
        if (!flag) {
            temp[counter++] = i;
        }
    }
    //another for loop using a coffe method A=B B=A
    //secound nested loop
    for (int itwo : B) {
        //declaring boolean flag
        boolean flag2 = false;
        for (int value : A) {
            //condition same
            if (itwo == value) {
                flag2 = true;
                break;
            }
        }
        //condition flag boolean to count element to avoid logic error 
        if (!flag2) {
            temp[counter++] = itwo;
        }
    }

     //declaring variables for diference to find difference results
    int differences[] = new int[counter];
    for (int i = 0; i < counter; i++) {
        differences[i] = temp[i];
    }

     //final print output with another for loop to find difference value and final result
    System.out.print("Difference of A and B is: ");
    for (int i = 0; i < differences.length; i++) {
    System.out.print(differences[i] + " ");
    }

    }//end class
}//end program
