package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class sortAnArrayByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		int A[]=new int[N];
		for(int i=0; i<N; i++) {
			A[i]=input.nextInt();
		}
		
		ArrayList<Integer> list= new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int a=A[i];
			list.add(a);
		}
		
		sort(list);
		for(int i=0; i<N; i++) {
			System.out.print(list.get(i)+" ");
		}
	}

	public static void sort(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		if(list.size()==1)
			return;
		
		int temp= list.get(list.size()-1);
		list.remove(list.size()-1);
		sort(list);
		insert(list,temp);
	}

	public static void insert(ArrayList<Integer> list, int temp) {
		// TODO Auto-generated method stub
		if(list.size()==0 || list.get(list.size()-1)<=temp) {
			list.add(temp);
			return;
		}
		int val=list.get(list.size()-1);
		list.remove(list.size()-1);
		insert(list,temp);
		list.add(val);
		
		return;
	}

}
