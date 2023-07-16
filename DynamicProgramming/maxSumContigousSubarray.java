
public class maxSumContigousSubarray {

    public static void main(String[] args){

        int arr[] = {10,-20,35,40,10,-10,100,-50};
        int n = arr.length;

        int max = 0;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];

                if(sum>max)
                    max=sum;
            }
        }

        System.out.println(max);
    }

}
