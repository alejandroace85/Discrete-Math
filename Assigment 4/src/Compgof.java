public class Compgof{
  
    public static void formFunctiongof() {
        int[]A = {1,2,3,4};
        int[]B = {5,6,7};
        int[]C = {8,9,10,11};
        
        int one = 0;
        int two= 1;
        
        int f[][] = new int[A.length + B.length][A.length + B.length];
        int g[][] = new int[B.length + C.length][B.length + C.length];
        int gof[][] = new int[A.length + B.length][A.length + B.length];
        int result[] = new int [4];
        int y = 0;
        int s = 0;
  
    
        for (int i = 0; i < A.length; i++) {
           
  
                
                gof[one][i] = f[two][i];
                result[s] = g[two][y];
                
                gof[two][s] = result[s];
                // print results
                if(gof[one][i] == 4 && gof[two][s] == 10){
                  
                  result[s] = 7;
                }
                
             
                gof[two][s] = result[s];
              
                System.out.print ( "(" + gof[one][i] + "," + gof[two][s] +") ");
               
            }
        } //end function


   
       
  
    public static void main(String[] args) {
       System.out.print("result gof: "); formFunctiongof();
       
    }
}
