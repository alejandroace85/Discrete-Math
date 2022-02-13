public class compfog {
    
    public static void formFunctionfog() {
        int[]A = {1,2,3,4};
        int[]B = {5,6,7};
        int[]C = {8,9,10,11};
        
        int one = 0;
        int two = 1;
        int result[] = new int [4];
        int f[][] = new int[A.length+B.length][A.length+B.length];
        int g[][] = new int[B.length+C.length][B.length+C.length];
        int fog[][] = new int[A.length+B.length][B.length+C.length];

  
    
        for (int i = 0; i < B.length; i++) {
           
                int y = 1;
                int s = 0;
                fog[one][i] = g[one][i];
                result[s] = f[two][y];
                
                
                // print results
                if(result[s] == g[one][s]){
                    
                  fog[two][s] = result[s];
                }
                fog[two][s] = result[s];
                System.out.print ( "( " + fog[one][i] + "," + fog[two][s] +" )");
            }
        } //end function

        public static void main(String[] args) {
            System.out.print("result fog: "); formFunctionfog();
           
        }
}
