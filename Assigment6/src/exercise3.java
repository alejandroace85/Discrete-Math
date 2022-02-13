//libary arraylist array and list
import java.util.*;
	
public class exercise3 {

	//method Isolated Vertex or Node (disconnect)
	  static void Isolatedvertex(List<List<Integer>> isolatedVertex) { 
		  
		  //assign Node disconnected the edge
	        int IsolatedNode = 0;
	        //loop for find isolated node
	        for (int i = 0; i < isolatedVertex.size(); i++) { 
	 
	        	//declaring list for index to find isolated
	            List<Integer> list = isolatedVertex.get(i); 
	            //control flow can use Or and ANd condiction still the same
	            if(list.size() == 1 || list.get(0) == i){
	                IsolatedNode = i;
	            }
	             
	        } 
	  //print the final result 
	        System.out.println("The isolated node was disconnect is node " + IsolatedNode);
	    }
	  
	  //Main Method
	    public static void main(String args[]) { 
	    	   //created list adj
	        List<List<Integer>> adjList = new ArrayList<>(); 
	  
	         //create list Node array list
	        List<Integer> Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        
	        // Node 1 edge 2,4,8
	        Node = new ArrayList<Integer>(Arrays.asList(2,4,8)); 
	        //add Node
	        adjList.add(Node); 
	        //Node 2
	        Node = new ArrayList<Integer>(Arrays.asList(3,7)); 
	        //add Node
	        adjList.add(Node);
	        //Node 3 edge 4,6
	        Node =  new ArrayList<Integer>(Arrays.asList(4, 6));
	        //add Node
	        adjList.add(Node); 
	  
	        //Node 4 edge 5
	        Node = new ArrayList<Integer>(Arrays.asList(5)); 
	        //add Node
	        adjList.add(Node); 
	        //node 5 edge 0 
	        Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        //add Node
	        adjList.add(Node);
	        //node 6  edge 0
	        Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        //add Node
	        adjList.add(Node);
	        //node 7  edge 0
	        Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        //add Node
	        adjList.add(Node);
	        //node 8 edge 0
	        Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        //add Node
	        adjList.add(Node);
	        //node 9  edge 0
	        Node = new ArrayList<Integer>(Arrays.asList(0)); 
	        //add Node
	        adjList.add(Node);
	        
	        //node 9 edge 9
	        Node = new ArrayList<Integer>(Arrays.asList(9)); 
	        adjList.add(Node); 
	       
	    	//print for final result method
	        Isolatedvertex(adjList); 
	     }//end main
	   } //end program

	     
	

