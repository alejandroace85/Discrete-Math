public class Exercise2 {
   public static void main(String[] args) {
      //varlable same previous exercise uncluding H
    int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int B[] = { -1, 11, 10, 13, -4, 6, 99, -8, 20, -2 };
    int H[][] = {{1,5,10}, {11,-2,8}};
    int M[][] = new int [A.length] [B.length];
    //declaring variables
    int x =0;
   int e = 0;
   int j = 1;
   int counter = 0;
   int flag = 1;
   //print 
   System.out.print ("Relation H are: ");
           //determine relation using nested loop
        for (int a = 0; a <3; a++) {
           System.out.print("(" + H[e][a] + ", " + H[j][a] +") "); 
            for(int i = 0; i< M.length; i++) {
               for(int l = 0; l < M.length; l++) {
                  for(int y=0; y<M.length; y++) {
                     if(H[e][a] == M[x][l] && H[j][a] == M[a][y]){
                        //add counter to repeat relation
                                 counter++;
                       }
                     }
                    //flag outside for repeat number.
                   flag++;
                  }
                  //create if statement for result relation was not related result blank.
               if(counter < flag) {

              System.out.print (" ");
             }    
    }
   }
  }//end main
}//end class
