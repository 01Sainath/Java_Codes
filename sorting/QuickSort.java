package sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		int arr[]=new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]=input.nextInt();
		}
		
//		for(int res: A)
//			System.out.print(res+" ");
		
		quickSort(arr,0,N-1);
		
		for(int res: arr)
			System.out.print(res+" ");
	}

	public static void quickSort(int[] arr, int lb, int ub) {
		// TODO Auto-generated method stub
		if(lb<ub)
		{	
		
		int pivotIndex=findPivot(arr,lb,ub);
			
		quickSort(arr,lb,pivotIndex-1);
		quickSort(arr,pivotIndex+1,ub);
		}
	}

	public static int findPivot(int[] arr, int lb, int ub) {
		// TODO Auto-generated method stub
		int pivot=arr[ub];
		int i=lb-1;
		
		for(int j=lb; j<ub; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[ub]=temp;
		return i;
	}

}
