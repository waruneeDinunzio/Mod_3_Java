package week2_day2;

import java.util.Scanner;

//Inside new class called CreateCustomer.java
public class CreateCustomer {
	public static void main(String[] args) {
				// CHECK THIS OUT
				// Since our classes our inside our packages, it has access to each other.
		Scanner  input = new Scanner(System.in);
		System.out.println("What is your name?");
		String userName = input.nextLine();
		System.out.println("What is your email?");
		String userEmail = input.nextLine();
		System.out.println("What is your address?");
		String userAddress = input.nextLine();
		System.out.println("What is your phone number?");
		String userPhone = input.nextLine();
		
		Customer customer1 = new Customer();
	
				
		// Here we are setting values using our setter methods inside our Customer.java
		customer1.setName(userName);
		customer1.setEmail(userEmail);
		customer1.setAddress(userAddress);
		customer1.setAddress(userPhone);
				
		// Here we are grabbing the values using our getter methods inside our Customer.java
		System.out.println(customer1.getName());
		System.out.println(customer1.getEmail());
		System.out.println(customer1.getAddress());
		System.out.println(customer1.getPhone());
		System.out.println();
	}
}
