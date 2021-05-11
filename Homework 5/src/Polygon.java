public class Polygon {

    String color;
    int sides;


    public Polygon(String color, int sides){
        this.color = color;
        this.sides = sides;
    }
    //Getters and setters are used to protect data
    public String getColor() {
        return color;
    }

    public int getSides() {
        return sides;
    }

    public static int sd(int sides){
        System.out.println("The Sides are: "+ sides);
        return sides;
    }
    public static String co(String color){
        System.out.println("The color is: " + color);
        return color;
    }

}
