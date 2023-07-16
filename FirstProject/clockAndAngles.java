import java.util.Scanner;

public class clockAndAngles {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		while(T-->0) {
			
			int h,m; 
			h=sc.nextInt();
			m=sc.nextInt();
			
			if (h==12)
				h=0;
			if (m==60)
				m=0;
			
			int hAngle,mAngle,sAngle;
			
			hAngle= (h*30)+(m/2);
			mAngle= 6*m;
			
			if(hAngle>mAngle)
				sAngle=hAngle-mAngle;
			else
				sAngle=mAngle-hAngle;
			
			if (sAngle>180)
				sAngle=360-sAngle;
			
			System.out.println(sAngle);
			
		}

	}

}
