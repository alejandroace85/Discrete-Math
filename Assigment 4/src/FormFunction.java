public class FormFunction {
  
    public static void formFunctionF() {

        //variables
        int[]A = {1,2,3,4};
        int[]B ={5,6,7};
       //function
        int f[][] = new int[A.length+B.length][A.length+B.length];

      
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int x = 0;
                int y = 1;
                f[x][i] = A[i];
                f[y][j] = B[j];
                
                // print results
                if(f[x][i] == f[x][j] && f[y][i] == f[y][j]){
                    
                System.out.print("(" + f[x][i] + ", " + f[y][j] + ") ");
               
                }
            }
        }

    }//end function

       
    public static void formFunctionG() {
    
        int[]B ={5,6,7};
        int[]C = {8,9,10,11};

        int g[][] = new int[B.length+C.length][B.length+C.length];

      
        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < C.length; j++) {
                int x = 0;
                int y = 1;
                g[x][i] = B[i];
                g[y][j] = C[j];
                
                // print results
                if(g[x][i] == g[x][j] && g[y][i] == g[y][j]){
                    
                System.out.print("(" + g[x][i] + ", " + g[y][j] + ") ");
                }
            }
        }

    }//end function
    public static void formFunctionH() {
       
        int[]B ={5,6,7};
        int[]C = {8,9,10,11};
        int h[][] = new int[B.length+C.length][B.length+C.length];

      
        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < C.length; j++) {
                int x = 0;
                int y = 1;
                h[x][i] = B[i];
                h[y][j] = C[j];
                
                // print results
                if(h[x][i] == h[x][j] && h[y][i] == h[y][j]){
                    
                System.out.print("(" + h[x][i] + ", " + h[y][j] + ") ");
                }
                y++;
            }
        }

    }//end function

    public static void main(String[] args) {
        System.out.print("Compsosition function f: "); formFunctionF();
        System.out.println();
        System.out.print("Compsosition function g: ");
        formFunctionG();
       
        System.out.println();
        System.out.print("Compsosition function h: ");
        formFunctionH();
    }
}
