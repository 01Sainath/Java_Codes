package sorting;

public class selectionSort {
	
	public static void selection(int arr[], int size) {
		for(int i=0; i<size-1; i++) {
			int min=i; 
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,5,4,1,7,6,9,2,4,3,5,7,5,76,8,6,4,8,2,4,56,7,5,4,3,2,2,11,1,};
		selection(A,A.length);
		for(int res: A)
			System.out.print(res+" ");
	}

}
