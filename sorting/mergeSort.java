package sorting;

import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	      
	      int N=input.nextInt();
	      
	      int[] A=new int[N];
	      for(int i=0; i<N; i++){
	    	  A[i]=input.nextInt();
	      }
		
	    mergesort(A,0,N-1);
		
		for(int i=0; i<N; i++) {
			System.out.print(A[i]+" ");
		}
	}

	private static void mergesort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
		
		mergesort(arr,left,mid);
		mergesort(arr,mid+1,right);
		merge(arr,left,mid,right);
		
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1=mid-left+1;
		int n2=right-mid;
		
		int leftArr[]=new int[n1];
		int rightArr[]=new int[n2];
		
		for(int i=0; i<n1; i++) {
			leftArr[i]=arr[left+i];
		}
		for(int i=0; i<n2; i++) {
			rightArr[i]=arr[mid+1+i];
		}
		
		int i=0; int j=0; int k=left;
		
		while(i<n1 && j<n2) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				k++;i++;
			}
			else {
				arr[k]=rightArr[j];
				k++;j++;
			}	
		}
		
		while(i<n1) {
			arr[k]=leftArr[i];
		}
		
		while(j<n2) { 
			arr[k]=rightArr[j];
		}
	}
	
}
