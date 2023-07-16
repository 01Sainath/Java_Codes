
public class arrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try 3 ways
		// take note of time complexity.
		
		// 1st approach.
		/*
		int d=2, n=6;
		
		int arr[] = {1,2,3,4,5,6};
		
		int temp[] = new int[d];
		
		for(int i=0; i<d; i++) {
			temp[i]= arr[i];
		}
		
		for(int i=0; i<n-d; i++) {
			arr[i]= arr[i+d];
		}
		int j=0;
		for(int i=n-d; i<n; i++) {
			arr[i]= temp[j++];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		// 2nd approach.
		// one by one...   
		
		int n=6, d=3;
		int arr[] = {1,2,3,4,5,6};
		
		for(int i=0; i<d; i++) {
			reverse(arr, arr.length);
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		}
			
		static void reverse(int arr[],int n) {
			int temp1 =arr[0];
			for(int i=0; i<n-1; i++) {
				arr[i] = arr[i+1];
			}
			
			arr[n-1] = temp1;

	}

}
