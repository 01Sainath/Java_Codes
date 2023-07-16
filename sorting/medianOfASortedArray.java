package sorting;

import java.util.Scanner;

public class medianOfASortedArray {
	public static void main(String args[]){
	      
	      Scanner input=new Scanner(System.in);
	      
	      int N=input.nextInt();
	      
	      int A[]=new int[N];
	      for(int i=0; i<N; i++){
	        A[i]=input.nextInt();
	      }
	      
	      bubbleSort(A,A.length);
	      
	      int mid=(0+(N-1))/2;
	      
	      System.out.println(A[mid]);
	    }
	    
	    public static void bubbleSort(int arr[],int n){
	      for(int i=0; i<n; i++){
	        for(int j=0; j<n-1; j++){
	          if(arr[j]>arr[j+1]){
	            int temp=arr[j];
	            arr[j]=arr[j+1];
	            arr[j+1]=temp;
	          }
	        }
	      }
	    }
}
