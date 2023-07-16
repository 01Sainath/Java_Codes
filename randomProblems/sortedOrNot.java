package randomProblems;

public class sortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,6,4,5};
		
		int counter = 1;
		for(int i=1; i<A.length; i++) {
			if(A[i]>=A[i-1]) {
				counter++;
			}
			else
				break;
		}
		
		if(counter==A.length)
			System.out.println("Sorted.");
		else
			System.out.println("Unsorted.");
	}

}
