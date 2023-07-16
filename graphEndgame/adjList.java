import java.util.*;
public class adjList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nodes = input.nextInt();
        int edges = input.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0; i<nodes; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<edges; i++){
            int u = input.nextInt();
            int v = input.nextInt();

            addEdges(adjList,u,v);
        }

        for(int i=0; i<nodes; i++){
            System.out.print("The adjacency List of "+i+" is ");
            System.out.println(adjList.get(i));
        }
    }

    private static void addEdges(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}
