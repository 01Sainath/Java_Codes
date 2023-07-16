package greedyAlgorithm;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class kruskalsAlgorithm {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int nodes = input.nextInt();
        int edges = input.nextInt();

        ArrayList <edge> graph = new ArrayList<>();

        int s,d,w;
        for(int i=0; i<edges; i++){
            s = input.nextInt();
            d = input.nextInt();
            w = input.nextInt();

            graph.add(new edge(s,d,w));
        }

        ArrayList <edge> res = kruskals(graph, nodes);
        
        for(edge ele: res)
            System.out.println(ele.src+" "+ele.dest);
    }

    static ArrayList<edge> kruskals(ArrayList<edge> graph, int n){
        int vertexSet[] = new int[n];
        for(int i=0; i<n; i++)
            vertexSet[i]=i;
        
        graph.sort(new Comparator<edge>() {
            @Override
            public int compare(edge e1, edge e2){
                return e1.wt-e2.wt;
            }
        });

        ArrayList <edge> result = new ArrayList<>();
        int count=0,i=0;
        while(count<n-1){
            edge currEd = graph.get(i);
            int uset = getSet(currEd.src, vertexSet);
            int vset = getSet(currEd.dest, vertexSet);

            if(uset != vset){
                result.add(currEd);
                count+=1;
                vertexSet[vset] = uset;
            }

            i+=1;
        }

        return result;

    }

    private static int getSet(int node, int[] vertexSet) {
        if(node == vertexSet[node])
            return node;
        return getSet(vertexSet[node], vertexSet);
    }
}

class edge{
    int src;
    int dest;
    int wt;
    edge(int u, int v, int w){
        src=u;
        dest=v;
        wt=w;
    }
}
