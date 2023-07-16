
public class nearestGreaterToRightBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[]= {1,3,0,0,1,2,4};
		
		int ans[]= new int[Arr.length];
		ans[ans.length-1]=-1;
		
		for(int i=0; i<Arr.length-1; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i]<Arr[j]) {
					ans[i]=Arr[j];
					break;
				}
			}
		}
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
