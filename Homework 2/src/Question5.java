import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        //Write a Java program which reads two integers
        // from the user and prints the sum and difference both in their own line.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        int c = a + b;
        double d = a / b;

        System.out.println("The Sum of " + a + " and " + b + " is " + c);
        System.out.println("The Difference of " + a + " and " + b + " is " + d);

    }
}
