package sorting;

public class bubbleSort {
	
	public static void bubble(int arr[], int size) {
		
		for(int i=size-1; i>=0; i--) {
			int swapped=0;
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=1;
				}
			}
			if(swapped==0)
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5,6,7,8,9};
		bubble(A,A.length);
		for(int res: A)
			System.out.print(res+" ");
	}

}
