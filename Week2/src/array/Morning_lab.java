package array;

import java.util.Arrays;
import java.util.Scanner;

public class Morning_lab {
/*
 * Arrays practice:

 

1) Display the average of a given integer array 

2) Display the number of times a user entered string is found in the given string array. 

3) Copy one array into another (without any built-in method) and display the new array
 */
	public static void main(String[] args) {
	
		int[] array = {1,2,3,4,5};
		int sum = 0;
		double average;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum/array.length;
		System.out.println(average);
	//2		​
		Scanner scanner = new Scanner(System.in);
					
		String stringOfWords;
		String arrayOfWords[] = {};
		String word;
					
		System.out.println("Enter the words in the array: ");
		stringOfWords= scanner.nextLine();
		arrayOfWords = stringOfWords.split(" ");		
		System.out.println("Enter a word: ");
		word = scanner.nextLine();
		int counter = 0;
			for (int i = 0; i < arrayOfWords.length; i++) {
				if (word.equalsIgnoreCase(arrayOfWords[i]))
							counter++;
			}
			System.out.printf("%n The name %s is found %d times on the array %s", word, counter, Arrays.toString(arrayOfWords));
			scanner.close();
				
			
		
	// 3.
		System.out.println();
		int[] array1 = new int[array.length];
		array1 = array;
		for (int i=0; i < array.length; i++)
			{
				array1[i] = array[i];
				System.out.print(array1[i] + " ");
			}
		
	}
}


