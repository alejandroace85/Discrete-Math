//libary arraylist array and list
import java.util.*; 
  
class Exercise2 { 
  
    // Function to print the in and out degrees 
    // of all the vertices of the given graph 
	   static void InandOutDegree(List<List<Integer>> adjList, int n)  { 
		   //Assign in degree and Out degree
	        int inDegree[] = new int[n]; 
	        int outDegree[] = new int[n]; 
	  
	        //lopps 
	        for (int i = 0; i < adjList.size(); i++) { 
	  
	        	//declare index to get adj 
	            List<Integer> list = adjList.get(i); 
	            //loop the degree of size and get
	            if(list.size() ==1  && list.get(0) == -1) {
	            	//condition for out degree
	                outDegree[i] = 0;
	            } 
	            //out degree else statement 
	            else {
	            	
	                outDegree[i] = list.size();  
	            }
	            //loop the j
	            for (int j = 0; j < list.size(); j++) { 
	                     
	            	//condition for in degree
	                    if(list.get(j) != -1){
	                    	
	                        inDegree[list.get(j)]++;
	                   }
	               }
	        } 
	        
	        //Output Node 
           System.out.println("Node \t  In   \t      Out ");
	        for (int z = 0; z < n; z++) { 
	           //output indegree and out degree and created table
	            System.out.println((z+1) + "\t  " + inDegree[z] + "\t\t" + outDegree[z]);
	            
	            System.out.println("-------------------------");
	        }
	   
	    }
        
    // Main method
    public static void main(String args[]) { 
        //Create array list adj
        List<List<Integer>> adjList = new ArrayList<>(); 
  
        //create arraylist node
        List<Integer> Node = new ArrayList<Integer>(Arrays.asList(-1)); 
       
        // node 1 edge 2,4 and 8 
        Node = new ArrayList<Integer>(Arrays.asList(2,4,8)); 
        //addNode
        adjList.add(Node); 
  
        // node 3 edge 6,4 but change to get correct degree in and out
        Node = new ArrayList<Integer>(Arrays.asList(3,7)); 
        //addNode
        adjList.add(Node); 
  
        // node 4 edge 5 but change 6 and 1 to get correct degree in and out
        Node =  new ArrayList<Integer>(Arrays.asList(6,1)); 
        //addNode
        adjList.add(Node); 
  
        // node 5 edge 0
        Node = new ArrayList<Integer>(Arrays.asList(5)); 
        //addNode
        adjList.add(Node); 
        //node 6 0 edge but negative 1 to output the correct degree
        Node = new ArrayList<Integer>(Arrays.asList(-1)); 
        //addNode
        adjList.add(Node);
        //node 7 0 edge but negative 1 to output the correct degree
        Node = new ArrayList<Integer>(Arrays.asList(-1));
        //addNode
        adjList.add(Node);
        //node 8 0 edge but negative 1 to output the correct degree
        Node = new ArrayList<Integer>(Arrays.asList(-1)); 
        //addNode
        adjList.add(Node);
        //node 9 0 edge but negative 1 to output the correct degree
        Node = new ArrayList<Integer>(Arrays.asList(-1)); 
        //addNode
        adjList.add(Node);
  
        // node 9 has edge 9
        Node = new ArrayList<Integer>(Arrays.asList(9)); 
        //addNode
        adjList.add(Node); 
          
    	//print for final result method
        InandOutDegree(adjList, 10); 
    }//end main
}//end program