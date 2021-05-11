import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // Write a Java program to get a number from the user
        // and print whether it is positive or negative


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        if (a > 0) {
            System.out.println("You entered Positive number");
        } else {
            System.out.println("You entered Negative number");
        }
    }
}
