package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) 
	{
		int num1, num2, option = 0;
		
		Scanner input = new Scanner(System.in);
		
		do 
		{
			try {
		
		System.out.print("Enter your Options: 1 = Add, 2 = Subtract, 3 = Multiple, 4 = Divide, 0 = Exit :");
		option = input.nextInt();
		
		//input.close();
			switch (option) 
			{
			case 1:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + add( num1,num2));
				System.out.println();
				break;
			case 2:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + subtract( num1,num2));
				System.out.println();
				break;
			case 3:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + multiple( num1, num2));
				System.out.println();
				break;
			case 4:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + divide( num1, num2));
				System.out.println();
				break;
			case 0:
				System.out.println("You're exit out from calculator program!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Entry, Try Again");
			}
			} catch (InputMismatchException e) {
				System.out.println("please input the number, not " +e.getMessage());
				continue;
			}
		} while (option != 0);
		
	}
	
		public static int add(int n1, int n2)
		{
			int result = n1 + n2;
			return result;
		}
		public static int subtract(int n1, int n2)
		{
			int result = n1 - n2;
			return result;
		}
		public static int multiple(int n1, int n2)
		{
			int result = n1 * n2;
			return result;
		}
		public static int divide(int n1, int n2)
		{
			int result = n1 / n2;
			return result;
		}

}
