import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int x = input.nextInt();
        int num = x;
        int counter = 0;
        do{

            counter++;
            if(x % 2 == 0){
                System.out.println(x);
            }
            --x;
        }while(counter < num);
    }
}
