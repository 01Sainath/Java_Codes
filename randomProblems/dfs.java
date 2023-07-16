package randomProblems;
import java.io.*;
import java.util.*;
public class dfs {
    class Graph {
        private static int V; // No. of vertices
     
        // Array  of lists for
        // Adjacency List Representation
        private static LinkedList<Integer> adj[];
     
        // Constructor
        @SuppressWarnings("unchecked") Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }
     
        // Function to add an edge into the graph
        static void addEdge(int v, int w)
        {
            adj[v].add(w); // Add w to v's list.
        }
     
        // A function used by DFS
        static void DFSUtil(int v, boolean visited[])
        {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");
     
            // Recur for all the vertices adjacent to this
            // vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }
     
        // The function to do DFS traversal.
        // It uses recursive
        // DFSUtil()
        static void DFS(int v)
        {
            // Mark all the vertices as
            // not visited(set as
            // false by default in java)
            boolean visited[] = new boolean[V];
     
            // Call the recursive helper
            // function to print DFS
            // traversal
            DFSUtil(v, visited);
        }
     
        // Driver Code
        public static void main(String args[])
        {
            // Graph g = new Graph(4);
     
            addEdge(0, 1);
            addEdge(0, 2);
            addEdge(1, 2);
            addEdge(2, 0);
            addEdge(2, 3);
            addEdge(3, 3);
     
            System.out.println(
                "Following is Depth First Traversal "
                + "(starting from vertex 2)");
     
            DFS(2);
        }
    }
}
