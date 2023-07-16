package graph;

class Node {
	int data;
	boolean visited;
	Node(int data){
		this.data=data;
		visited=false;
	}	
}
public class Graph {
	private Node nodeList[];
	private int adjMatrix[][];
	private int numberNode;
	
	Graph(int size){
		nodeList = new Node[size];
		adjMatrix = new int[size][size];
		numberNode=0;
	}
	
	void addNode(int element) {
		nodeList[numberNode++]=new Node(element);
	}
	
	void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	private void printNode(int index) {
		System.out.println(nodeList[index].data);
	}
	
	void dfs(int index) {
		nodeList[index].visited=true;
		printNode(index);
		int node1;
		while((node1 = getAdjVisitedNode(index)) != -1) {
			dfs(node1);
		}
	}
	
	void dft() {
		for(int i=0; i<numberNode; i++) {
			if(nodeList[i].visited == false) {
				dfs(i);
			}
		}
	}

	private int getAdjVisitedNode(int index) {
		// TODO Auto-generated method stub
		
		for(int j=0; j<numberNode; j++) {
			if(adjMatrix[index][j]==1 && nodeList[j].visited==false) {
				return j;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		Graph g = new Graph(8);
		g.addNode(50);
		g.addNode(10);
		g.addNode(200);
		g.addNode(20);
		g.addNode(15);
		g.addNode(30);
		g.addNode(5);
		g.addNode(300);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 3);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(5, 7);
		g.addEdge(5,6);
		g.addEdge(6,7);
		
		g.dfs(0);
	}
	
}
