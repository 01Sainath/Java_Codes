class Node {
    int data;
    boolean visitedOrNot;
        Node(int data){
        this.data=data;
        this.visitedOrNot=false;
        }
}
class queue {
    static Stack <Integer> s1 = new Stack<>();
    static Stack <Integer> s2 = new Stack<>();

    static boolean isEmpty(){
        return s1.isEmpty();
    }

    static void enqueue(int data){
        if(!s1.isEmpty()){
            s1.push(data);
            return;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return;
    }

    static int dequeue(){
        if(isEmpty()){
            return -1;
        }

        return s1.pop();
    }

    static int peek(){
        if(isEmpty()){
            return -1;
        }

        return s1.peek();
    }

}

public class graph {

    private Node[] nodeList;
    private int [][] adjMatrix;
    private int numberNode;
    private queue q;

    graph(int size){
        int maxNodes = size;
        nodeList = new Node[maxNodes];
        adjMatrix = new int[maxNodes][maxNodes];
        numberNode=0;
        q = new queue();
    }

    void addNode(int element){
        nodeList[numberNode++] = new Node(element);
    }

    void addEdge(int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    private void printNode(int index){
        System.out.println(nodeList[index].data);
    }

    private int getAdjUnvisited(int node){
        for(int j=0; j<numberNode; j++){
            if(adjMatrix[node][j] == 1 && nodeList[j].visitedOrNot==false){
                return j;
            }
        }

        return -1;
    }

    void bfs(){
        nodeList[0].visitedOrNot = true;
        printNode(0);
        q.enqueue(0);
        int node1;
        while(!q.isEmpty()){
            int node2 = q.dequeue();
            while((node1 = getAdjUnvisited(node2)) != -1){
                nodeList[node1].visitedOrNot = true;
                printNode(node1);
                queue.enqueue(node1);
            }
        }
    }

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
