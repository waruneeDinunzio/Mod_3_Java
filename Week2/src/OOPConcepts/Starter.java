package OOPConcepts;

public class Starter {

	public static void main(String[] args) {
		// Making Student Objects
		
		Student student1 = new Student(101, "Vegeta", 99, 'M', 100.0, 98.5, 99.0);
		
		// This display method is being called from our Student class
		student1.display();
		student1.studentDisplay();
		student1.getAverage();
	}

}
