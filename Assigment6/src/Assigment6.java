import java.util.*;
public class Assigment6 { //Exercise1
//method for edge line
static void assiglineEdge(ArrayList<ArrayList<Integer> > adj, int i, int j) {
    //adding and get assign adjancent
      adj.get(i).add(j); 
      adj.get(j).add(i);
}

//graph method
static void Graph(List<List<Integer>> adjList) {
for (int i = 0; i < adjList.size(); i++) {

//ouyput node with sum 1 becuase start with zero		
System.out.print("Node " + (i+1));

//counting to get node 
for (int j = 0; j < adjList.get(i).size(); j++) {

System.out.print(" -----> " + "edge " + adjList.get(i).get(j));
}
//space to prevent mix output
System.out.println();
  }
}//end method static

// Main method
public static void main(String[] args) {

        //Create arraylist Adj for number 10 of Node list
        List<List<Integer> > adjList = new ArrayList<List<Integer> >(10);

        //Create arraylist for Node or Vertex
        List<Integer> Node = new ArrayList<Integer>(Arrays.asList(0)); 

        //Node 1 has edge 2,4,8
        Node = new ArrayList<Integer>(Arrays.asList(2,4,8)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node); 

        //  Node 2 has edge 3,7
        Node = new ArrayList<Integer>(Arrays.asList(3,7)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node); 

        // vertex 4 has edge 5
        Node =  new ArrayList<Integer>(Arrays.asList(4, 6)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node); 
        // Vertex 5 has edge 4
        Node = new ArrayList<Integer>(Arrays.asList(5)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node); 
        //Vertex 6 no edge
        Node = new ArrayList<Integer>(Arrays.asList(0)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node);
        //Vertex 7 no edge
        Node = new ArrayList<Integer>(Arrays.asList(0)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node);
        //Vertex 8 no edge
        Node = new ArrayList<Integer>(Arrays.asList(0)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node);
        //Vertex 9 no edge
        Node = new ArrayList<Integer>(Arrays.asList(0)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node);
        // Node 9 have edge loop 
        Node = new ArrayList<Integer>(Arrays.asList(9)); 
        //this assign to keep using edge cross with node in Order
        adjList.add((ArrayList<Integer>)Node); 


       //print for final result method
         Graph(adjList);
   }//end main
}//end program


