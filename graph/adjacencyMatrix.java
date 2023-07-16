package graph;
import java.util.*;

public class adjacencyMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nodes = input.nextInt();
		int edges = input.nextInt();

		int arr[][] = new int[nodes][nodes];

		for(int i=0; i<edges; i++){
			int u = input.nextInt();
			int v = input.nextInt();
			int w = input.nextInt();

			addEdges(arr,u,v,w);
		}

		for(int i=0; i<nodes; i++){
			for(int j=0; j<nodes; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void addEdges(int[][] arr, int u, int v, int w) {
		arr[u][v] = w;
		arr[v][u] = w;
	}

}
