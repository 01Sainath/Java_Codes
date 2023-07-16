public class App {
    public static void main(String[] args) throws Exception {
        graph g = new graph(5);

        g.addNode(10);
        g.addNode(20);
        g.addNode(30);
        g.addNode(40);
        g.addNode(50);

        g.addEdge(0,1);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,4);

        System.out.println("Visited Nodes are:-");
        g.bfs();
    }
}
