
public class duplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,1,1,2,2,3,3,4,5,5};
		int n= A.length;
		int k =0;
//		for(int i=0; i<n; i++) {
//			if(A[i]!=A[k]) {
//				k=k+1;
//				A[k] = A[i];
//			}
//		}
//		System.out.println(k+1);
		
		//    or
		
		for(int i=A[0]; i<=A[n-1]; i++) {	
			if(i<=A[n-1]) {
				A[k] = i;
				k = k+1;
			}
		}
		System.out.println(k);
		
		for(int i=0; i<n; i++) {
			System.out.print(A[i]);
		}
	}

}
