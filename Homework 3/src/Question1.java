public class Question1 {
    public static void main(String[] args) {
        //Write a java program to calculate the sum
        // of first 10 integers. The program should calculate the sum using for loop.
        int sum = 0;

        for(int i = 0; i <= 10; i++)
        {

            sum = sum + i;
        }
        System.out.println("The Sum of the first 10 integers is: " + sum);
    }
}
