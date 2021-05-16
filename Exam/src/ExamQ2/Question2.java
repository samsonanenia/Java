package ExamQ2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        //Write a program that accepts mark of a student and prints the grade
        //If the average of marks is >= 90 then prints Grade ‘A’
        //If the average of mark is >=80 then prints Grade ‘B’
        //If the average of mark is >=70 then prints Grade ‘C’
        //If the average of mark is >=50 then prints Grade ‘D’
        //else prints Grade ‘F’
        //Note: Mark of a student should be between 0 and 100

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mark ");
        while (true) {
            try {
                int mark = input.nextInt();

                if (mark <= 100 && mark >= 0) {
                    if (mark >= 90) {
                        System.out.println("Your Grade is A");
                    } else if (mark >= 80) {
                        System.out.println("Your Grade is B");
                    } else if (mark >= 70) {
                        System.out.println("Your Grade is C");
                    } else if (mark >= 50) {
                        System.out.println("Your Grade is D");
                    } else {
                        System.out.println("Your Grade is F");
                    }
                } else {
                    System.out.println("You entered the wrong number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception");
                input.next();
                System.out.print("That’s not an integer. Try again: ");
            }
        }
    }
}
