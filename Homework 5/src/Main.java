import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = input.nextLine();
        System.out.println("Enter sides: ");
        int sides = input.nextInt();




        Polygon polygon = new Polygon();
        Polygon triangle = new Polygon();
        Polygon rectangle = new Polygon();

        ThreeDimentionalShape _3d = new ThreeDimentionalShape();
        _3d.height(6);
        _3d.sd(3);
        _3d.co("yellow");

        polygon.sd(sides);
        polygon.co(color);

        triangle.sd(sides);
        triangle.co(color);

        rectangle.sd(sides);
        rectangle.co(color);



    }
}
