//import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

// public class AfternoonLab {
//     public static void main(String name[]) {
//         System.out.println("Hello " +name[0]+ name[1]);
//     }
// }
//Practice variables and conditions:

//1. Add, subtract, multiply, and divide (quotient & remainder) two numbers and display the output
public class AfternoonLab{
    public static void main(String args[]) {
        int numOne = 3;
        int numTwo = 4;
        // System.out.println(numOne+numTwo);
        // System.out.println(numOne-numTwo);
        // System.out.println(numOne*numTwo);
        // System.out.println(numOne/numTwo);
        // System.out.println(numOne%numTwo);
//2. Swap two numbers: Store two numbers in separate variables, display their initial values, swap them, and display them again.
        int temp = numOne;
        numOne = numTwo;
        numTwo = temp;
        System.out.println(numOne);
        System.out.println(numTwo);
//3. Display the average of five numbers: Create five separate variables holding different numbers and find the average
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int average = (one+two+three+four+five)/5;
        System.out.println(average);

//4. Write a Java program that display the larger of two integers. Store these numbers in variables.

        int larger = Math.max(one, two);
        System.out.println(larger);

//5. Display the largest of three numbers.
        int num1 = 20;
        int num2 = 10;
        int num3 = 30;
        if(num1 >= num2 && num1 >= num3 ) {
            System.out.println(num1 + " is the lasrgest numbers");
        } else if ( num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the lasrgest numbers");
        } else {
            System.out.println(num3 + " is the lasrgest numbers");
        }

//6. Determine if a number is negative, positive, or zero.


//7. Determine if a number is even or odd. 

//8. Store a value in a variable called age. Determine if a person with the given age is eligible to vote (18 years old)

    }
}









 

 


