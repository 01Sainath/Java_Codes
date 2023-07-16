
public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,4,3,2,1};
		int counter=0;
		
		for(int numbers: arr) {
			System.out.println(numbers+" "+counter);
			counter++;
		}
	}

}
