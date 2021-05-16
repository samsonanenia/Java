package ExamQ1;

import java.text.DecimalFormat;

public class Question1 {
    public static void main(String[] args) {
        //Write a program that have variables
        //Name (String)
        //city_and_state (String)
        //gross salary (double)
        //tax (double) = 0.2
        //net_salary(double)
        ////Tax is always 20%.
        //And print out the following.
        //Eg: Hello my name is John Doe, I live in Charlotte NC,
        // my gross salary is $100,000. I pay $20,000 in tax and I take home $80,000.

        // Using the DecimalFormat class, which is part of Java
        DecimalFormat chosenFormat = new DecimalFormat("#,###");

    String name = "John Doe";
    String city_and_state = "Charlotte NC";
    double gross_salary = 100000;
    double net_salary = gross_salary * 0.8;
    double tax = gross_salary * 0.2;


        System.out.println(" Hello my name is " + name + " I live in " + city_and_state + ", " +
                 "my gross salary is $" +  (chosenFormat.format(gross_salary)) + ". I pay $" + (chosenFormat.format(tax)) + " in tax and I take home $" + (chosenFormat.format(net_salary)));

    }

}
