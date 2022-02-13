public class comphogof {

    public static void hogof(){

        int[]A = {1,2,3,4};
        int[]B = {5,6,7};
        int[]C = {8,9,10,11};

        int one =0;
        int two = 1;
        int result[] = new int[4];
        int f[][] = new int[A.length+B.length][A.length+B.length];
        int g[][] = new int[B.length+C.length][B.length+C.length];
        
        int hogOf[][] = new int [A.length +B.length] [A.length +B.length];
        int y=0;
        int s=0;

        for(int x = 0; x < A.length; x++){

               hogOf[one][x] = f[one][x];
               result[s] = g[two][y];

               if(result[s] == g[one][x]) {

                hogOf[two][s] = result[s];
               }

               System.out.print("(" + hogOf[one][x] + "," + hogOf[two][s]+ ") ");

        }

    }
    public static void main(String[] args) {
        System.out.print("result (hog)of: "); hogof();
       
    }
}
