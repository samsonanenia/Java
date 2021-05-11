import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Write a java program that has a Polygon class with a property Sides and color.
        // In the main class create 3 objects triangle, rectangle and polygon.
        // 2.Modify your code from question 1 by adding a constructor for the Polygon class
        // and user should pass the values for Sides and color during the initialization.
        //
        // 3.Modify your code from question 1 by adding two methods to display the number of sides
        // and color of the polygon object created. In the main class call the methods for every
        // object you have created.4.Create a ThreeDimentionalShape class inheriting from Polygon class.
        // Add height property, create a constructor with Sides , color and Height.Add a method to display the height.
        // 5.In the main class create a rectangular 3D object and call all the methods to display all the properties.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = input.nextLine();
        System.out.println("Enter sides: ");
        int sides = input.nextInt();

        Polygon polygon = new Polygon(color, sides);
        Polygon triangle = new Polygon(color, sides);
        Polygon rectangle = new Polygon(color, sides);

        System.out.println("The Polygon color is: " + polygon.color);
        System.out.println("This Polygon sides are: " + polygon.sides);

        System.out.println("The Triangle color is: " + triangle.color);
        System.out.println("This Triangle sides are: " + triangle.sides);

        System.out.println("The Rectangle color is: " + rectangle.color);
        System.out.println("This Rectangle sides are: " + rectangle.sides);


        System.out.println("----------------3D-------------");
        ThreeDimentionalShape _3d = new ThreeDimentionalShape("Red", 5);
        _3d.height(6);
        _3d.sd(3);
        _3d.co("yellow");


       // rectangle.sd(sides);
      //  rectangle.co(color);

    }
}
