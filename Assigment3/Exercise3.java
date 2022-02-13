public class Exercise3 {  

    public static void main(String[] args) {
        //relation
     int[] A = {0,1,2,3,4,5,6,7,8,9};
     int[] B = {-1,11,10,13,-4,6,99,-8,20,-2};
     int M[][] = new int [A.length] [B.length];
     int[][] F ={{0,1,2,3,4,5,6,7,8,9}, {-1,13,99,-2,-8,10,-1,-1,-8,6}};
 
//declaring variable for Relations


//nested loop for relations
System.out.print ("Relation F are: ");
for (int i = 0; i < A.length; i++) {
  for (int j = 0; j < B.length; j++) {
    //declaring variable for functions
    int a = 0;
    int b = 1;
    int x =0;
      int y = 1;
      M[x][i] = A[i];
      M[y][j] = B[j];
      
      // print results
      if(M[x][i] == M[x][j] && M[y][i] == M[y][j]){
          
      System.out.print("(" + M[x][i] + ", " + M[y][j] + ") ");
     
                }
              }
      
           }

System.out.println();
//functons A->B if is a relation F (not complete)
//relations
for (int i = 0; i <10; i++) {

 for(int p = 0; p< M.length; p++) {

     for(int s = 0; s < M.length; s++) {

        if(F[a][i] == M[a][p] && F[b][i] == M[b][s]) {
         
            System.out.print ("(" + F[a][i] + ", " + F[b][i] +") ");
           
                    break;

                

              }

           }  
     
      }
    }
    System.out.println();
         System.out.println("Are not related");

    }//end main
}//end program
