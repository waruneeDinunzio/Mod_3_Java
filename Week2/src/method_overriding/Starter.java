package method_overriding;
public class Starter {

	public static void main(String[] args) {
		// Making Student Objects
		
		Student student1 = new Student(101, "Vegeta", 99, 'M', 100.0, 98.5, 99.0);
		
		// This display method is being called from our Student class
		student1.display();
		
		Employee employee1 = new Employee(111,"warunee", 19,'F',"minister of magic",75000,0);
		employee1.display();
	}

}
