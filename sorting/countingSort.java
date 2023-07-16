package sorting;

public class countingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {8,6,3,9,5,4,7,2,1,0};
		int n=A.length;
		
		int max=A[0];
		for(int i=1; i<n; i++) {
			if(A[i]>max)
				max=A[i];
		}
		
		counting(A,n,max);
		
		for(int res:A)
			System.out.print(res+" ");
	}

	private static void counting(int[] A, int n, int max) {
		// TODO Auto-generated method stub
		int count[]=new int[max+1];
		
		for(int i=0; i<n; i++) {
			count[A[i]]++;
		}		
		
		for(int i=1; i<count.length; i++) {
			count[i]=count[i]+count[i-1];
		}
		
		int result[]=new int[n];
		
		for(int i=n-1; i>=0; i--) {
			int index=count[A[i]];
			result[index-1]=A[i];
			count[A[i]]--;
		}
		
		for(int i=0; i<n; i++) {
			A[i]=result[i];
		}
	}

}
