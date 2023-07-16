
public class classAndObjects {

	public static void main(String[] args) {
		
		class Employee {
			String name;
			float salary;
			float bonus;
			
		public Employee(String n, float s, float b) {
			
			name=n;
			salary=s;
			bonus=b;
		}
		}
		
		Employee emp = new Employee("Sainath",100000.0f,1000.0f);
		
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.bonus);

		

	}

}
