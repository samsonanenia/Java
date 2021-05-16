package ExamQ5;
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        //Write a program that validates a phone number input,  make sure the length of the input is 10 digits
        //Example: 	“6414514473” - Valid phone number
        //	        “62354609845454” -	Invalid phone number (too long)
        //			“56454”	Invalid phone number (too short)


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number");
        Long phoneNum = input.nextLong();

        Long length = (long)(Math.log10(phoneNum)+1);

        System.out.println("length: " + length);

        if (length == 10){
            System.out.println("Valid phone number");
        }
        else if(length > 10){
            System.out.println("Invalid phone number (too long)");
        }
        else{
            System.out.println("Invalid phone number (too short)");
        }

    }
}
