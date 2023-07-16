package greedyAlgorithm;

import java.util.*;

public class sortAccordingToKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		node arr[] = new node[n];

		int f,s;
		for(int i=0; i<n; i++){
			f = input.nextInt();
			s = input.nextInt();
			arr[i] = new node(f,s);
		}

		// Arrays.sort(arr, new Comparator<node>(){
		// 	@Override
		// 	public int compare(node v1, node v2){
		// 		if(v1.t == v2.t)
		// 			return v1.fv - v2.fv;
		// 		else
		// 			return v1.t - v2.t;
		// 	}
		// });

		Arrays.sort(arr, (v1, v2) -> {
			if(v1.t == v2.t)
					return v1.fv - v2.fv;
				else
					return v1.t - v2.t;
		});

		for(int i=0; i<n; i++){
			System.out.println(arr[i].fv+" + "+arr[i].sv+" = "+arr[i].t);
		}
	}

	static class node{
		int fv;
		int sv;
		int t;
		node(int f, int s){
			fv=f;
			sv=s;
			t=f+s;
		}
	}

}
