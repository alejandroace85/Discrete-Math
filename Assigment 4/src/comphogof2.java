public class comphogof2 {

    public static void hogof2(){

        int[]A = {1,2,3,4};
        int[]B = {5,6,7};
        int[]C = {8,9,10,11};

        int dOne =0;
        int dTwo = 1;
        int Gtemp[] = new int[4];
        int f[][] = new int[A.length+B.length][A.length+B.length];
        int g[][] = new int[B.length+C.length][B.length+C.length];
        
        int hogOf[][] = new int [A.length +B.length] [A.length +B.length];
        int y=0;
        int s=0;

        for(int x = 0; x < B.length; x++){

               hogOf[dOne][x] = f[dOne][x];
               Gtemp[s] = g[dTwo][y];

               if(Gtemp[s] == g[dOne][x]) {

                hogOf[dTwo][s] = Gtemp[s];
               }

               System.out.print("(" + hogOf[dOne][x] + "," + hogOf[dTwo][s]+ ") ");

        }
    }

    public static void main(String[] args) {

        System.out.print("result ho(gof): "); hogof2();
  
    }
}