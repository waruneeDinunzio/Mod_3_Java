package exception;

public class ExceptionHandler {

	public static void main(String[] args) {
		int num = 45;
		int result = 0;
		String s = "abc";
		
		// In here we trying to convert our string into an integer
		// We will get an exception
		try {
			System.out.println(Integer.parseInt(s));
		} catch(NumberFormatException nfex) {
			System.out.println(s + " cannot be converted into a number " + nfex.getMessage());
		}
		
		// We are trying to divide 45 by zero and it will automatically throw an exception
		try {
			result = num/0;
		} catch(ArithmeticException aex) {
			System.out.println("Number cannot be divided by 0 " + aex.getMessage());
		}
		
		System.out.println("The result is: " + result);
	}
	
}
