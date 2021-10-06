package OOPConcepts;

public class Student extends Person {
	int id;
	double s1,s2,s3;
	
	Student(int id, String name, int age, char gender, double s1, double s2, double s3) {
		super(name,age,gender);
		
		this.id = id;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		
	}
	void getAverage() {
		double average = (this.s1 + this.s2 + this.s3)/3;
		System.out.println(super.pname + "'s average score is " + average);
	}
	void studentDisplay() {
		
		System.out.println("id: " + this.id);
		System.out.println("Subject 1: " + this.s1);
		System.out.println("Subject 2: " + this.s2);
		System.out.println("Subject 3: " + this.s3);
		}
}
