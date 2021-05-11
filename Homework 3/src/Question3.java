import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Write a program that takes integer input ( 1 to 7)  from the a user ,
        // 1 representing Monday to 7 representing Sunday. The program should
        // decide whether the day input is a weekend or a weekday.(Use switch statement)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        if(day <= 0){
            System.out.println("Invalid");
        }
        else if(day <= 5){
            System.out.println("It's Weekday");
        }
        else if(day == 6 || day == 7){
            System.out.println("It's the weened");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
