import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Use while loop and create a program that calculates
        // the average of thenumbers between x and y. x and y
        // are the integers the user has to input

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = input.nextInt();
        System.out.println("Enter y : ");
        int y = input.nextInt();
        int average= 0;

        while(true){
            average = (x + y) / 2;
            System.out.println("The Average is: " + average);
            break;
        }

    }
}
