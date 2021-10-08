package method_overriding;
import java.util.Scanner;
/*
 * Tasks:
Make an Employee class. Make it a child class of Person.
Inside Employee class. Make extra methods and properties that relates to what an employee would have.
Create a constructor similar to Student class. Don’t forget to call your super() powers :wink:
For example, employee should have a salary and an employee ID. Maybe have a method that creates an address (Aheem HINT)
Display method anyone? Maybe calculate method (overriding)? Inside calculate method add maybe some bonuses, be generous to your employee
 */
public class Employee extends Person {
	int employee_id;
	String department;
	double salary, bonus;
	Address addr;
	
	Employee(int id, String name, int age, char gender,String department, double salary, double bonus ){
	super(name,age,gender);
	this.employee_id = id;
	this.department = department;
	this.salary = salary;
	this.bonus = bonus;
	
	}
	
	public void createAddress() {
		addr = new Address();
		addr.street = "30 webster st.";
		addr.city = "Boston";
		addr.state = "MA";
		addr.zipcode = 02446;
	}
	
	public void Hello() {
		System.out.println("Good Morning from emplyee class!");
	}
	
	public double calculate() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years you're been with the company");
		int years = input.nextInt();
		bonus = (salary*.015)*years;
		return bonus;
	}
	public void display() {
		
		super.display();
		System.out.println("Id: " + this.employee_id);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary);
		System.out.println("Bonus: " + this.calculate());
		
		System.out.println(addr.street);
		System.out.println(addr.city);
		System.out.println(addr.state);
		System.out.println(addr.zipcode);
		System.out.println();
	}
}
