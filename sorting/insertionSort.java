package sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {5,4,10,1,6,2};
		printArray(A,A.length);
		insertion(A,A.length);
		System.out.println();
		printArray(A,A.length);
	}
	
	private static void insertion(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<n; i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void printArray(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
