import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int check = input.nextInt();
        int[] numbers = {3,5,6,8,2,7,4};
        boolean found = false;
        for (int i : numbers) {
            if (i == check) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(check + " is found.");
        else
            System.out.println(check + " is not found.");
    }
}
