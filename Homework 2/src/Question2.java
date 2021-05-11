import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        //Write a Java program to check if an input string starts with “T”.
        // If it is start with “T” print “Yes that is the string”,
        // otherwise print “That is not the one”.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String name = input.nextLine();

        char firstL = name.charAt(0);

        if(name == ""){
            System.out.println("It's empty");
        }
        else if(firstL == 'T'){
            System.out.println("Yes that is the string");
        }
        else{
            System.out.println("The string doesn't start with T");
        }
    }
}
