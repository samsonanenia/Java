package ExamQ4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Write a program that takes a string and displays the vowels count in the input string.
        //Vowels are: a, e, i, o, u
        //Example: 	Input:  africa
        //output :  3
        //input : sky
        //Output : 0
        // 	//use the String methods, charAt, and contains.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str = input.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
            str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
