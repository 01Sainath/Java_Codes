package recursion;

public class gridPaths {
	public static int grid_Paths(int n,int m) {
		if(n==1 || m==1)
			return 1;
		else
			return grid_Paths(n,m-1) + grid_Paths(n-1,m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(grid_Paths(3,3));
	}

}
