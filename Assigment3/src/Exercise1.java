
public class Exercise1 {
       public static void main(String[] args) {

        //variables A B and M array 
         int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         int B[] = { -1, 11, 10, 13, -4, 6, 99, -8, 20, -2 };
         int M[][] = new int [A.length] [B.length]; //creating cartesian m using multidimensional
     
         //nested loop to cartesian
        System.out.println("Cartesian M = AXB: ");
        for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < B.length; j++) {
            int x = 0;
            int y = 1;
              M[x][i] = A[i];
              M[y][j] = B[j];
              //print results
            System.out.print("(" + M[x][i] + ", " + M[y][j] +") "); 
            
           }
        }
    }//end main
}//end program
