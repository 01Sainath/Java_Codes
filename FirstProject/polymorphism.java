class Rectangle{
	public int calArea(int length, int width) {
		return length*width;
	}
}

class Square extends Rectangle{
	public int calArea(long length, long width){
		return (int) Math.pow(length,2);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sqr = new Square();
		
		System.out.println(sqr.calArea(8,4));
	}

}
