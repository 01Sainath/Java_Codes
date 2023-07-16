
class employee 
	{
		private String name;
		private int salary;
		
		// Setters
		public void setSalary(int s) {
			salary = s;
		}
		
		public void setName(String n) {
			name = n;
		}	
		
		//Getters
		public int getSalary() {
			return salary;
		}
		
		public String getName() {
			return name;
		}	
		
	}
public class encapsulation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee insane = new employee();
		
//		insane.salary = 2000;
		insane.setName("Sai");
		insane.setSalary(1000000);
		System.out.println(insane.getName());
		System.out.println(insane.getSalary());
		
	}

}
