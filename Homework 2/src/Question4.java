import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = input.nextInt();

        if (a >= 18) {
            System.out.println("Your are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
