package algorithms;

public class mooresVotingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,2};
		
		System.out.println(majorityElement(arr));
	}

	private static int majorityElement(int[] arr) {
		// TODO Auto-generated method stub
		int ansIndex=0;
		int count=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[ansIndex]) {
				count++;
			}
			else
				count--;
			if(count==0) {
				ansIndex=i;
				count=1;
			}
		}
		int counter=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==arr[ansIndex])
				counter++;
		}
		
		if(counter>arr.length/2)
			return arr[ansIndex];
		return -1;
	}

}
