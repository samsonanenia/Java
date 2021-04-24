import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // write your code here
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
