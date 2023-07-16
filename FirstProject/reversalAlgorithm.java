
public class reversalAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {0,1,2,3,4,5,6,7,8,9,10}; 
	        reverse(0,4,arr);

	    }
	    static void reverse(int a,int b,int arr[]){

	        for (int i = a; i < b; i++)
	        {

	            int tempswap = arr[i];
	                arr[i] = arr[b]; 
	                arr[b] = tempswap; 
	                b--;

	        }
	        for (int i = 0; i < arr.length; ++i)
	            System.out.print(arr[i] + " ");
		
	}

}
