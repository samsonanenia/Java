import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        //Write a program that takes a positive integer
        // input and prints all the positive even number
        // less than the number in order from big to small.(Use do while loop)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int x = input.nextInt();
        //int num = x;
       // int counter = 0;
        do{

           // counter++;
            --x;
            if(x % 2 == 0){
                System.out.println(x);
            }

        }while(x > 1);
    }
}
