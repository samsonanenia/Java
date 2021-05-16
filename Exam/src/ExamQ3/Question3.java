package ExamQ3;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        //Write a program that takes a number and prints n row pyramid accordingly
        //For example: if a user inputs 3, it prints the below three ‘*’ in three rows
        //*
        //**
        //***
        //If the user inputs 5, then it prints 5 rows as pyramid
        //*
        //**
        //***
        //****
        //*****

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
