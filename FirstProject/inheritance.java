import java.util.*;

public class inheritance {

	static class employee {
		int salary;
		String name;
		
		employee (int salary, String name) {
			this.salary = salary;
			this.name = name;
		}
		
		public int getSalary() {
			return salary;
		}
	}
	
	static class programmer extends employee {
		programmer(int salary, String name, int bonus) {
			super(salary, name);
			this.bonus = bonus;
		}

		int bonus;
		
		public int getBonus() {
			return bonus;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp = new employee(10, "Sainath");
		programmer pro = new programmer(10, "Ibitwar", 1);
		
		System.out.println(emp.name);
		System.out.println(pro.getSalary());
		System.out.println(pro.getBonus());
		
	}

}
